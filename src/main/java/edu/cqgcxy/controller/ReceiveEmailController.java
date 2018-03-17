package edu.cqgcxy.controller;

import edu.cqgcxy.model.ReceiveEmail;
import edu.cqgcxy.model.Report;
import edu.cqgcxy.model.SendEmail;
import edu.cqgcxy.model.User;
import edu.cqgcxy.service.ReceiveEmailBox;
import edu.cqgcxy.service.ReportService;
import edu.cqgcxy.service.SendEmailBox;
import edu.cqgcxy.service.UserService;

import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.logging.Logger;


@Controller
public class ReceiveEmailController {

    private static Logger logger = Logger.getLogger("ReceiveEmailController");

    @Autowired
    private ReceiveEmailBox receiveEmailBox;

    @Autowired
    private SendEmailBox sendEmailBox;

    @Autowired
    private UserService userService;

    @Autowired
    private ReportService reportService;

    //跳转回信界面

    @RequestMapping(value = "reply",produces = {"application/json;charset=UTF-8"})
    public String reply( @Param("receiveEmailID") int receiveEmailID, ModelMap modelMap){
        ReceiveEmail receiveEmail = receiveEmailBox.findByID(receiveEmailID);
        modelMap.addAttribute("receiveEmail",receiveEmail);
        return "user/reply";
    }

    //跳转未读界面

    @RequestMapping(value = "unread",produces = {"application/json;charset=UTF-8"})
    public String unread(HttpServletRequest request,ModelMap map){
        HttpSession session = request.getSession();
        User user = (User) session.getAttribute("user");
        long countUnreadEmail = receiveEmailBox.countUnreadEmail(user.getPhone());
        List<ReceiveEmail> receiveEmails = receiveEmailBox.findUnReadEmail(user.getPhone());

        map.addAttribute("receiveEmails",receiveEmails);
        map.addAttribute("countUnreadEmail",countUnreadEmail);
        return "user/unread";
    }

    //回信

    @ResponseBody
    @RequestMapping(value = "doReply",produces = {"application/json;charset=UTF-8"})
    public int doReply(HttpServletRequest request,ReceiveEmail receiveEmail){
        SendEmail sendEmail = new SendEmail();
        HttpSession session = request.getSession();
        User user = (User)session.getAttribute("user");

        ReceiveEmail aReceiveEmail =receiveEmailBox.findByID(receiveEmail.getReceiveemailid());

        sendEmail.setSign(aReceiveEmail.getSign());
        sendEmail.setSendtime(new Date());
        sendEmail.setTitle(receiveEmail.getTitle());
        sendEmail.setUserid(user.getUserid());
        sendEmail.setMessage(receiveEmail.getMessage());
        sendEmail.setReceiveperson(receiveEmail.getUserphone()+"@193.com");
        sendEmailBox.insertEmail(sendEmail);

        receiveEmail.setReceiveemailid(null);
        receiveEmail.setSign(aReceiveEmail.getSign());
        receiveEmail.setSendphone(user.getPhone());
        receiveEmail.setSendtime(sendEmail.getSendtime());
        receiveEmail.setIsread(0);
        receiveEmail.setIssave(0);
        receiveEmail.setIsdel(0);
        receiveEmailBox.sendEmail(receiveEmail);

        return 1;
    }

    //彻底删除信件

    @ResponseBody
    @RequestMapping(value = "deleteReceiveEmail",produces = {"application/json;charset=UTF-8"})
    public int deleteEmail(HttpServletRequest request,String num){
        HttpSession session = request.getSession();
        User user = (User) session.getAttribute("user");
        logger.info("用户"+user.getPhone()+"尝试删除来信ID为"+num+"的邮件");

        if(num.contains("\"")) {

            String nb = num.replaceAll("\"", "");
            int n;
            do {
                nb = nb.substring(1, nb.length());
                if (!nb.contains(",")) {
                    n = Integer.parseInt(nb.substring(0, nb.length() - 1));
                    nb = "over";
                } else {
                    n = Integer.parseInt(nb.substring(0, nb.indexOf(",")));

                    nb = nb.substring(nb.indexOf(","), nb.length());
                }
                receiveEmailBox.deleteReceiveEmail(n);
            } while (!"over".equals(nb));
        }else {
            receiveEmailBox.deleteReceiveEmail(Integer.parseInt(num));
        }
        return 1;
    }

    @ResponseBody
    @RequestMapping(value = "readReceiveEmail",produces = {"application/json;charset=UTF-8"})
    public int readReceiveEmail(HttpServletRequest request,String num){
        HttpSession session = request.getSession();
        User user = (User) session.getAttribute("user");

        ReceiveEmail receiveEmail = new ReceiveEmail();
        String nb = num.replaceAll("\"","");
        logger.info("用户"+user.getPhone()+"标记ID为"+nb+"的信件为已读");
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
            receiveEmail.setReceiveemailid(n);
            receiveEmail.setIsread(1);
            receiveEmailBox.updateReadStatus(receiveEmail);
        }while (!"over".equals(nb));

