package edu.cqgcxy.controller;

import edu.cqgcxy.model.ReceiveEmail;
import edu.cqgcxy.model.RemoveReceivePerson;
import edu.cqgcxy.model.SendEmail;
import edu.cqgcxy.model.User;
import edu.cqgcxy.service.ReceiveEmailBox;
import edu.cqgcxy.service.SendEmailBox;
import edu.cqgcxy.util.RemoveReceivePersonUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
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

    @ResponseBody
    @RequestMapping(value = "sendEmail" ,produces = {"application/json;charset=UTF-8"})
    public String sendEmail(HttpServletRequest request,SendEmail sendEmail){
        HttpSession session = request.getSession();
        User user = (User)session.getAttribute("user");
        sendEmail.setUserid(user.getUserid());
        sendEmail.setSendtime(new Date());
        logger.info("用户: "+user.getPhone()+"  发送邮件至 "+
                sendEmail.getReceiveperson()+"   "+"发送时间: "+sendEmail.getSendtime()
                +"  发送内容:  "+sendEmail.getMessage());
        sendEmailBox.insertEmail(sendEmail);

        ReceiveEmail receiveEmail = new ReceiveEmail();
        receiveEmail.setSendphone(user.getPhone());
        receiveEmail.setTitle(sendEmail.getTitle());
        receiveEmail.setSendtime(sendEmail.getSendtime());
        receiveEmail.setMessage(sendEmail.getMessage());
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
}
