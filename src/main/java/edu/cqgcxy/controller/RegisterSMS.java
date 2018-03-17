package edu.cqgcxy.controller;

import edu.cqgcxy.client.AbsRestClient;
import edu.cqgcxy.client.JsonReqClient;
import edu.cqgcxy.client.XmlReqClient;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.util.Random;


@Controller
public class RegisterSMS {
    private final String accountSid="cde0a69da5e866f75944fe587cdff141";
    private final String token="752b3e32a541922f11c9a682a8fef738";
    private final String appId="28fa6f1433a949b4a52c6e41678e4c03";
    private final String templateId="250386";
    private final String templateId2="291394";


    static AbsRestClient InstantiationRestAPI(boolean enable) {
        if(enable) {
            return new JsonReqClient();
        } else {
            return new XmlReqClient();
        }
    }

    public static void testTemplateSMS(boolean json,String accountSid,String authToken,String appId,String templateId,String to,String param){
        try {
            String result=InstantiationRestAPI(json).templateSMS(accountSid, authToken, appId, templateId, to, param);
            System.out.println("Response content is: " + result);
        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
        }
    }

    public String sendNumber(){
        //生成4位随机数
        String words ="1234567890";
        StringBuffer para = new StringBuffer();
        Random random = new Random();
        for (int i = 0; i < 4; i++) {
            int index = random.nextInt(words.length());
            para.append(index);
        }
        return para.toString();
    }

    @ResponseBody
    @RequestMapping("sms")
    public int register(@RequestParam(value = "phone")String phone, HttpServletRequest request, HttpServletResponse response){


            boolean json=true;
            String to = phone;
            String para = sendNumber();
            testTemplateSMS(json, accountSid,token,appId, templateId,to,para);
            HttpSession session = request.getSession();
            session.setAttribute("para",para);
            System.out.println("生成的验证码:" + para);
            //短信发送接口
            return 1;
    }

    @ResponseBody
    @RequestMapping("admin/smsAdmin")
    public int registerAdmin(@RequestParam(value = "phone")String phone, HttpServletRequest request, HttpServletResponse response){


        boolean json = true;
        String to = phone;
        String para = sendNumber();
        testTemplateSMS(json, accountSid,token,appId, templateId2,to,para);
        HttpSession session = request.getSession();
        session.setAttribute("paraAdmin",para);
        System.out.println("生成的验证码:" + para);
        //短信发送接口
        return 1;
    }
}