        return 1;
    }

    @ResponseBody
    @RequestMapping(value = "updateDelete",produces = {"application/json;charset=UTF-8"})
    public int updateDelete(HttpServletRequest request,String num){
        HttpSession session = request.getSession();
        User user = (User) session.getAttribute("user");
        ReceiveEmail receiveEmail = new ReceiveEmail();

//        判断是单个还是多个进行删除
        if(num.contains("\"")) {

            String nb = num.replaceAll("\"", "");
            logger.info("用户" + user.getPhone() + "标记ID为" + nb + "的信件为删除");

            int n;
            do {
                nb = nb.substring(1, nb.length());
                if (!nb.contains(",")) {
                    n = Integer.parseInt(nb.substring(0, nb.length() - 1));
                    nb = "over";
                } else {
                    n = Integer.parseInt(nb.substring(0, nb.indexOf(",")));

                    nb = nb.substring(nb.indexOf(","), nb.length());
                }
                receiveEmail.setReceiveemailid(n);
                receiveEmail.setIsdel(1);
                receiveEmailBox.updateDeleteStatus(receiveEmail);
            } while (!"over".equals(nb));
        }else {
            receiveEmail.setReceiveemailid(Integer.parseInt(num));
            receiveEmail.setIsdel(1);
            receiveEmailBox.updateDeleteStatus(receiveEmail);
        }

        return 1;
    }

    @ResponseBody
    @RequestMapping(value = "backReceiveEmail",produces = {"application/json;charset=UTF-8"})
    public int backReceiveEmail(HttpServletRequest request,String num){
        HttpSession session = request.getSession();
        User user = (User) session.getAttribute("user");
        ReceiveEmail receiveEmail = new ReceiveEmail();

        String nb = num.replaceAll("\"","");
        logger.info("用户"+user.getPhone()+"标记ID为"+nb+"的信件为未删除");

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
            receiveEmail.setReceiveemailid(n);
            receiveEmail.setIsdel(0);
            receiveEmailBox.updateDeleteStatus(receiveEmail);
        }while (!"over".equals(nb));


        return 1;
    }

    @RequestMapping(value = "editReceive",produces = {"application/json;charset=UTF-8"})
    public String editReceive(String id,ModelMap modelMap){

        logger.info("进入方法editReceive"+Integer.parseInt(id));
        int aid = Integer.parseInt(id);

        ReceiveEmail receiveEmail= receiveEmailBox.findByID(aid);
        modelMap.addAttribute("receiveEmail",receiveEmail);
        return "user/editReceive";
    }

    @RequestMapping(value = "doForwardReceive",produces = {"application/json;charset=UTF-8"})
    public String doForwardReceive(String num,ModelMap modelMap,HttpServletRequest request){
        HttpSession session = request.getSession();
        User user = (User) session.getAttribute("user");
        List<ReceiveEmail> receiveEmails = new ArrayList<>();

        String nb = num.replaceAll("\"","");
        logger.info("用户"+user.getPhone()+"转发邮件,邮件ID为"+nb);

        int n;
        do{
            nb = nb.substring(1,nb.length());
            if(!nb.contains(",")){
                n = Integer.parseInt(nb.substring(0,nb.length()-1));
                nb = "over";
                logger.info("over");
            }else {
                n = Integer.parseInt(nb.substring(0,nb.indexOf(",")));

                nb = nb.substring(nb.indexOf(","),nb.length());
            }
            receiveEmails.add(receiveEmailBox.findByID(n));

        }while (!"over".equals(nb));

        modelMap.addAttribute("receiveEmails",receiveEmails);
        return "user/forWard";
    }

    //举报
    @ResponseBody
    @RequestMapping(value = "reportPerson",produces = {"application/json;charset=UTF-8"})
    public int reportPerson(int id,HttpServletRequest request){
        HttpSession session = request.getSession();
        User user =(User)session.getAttribute("user");
        Report rep = reportService.findByUserIDAndReEmlID(user.getUserid(),id);
        if(rep == null){
            ReceiveEmail receiveEmail = receiveEmailBox.findByID(id);
            int isreport = reportService.findByUserID(user.getUserid(),receiveEmail.getSendphone());
            Report report = new Report();
            report.setReportemailid(id);
            report.setReportphone(receiveEmail.getSendphone());
            report.setUserid(user.getUserid());
            reportService.insert(report);
            if( isreport ==0){
            User u = userService.findByPhone(receiveEmail.getSendphone());
            u.setComplaintCount(u.getComplaintCount()+1);
            userService.updataReport(u);
            }
            return 1;
        }else {
            return 2;
        }

    }
}
