package edu.cqgcxy.controller;

import edu.cqgcxy.model.User;
import edu.cqgcxy.model.UserFriend;
import edu.cqgcxy.service.UserFriendService;
import edu.cqgcxy.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;


@Controller
public class UserFriendController {
    @Autowired
    private UserService userService;

    @Autowired
    private UserFriendService userFriendService;

    private static Logger logger = Logger.getLogger("UserFriendController");

    @RequestMapping(value = "friend",produces = {"application/json;charset=UTF-8"})
    public String friend(HttpServletRequest request, ModelMap modelMap){
        HttpSession session = request.getSession();
        User user = (User)session.getAttribute("user");
        List<UserFriend> users=userFriendService.findUserFriend(user.getUserid());
        modelMap.addAttribute("users",users);
        return "user/friend";
    }

    @ResponseBody
    @RequestMapping(value = "addFriend",produces = {"application/json;charset=UTF-8"})
    public int addFriend(UserFriend userFriend,HttpServletRequest request){
        HttpSession session = request.getSession();
        User user = (User)session.getAttribute("user");

        userFriend.setUserid(user.getUserid());

        userFriendService.addFriend(userFriend);
        return 1;
    }

    @ResponseBody
    @RequestMapping(value = "deleteFriend",produces = {"application/json;charset=UTF-8"})
    public int deleteFriend(int id){
        return userFriendService.deleteFriend(id);
    }

    @RequestMapping(value = "writeToFriend",produces = {"application/json;charset=UTF-8"})
    public String writeToFriend(String phone,ModelMap modelMap){
        modelMap.addAttribute("phone",phone);
        return "user/writeToFriend";
    }

    @ResponseBody
    @RequestMapping(value = "getFriend",produces = {"application/json;charset=UTF-8"})
    public List<String>  getFriend(HttpServletRequest request){
        HttpSession session = request.getSession();
        User user = (User) session.getAttribute("user");
        List<UserFriend> userFriends = userFriendService.findUserFriend(user.getUserid());
        List<String> phone = new ArrayList<>();
        for (UserFriend userFriend:userFriends){
            phone.add(userFriend.getFriendname()+'<'+userFriend.getFriendphone()+"@193.com>;");
        }
        logger.info(""+phone);
        return phone;
    }
}
