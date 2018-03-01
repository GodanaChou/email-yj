package edu.cqgcxy.controller;

import edu.cqgcxy.model.ReceiveEmail;
import edu.cqgcxy.model.SendEmail;
import edu.cqgcxy.model.User;
import edu.cqgcxy.service.ReceiveEmailBox;
import edu.cqgcxy.service.SendEmailBox;
import edu.cqgcxy.service.UserService;
import edu.cqgcxy.util.EncryptUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.websocket.server.PathParam;
import java.util.Date;
import java.util.List;
import java.util.logging.Logger;


@Controller
public class UserController {

    @Autowired
    private UserService userService;

    @Autowired
    private SendEmailBox sendEmailBox;

    @Autowired
    private ReceiveEmailBox receiveEmailBox;

    private static Logger logger = Logger.getLogger("UserController");

    @RequestMapping(value = "login",produces = {"application/json;charset=UTF-8"})
    public String login(){
        return "user/login";
    }

    @RequestMapping(value = "register",produces = {"application/json;charset=UTF-8"})
    public String register(){
        return "user/register";
    }

    @ResponseBody
    @RequestMapping(value = "doRegister",produces = {"application/json;charset=UTF-8"})
    public int doRegister(String phone,String password,String num,HttpServletRequest request) throws Exception {
        User auser = new User();
        User user = userService.findByPhone(phone);
        HttpSession session = request.getSession();
        String para = (String) session.getAttribute("para");
        if(user == null && para.equals(num)){
            auser.setPhone(phone);
            auser.setPassword(password);
            userService.addUser(auser);
            return 1;
        }else {
            return 0;
        }

    }

    @ResponseBody
    @RequestMapping(value = "registerSMS1",produces = {"application/json;charset=UTF-8"})
    public int registerSMS1(){
        return 0;
    }


    @RequestMapping(value = "registerSMS",produces = {"application/json;charset=UTF-8"})
    public String registerSMS(String phone, RedirectAttributes redirectAttributes){
        User user = userService.findByPhone(phone);
        if(user == null){
            redirectAttributes.addAttribute("phone",phone);
            return "redirect:sms";
        }else {
            return "redirect:registerSMS1";
        }
    }

    @ResponseBody
    @RequestMapping(value = "doLogin",produces = {"application/json;charset=UTF-8"})
    public String doLogin(@RequestParam(value = "name") String name,
                          @RequestParam(value = "password") String password,
                          HttpServletRequest request)
            throws Exception {

        User user = new User();
        user.setPhone(name);
        user.setPassword(password);

        HttpSession session = request.getSession();
        User u = userService.findByPhoneAndPSW(user);
        if (u == null){
            logger.info("登录失败");
            return "2";
        }else {
            session.setAttribute("user",u);
            logger.info("用户" + u.getPhone()+"登录"+ new Date());
            return "1";
        }

    }

    @ResponseBody
    @RequestMapping(value = "/add", produces = {"application/json;charset=UTF-8"})
    public String addUser(User user) throws Exception {
        userService.addUser(user);
        return "r";
    }

    @RequestMapping(value = "/all/{pageNum}/{pageSize}", produces = {"application/json;charset=UTF-8"})
    public ModelAndView findAllUser(@PathVariable("pageNum") int pageNum, @PathVariable("pageSize") int pageSize){
        ModelAndView modelAndView = new ModelAndView();
        List<User> userList = userService.findAllUser(pageNum,pageSize);

        modelAndView.addObject("User",userList);
        modelAndView.setViewName("admin/userList");
        return modelAndView;
    }

    @RequestMapping(value = "index",produces = {"application/json;charset=UTF-8"})
    public String index(HttpServletRequest request, ModelMap modelMap) throws Exception {
        HttpSession session = request.getSession();

        //
        User user1 = new User();
        user1.setPhone("18883993870");
        user1.setPassword("123456");
        User u = userService.findByPhoneAndPSW(user1);
        session.setAttribute("user",u);
        //

        User user = (User) session.getAttribute("user");
        modelMap.addAttribute("user",user);
        return "user/index";
    }

    @RequestMapping(value = "center",produces = {"application/json;charset=UTF-8"})
    public String center(ModelMap map,HttpServletRequest request){
        HttpSession session = request.getSession();
        User user = (User) session.getAttribute("user");
        map.addAttribute("user",user);
        map.addAttribute("count",receiveEmailBox.countUnreadEmail(user.getPhone()));
        return "user/main";
    }

