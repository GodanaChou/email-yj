package edu.cqgcxy.controller;

import edu.cqgcxy.model.User;
import edu.cqgcxy.service.ReceiveEmailBox;
import edu.cqgcxy.service.SendEmailBox;
import edu.cqgcxy.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
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

    @ResponseBody
    @RequestMapping(value = "doLogin",produces = {"application/json;charset=UTF-8"})
    public String doLogin(@RequestParam(value = "name") String name,
                          @RequestParam(value = "password") String password,
                          HttpServletRequest request, HttpServletResponse response)
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
    public String index(HttpServletRequest request, ModelMap modelMap){
        HttpSession session = request.getSession();
        User user = (User) session.getAttribute("user");
        modelMap.addAttribute("user",user);
        return "user/index";
    }

    @RequestMapping(value = "center",produces = {"application/json;charset=UTF-8"})
    public String center(ModelMap map,HttpServletRequest request){
        HttpSession session = request.getSession();
        User user = (User) session.getAttribute("user");
        map.addAttribute("user",user);
        map.addAttribute("count",receiveEmailBox.countUnreadEmail(user.getUserid()));
        return "user/main";
    }

    @RequestMapping(value = "get",produces = {"application/json;charset=UTF-8"})
    public String get(){
        return "user/get";
    }

    @RequestMapping(value = "quit",produces = {"application/json;charset=UTF-8"})
    public String quit(HttpServletRequest request){
        HttpSession session = request.getSession();
        session.invalidate();
        return "user/login";
    }

    @RequestMapping(value = "send",produces = {"application/json;charset=UTF-8"})
    public String send(HttpServletRequest request){
        HttpSession session = request.getSession();
        return "user/send";
    }

    @RequestMapping(value = "draft",produces = {"application/json;charset=UTF-8"})
    public String draft(HttpServletRequest request){
        HttpSession session = request.getSession();
        return "user/draft";
    }

    @RequestMapping(value = "delete",produces = {"application/json;charset=UTF-8"})
    public String delete(HttpServletRequest request){
        HttpSession session = request.getSession();
        return "user/delete";
    }

    @RequestMapping(value = "write",produces = {"application/json;charset=UTF-8"})
    public String write(HttpServletRequest request,ModelMap map){
        HttpSession session = request.getSession();
        User user = (User) session.getAttribute("user");
        map.addAttribute("user",user.getUserid());
        return "user/write";
    }

    @RequestMapping(value = "friend",produces = {"application/json;charset=UTF-8"})
    public String friend(HttpServletRequest request){
        HttpSession session = request.getSession();
        return "user/friend";
    }

    @RequestMapping(value = "friendAdd",produces = {"application/json;charset=UTF-8"})
    public String friendAdd(HttpServletRequest request){
        HttpSession session = request.getSession();
        return "user/friendAdd";
    }
}
