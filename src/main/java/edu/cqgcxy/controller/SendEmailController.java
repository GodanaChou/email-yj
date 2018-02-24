package edu.cqgcxy.controller;

import edu.cqgcxy.model.ReceiveEmail;
import edu.cqgcxy.model.RemoveReceivePerson;
import edu.cqgcxy.model.SendEmail;
import edu.cqgcxy.model.User;
import edu.cqgcxy.service.ReceiveEmailBox;
import edu.cqgcxy.service.SendEmailBox;
import edu.cqgcxy.util.EncryptUtil;
import edu.cqgcxy.util.RemoveReceivePersonUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.logging.Logger;

@Controller
public class SendEmailController {

    private static Logger logger = Logger.getLogger("SendEmailController");

    @Autowired
    private SendEmailBox sendEmailBox;

    @Autowired
    private ReceiveEmailBox receiveEmailBox;


    @RequestMapping(value = "send",produces = {"application/json;charset=UTF-8"})
    public String send(HttpServletRequest request, ModelMap modelMap){
        HttpSession session = request.getSession();
        User user = (User)session.getAttribute("user");

        List<SendEmail> sendEmails = sendEmailBox.findSendEmailByUserID(user.getUserid());
        int num = sendEmails.size();
        modelMap.addAttribute("anum",num);
        modelMap.addAttribute("sendEmails",sendEmails);
        return "user/send";
    }

    @ResponseBody
    @RequestMapping(value = "sendEmail" ,produces = {"application/json;charset=UTF-8"})
    public String sendEmail(HttpServletRequest request,SendEmail sendEmail){
        HttpSession session = request.getSession();
        User user = (User)session.getAttribute("user");
        sendEmail.setUserid(user.getUserid());
        sendEmail.setSendtime(new Date());
        sendEmail.setSign(new EncryptUtil().UUID());
        logger.info("用户: "+user.getPhone()+"  发送邮件至 "+
                sendEmail.getReceiveperson()+"   "+"发送时间: "+sendEmail.getSendtime()
                +"  发送内容:  "+sendEmail.getMessage());
        sendEmailBox.insertEmail(sendEmail);

        ReceiveEmail receiveEmail = new ReceiveEmail();
        receiveEmail.setSendphone(user.getPhone());
        receiveEmail.setTitle(sendEmail.getTitle());
        receiveEmail.setSendtime(sendEmail.getSendtime());
        receiveEmail.setMessage(sendEmail.getMessage());
        receiveEmail.setSign(sendEmail.getSign());
        receiveEmail.setIsread(0);
        receiveEmail.setIsdel(0);
        receiveEmail.setIssave(0);

        //拆分收件人,分别发送
        RemoveReceivePersonUtil removeReceivePersonUtil = new RemoveReceivePersonUtil();
        List<RemoveReceivePerson> removeReceivePerson=  removeReceivePersonUtil.remove(sendEmail.getReceiveperson());
        for( Iterator iter = removeReceivePerson.iterator();iter.hasNext();){
            RemoveReceivePerson removeReceivePerson1 = (RemoveReceivePerson) iter.next();
            receiveEmail.setUserphone(removeReceivePerson1.getPerson());
            receiveEmailBox.sendEmail(receiveEmail);
            logger.info(removeReceivePerson1.getPerson()+removeReceivePerson1.getType());
        }

        return "hello";
    }


    @RequestMapping(value = "read1",produces = {"application/json;charset=UTF-8"})
    public String read1(int sendEmailID,ModelMap modelMap){
        modelMap.addAttribute("sendEmail",sendEmailBox.findByEmailID(sendEmailID));
        return "user/read1";
    }

    @ResponseBody
    @RequestMapping(value = "deleteSendEmail",produces = "application/json;charset=UTF-8")
    public int deleteSendEmail(int sendEmailID){
        sendEmailBox.deleteEmail(sendEmailID);
        return 1;
    }

    @ResponseBody
    @RequestMapping(value = "deleteSendEmails",produces = "application/json;charset=UTF-8")
    public int deleteSendEmails(String num,HttpServletRequest request){
        HttpSession session = request.getSession();
        User user = (User)session.getAttribute("user");
        String nb = num.replaceAll("\"","");
        logger.info("用户 "+user.getPhone()+" 删除邮件  邮件ID为:"+nb);
        int n;
        do{
            nb = nb.substring(1,nb.length());
            if(!nb.contains(",")){
                n = Integer.parseInt(nb.substring(0,nb.length()-1));
                nb = "over";
            }else {
                n = Integer.parseInt(nb.substring(0,nb.indexOf(",")));

                nb = nb.substring(nb.indexOf(","),nb.length());
            }
            sendEmailBox.deleteEmail(n);
        }while (!"over".equals(nb));

        return 1;
    }

    @ResponseBody
    @RequestMapping(value = "updateSendEmailsDel",produces = "application/json;charset=UTF-8")
    public int updateSendEmailsDel(String num,HttpServletRequest request){
        HttpSession session = request.getSession();
        User user = (User)session.getAttribute("user");

        SendEmail sendEmail = new SendEmail();
        String nb = num.replaceAll("\"","");
        logger.info("用户: "+user.getPhone()+" 更新邮件ID为"+nb+"的状态为删除   ");
        int n;
        do{
            nb = nb.substring(1,nb.length());
            if(!nb.contains(",")){
                n = Integer.parseInt(nb.substring(0,nb.length()-1));

                sendEmail.setSendemailid(n);
                sendEmail.setIsdel(1);
                nb = "over";
            }else {
                n = Integer.parseInt(nb.substring(0,nb.indexOf(",")));
                sendEmail.setSendemailid(n);
                sendEmail.setIsdel(1);
                nb = nb.substring(nb.indexOf(","),nb.length());
            }
           sendEmailBox.updateEmail(sendEmail);
        }while (!"over".equals(nb));
        return 1;
    }
}