    //收件邮箱

    @RequestMapping(value = "get",produces = {"application/json;charset=UTF-8"})
    public String get(HttpServletRequest request,ModelMap modelMap){
        HttpSession session = request.getSession();
        User user = (User)session.getAttribute("user");
        Long countUnreadEmail=receiveEmailBox.countUnreadEmail(user.getPhone());
        List<ReceiveEmail> receiveEmails = receiveEmailBox.receiveEmail(user.getPhone());
        modelMap.addAttribute("countUnreadEmail",countUnreadEmail);
        modelMap.addAttribute("receiveEmails",receiveEmails);
        return "user/get";
    }

    @RequestMapping(value = "quit",produces = {"application/json;charset=UTF-8"})
    public String quit(HttpServletRequest request){
        HttpSession session = request.getSession();
        session.invalidate();
        return "user/login";
    }


    @RequestMapping(value = "draft",produces = {"application/json;charset=UTF-8"})
    public String draft(HttpServletRequest request,ModelMap modelMap){
        HttpSession session = request.getSession();
        User user = (User)session.getAttribute("user");
       List<SendEmail> sendEmails = sendEmailBox.findDraft(user.getUserid());
       int num = sendEmails.size();
       modelMap.addAttribute("sendEmails",sendEmails);
       modelMap.addAttribute("num",num);
        return "user/draft";
    }

    @RequestMapping(value = "delete",produces = {"application/json;charset=UTF-8"})
    public String delete(HttpServletRequest request,ModelMap modelMap){
        HttpSession session = request.getSession();
        User user = (User)session.getAttribute("user");

        List<ReceiveEmail> receiveEmails = receiveEmailBox.findDeleteEmail(user.getPhone());
        int num = receiveEmails.size();

        modelMap.addAttribute("receiveEmails",receiveEmails);
        modelMap.addAttribute("num",num);

        return "user/delete";
    }

    @RequestMapping(value = "deleteForReceive",produces = {"application/json;charset=UTF-8"})
    public String deleteForReceive(HttpServletRequest request,ModelMap modelMap){
        HttpSession session = request.getSession();
        User user = (User)session.getAttribute("user");

        List<SendEmail> sendEmails = sendEmailBox.findDelete(user.getUserid());

        int num = sendEmails.size();

        modelMap.addAttribute("sendEmails",sendEmails);

        modelMap.addAttribute("num",num);

        return "user/deleteReceive";
    }

    @RequestMapping(value = "write",produces = {"application/json;charset=UTF-8"})
    public String write(HttpServletRequest request,ModelMap map){
        HttpSession session = request.getSession();
        User user = (User) session.getAttribute("user");
        map.addAttribute("user",user.getUserid());
        return "user/write";
    }



    @RequestMapping(value = "friendAdd",produces = {"application/json;charset=UTF-8"})
    public String friendAdd(HttpServletRequest request){
        HttpSession session = request.getSession();
        return "user/friendAdd";
    }

    @RequestMapping(value = "edit",produces = {"application/json;charset=UTF-8"})
    public String edit(HttpServletRequest request,int id,ModelMap modelMap){
        HttpSession session = request.getSession();
        User user =(User)session.getAttribute("user");

        modelMap.addAttribute("sendEmail",sendEmailBox.findByEmailID(id));
        return "user/edit";
    }



    @RequestMapping(value = "groupMail",produces = {"application/json;charset=UTF-8"})
    public String groupMail(HttpServletRequest request,ModelMap map){
        HttpSession session = request.getSession();
        User user = (User) session.getAttribute("user");
        return "user/group_mail";
    }

    @RequestMapping(value = "read",produces = {"application/json;charset=UTF-8"})
    public String readMail(HttpServletRequest request,ModelMap map,@PathParam("receiveEmailID") String receiveEmailID){
        HttpSession session = request.getSession();
        User user = (User) session.getAttribute("user");
        ReceiveEmail receiveEmail = receiveEmailBox.findByID(Integer.parseInt(receiveEmailID));
        if (receiveEmail.getIsread()==0){
            ReceiveEmail aReceiveEmail = new ReceiveEmail();
            aReceiveEmail.setIsread(1);
            aReceiveEmail.setReceiveemailid(receiveEmail.getReceiveemailid());
            receiveEmailBox.updateReadStatus(aReceiveEmail);
        }
        map.addAttribute("receiveEmail",receiveEmail);
        return "user/read";
    }


}
