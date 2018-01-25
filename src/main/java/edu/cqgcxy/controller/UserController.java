package edu.cqgcxy.controller;

import edu.cqgcxy.model.User;
import edu.cqgcxy.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;
import java.util.List;
import java.util.logging.Logger;


@Controller
public class UserController {
    @Autowired
    private UserService userService;

    private static Logger logger = Logger.getLogger("UserController");

    @ResponseBody
    @RequestMapping(value = "/add", produces = {"application/json;charset=UTF-8"})
    public String addUser(User user){
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

    @RequestMapping(value = "aaaa",produces = {"application/json;charset=UTF-8"})
    public String aaaTest(){
        return "user/index1";
    }

    @RequestMapping(value = "center",produces = {"application/json;charset=UTF-8"})
    public String center(){
        return "user/main";
    }

}
