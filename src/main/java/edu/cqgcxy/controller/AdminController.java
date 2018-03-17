package edu.cqgcxy.controller;

import edu.cqgcxy.model.*;
import edu.cqgcxy.service.AdminPerService;
import edu.cqgcxy.service.AdminService;
import edu.cqgcxy.service.MessageBordService;
import edu.cqgcxy.service.UserService;
import edu.cqgcxy.util.EncryptUtil;
import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.logging.Logger;

@Controller
@RequestMapping("/admin")
public class AdminController {
    @Autowired
    private AdminPerService adminPerService;

    @Autowired
    private AdminService adminService;

    @Autowired
    private MessageBordService messageBordService;

    @Autowired
    private UserService userService;

    private  static Logger logger = Logger.getLogger("adminController");

    @ResponseBody
    @RequestMapping(value = "doLogin",produces = {"application/json;charset=UTF-8"})
    public int doLogin(Admin admin,HttpServletRequest request) throws Exception {
        Admin aAdmin = adminService.findByPhone(admin.getPhone());
        if(null!=aAdmin && aAdmin.getIsvoid()!=1){
            if(aAdmin.getPassward().equals(new EncryptUtil().md5Digest(admin.getPassward()))){
                HttpSession session = request.getSession();
                session.setAttribute("admin",aAdmin);
                return 1;
            }else if(aAdmin.getIsvoid()==1){
            return 3;
            }else {
                return 2;
            }
        }else {
            return 0;
        }
    }

    //添加管理员

    @ResponseBody
    @RequestMapping(value = "addAdmin",produces = {"application/json;charset=UTF-8"})
    public int addAdmin(Admin admin) throws Exception {
        Admin aAdmin = adminService.findByPhone(admin.getPhone());
        if(null == aAdmin){
            admin.setPassward(new EncryptUtil().md5Digest(admin.getPassward()));
            adminService.addAdmin(admin);
            return 1;
        }else{
            return 2;
        }
    }

    @ResponseBody
    @RequestMapping(value = "changeName",produces = {"application/json;charset=UTF-8"})
    public int changeName(String name,String message,HttpServletRequest request){
        HttpSession session = request.getSession();
        Admin admin = (Admin)session.getAttribute("admin");
        String para = (String) session.getAttribute("paraAdmin");

        if(para.equals(message)){
            admin.setName(name);
            adminService.updateByAdmin(admin);
            logger.info("管理员 "+admin.getPhone()+" 修改名字为："+ name);
            return 1;
        }
       else {
            return 2;
        }

    }

    @ResponseBody
    @RequestMapping(value = "changePSW",produces = {"application/json;charset=UTF-8"})
    public int changePSW(String pass,String password,HttpServletRequest request) throws Exception {
        HttpSession session = request.getSession();
        Admin admin = (Admin)session.getAttribute("admin");

        logger.info(new EncryptUtil().md5Digest("123456"));
        if(admin.getPassward().equals(new EncryptUtil().md5Digest(pass))){
            admin.setPassward(new EncryptUtil().md5Digest(password));
            adminService.updateByAdmin(admin);
            logger.info("管理员 "+admin.getPhone()+" 修改了密码  "+ new Date());
            return 1;
        }
        else {
            return 2;
        }

    }


    @RequestMapping(value = "",produces = {"application/json;charset=UTF-8"})
    public String login(){
        return "admin/admin";
    }

    @RequestMapping(value = "top",produces = {"application/json;charset=UTF-8"})
    public String top(){
        return "admin/top";
    }

    @RequestMapping(value = "admin_men",produces = {"application/json;charset=UTF-8"})
    public String admin_men(HttpServletRequest request,ModelMap modelMap){
        HttpSession session = request.getSession();
        Admin admin = (Admin) session.getAttribute("admin");
        List<Permissions> adminPermissionsList = adminPerService.findPerByAdminID(admin.getAdminid());
        modelMap.addAttribute("perList",adminPermissionsList);
        logger.info("管理员 "+admin.getPhone()+" 权限共计:"+adminPermissionsList.size());
        return "admin/admin_men";
    }

    @RequestMapping(value = "panel",produces = {"application/json;charset=UTF-8"})
    public String panel(ModelMap modelMap){
        List<MessageBoard> messageBoards = messageBordService.findAll() ;
        if(messageBoards.size()>3){
            messageBoards = messageBoards.subList(messageBoards.size()-3,messageBoards.size());
        }
        logger.info(""+messageBoards.size());
        modelMap.addAttribute("messageBoards",messageBoards);
        return "admin/panel";
    }

    @ResponseBody
    @RequestMapping(value = "leaveMessage",produces = {"application/json;charset=UTF-8"})
    public int leaveMessage(String text,HttpServletRequest request){

        logger.info(""+text.length());

        if(text.length() < 40){
            HttpSession session = request.getSession();
            Admin admin = (Admin)session.getAttribute("admin");
            MessageBoard messageBoard = new MessageBoard();

            messageBoard.setTime(new Date());
            messageBoard.setUsermessage(text);
            messageBoard.setUserid(admin.getAdminid());
            messageBoard.setUsername(admin.getName());
            messageBoard.setUserid(admin.getAdminid());
            return messageBordService.addMessage(messageBoard);
        }else {
            return 2;
        }
    }

    @RequestMapping(value = "role",produces = {"application/json;charset=UTF-8"})
    public String role(ModelMap modelMap){
        modelMap.addAttribute("admins",adminService.findAll());
        logger.info("第一个管理员状态"+adminService.findAll().get(0).getIsvoid());
        logger.info("--------用户个数：  "+userService.findAllUser().size());
        modelMap.addAttribute("users",userService.findAllUser());
        return "admin/role";
    }

    @ResponseBody
    @RequestMapping(value = "changeRunAdmin",produces = {"application/json;charset=UTF-8"})
    public int changeRunAdmin(Admin admin,HttpServletRequest request){
        HttpSession session = request.getSession();
        Admin admin2 = (Admin) session.getAttribute("admin");
        Admin admin1 = adminService.findByID(admin.getAdminid());
        if(admin1.getIsvoid().equals(admin.getIsvoid())){
            return 2;
        }else {
            logger.info("管理员 "+admin2.getPhone()+" 修改管理员ID: "+admin.getAdminid()+" 的isvoid为 "+admin.getIsvoid());
            return adminService.updateByAdmin(admin);
        }
    }

    @ResponseBody
    @RequestMapping(value = "changeRunUser",produces = {"application/json;charset=UTF-8"})
    public int changeRunUser(User user,HttpServletRequest request){
        HttpSession session = request.getSession();
        Admin admin2 = (Admin) session.getAttribute("admin");

        User user1 = userService.findByPrimaryKey(user.getUserid());
        if(user1.getIsvoid().equals(user.getIsvoid())){
            return 2;
        }else {
            logger.info("管理员 "+admin2.getPhone()+" 修改用户ID: "+user.getUserid()+" 的isvoid为 "+ user.getIsvoid());
            return userService.update(user);
        }
    }


    //权限管理界面
    @RequestMapping(value = "power",produces = {"application/json;charset=UTF-8"})
    public String power(ModelMap modelMap){

        List<PowerModel> powerModels = adminService.findNotIsVoid();
        List<PowerModel> powerModels2 = new ArrayList<>();
        PowerModel power = null;


        for(Iterator powerModel = powerModels.iterator();powerModel.hasNext();){
            PowerModel pow = (PowerModel) powerModel.next();

                if (power == null){
                    power = new PowerModel();
                    power.setPowerids(""+pow.getPowerName());
                    power.setPowerid(pow.getPowerid());
                    power.setName(pow.getName());
                    power.setPowerName(pow.getPowerName());
                    power.setUserid(pow.getUserid());
                }else if(power.getName().equals(pow.getName())){
                    power.setPowerids(power.getPowerids()+","+pow.getPowerName());
                    if(!powerModel.hasNext()){
                        powerModels2.add(power);
                        power = null;
                    }
                }else if(!power.getName().equals(pow.getName())){
                    powerModels2.add(power);
                    power = new PowerModel();
                    power.setPowerids(""+pow.getPowerName());
                    power.setPowerid(pow.getPowerid());
                    power.setName(pow.getName());
                    power.setPowerName(pow.getPowerName());
                    power.setUserid(pow.getUserid());
                    if(!powerModel.hasNext()){
                        powerModels2.add(power);
                        power = null;
                    }
                }
        }



        modelMap.addAttribute("powerModel",powerModels2);

        logger.info("powerModel长度： "+powerModels2.size());
        return "admin/power";
    }

    @RequestMapping(value = "user",produces = {"application/json;charset=UTF-8"})
    public String user(ModelMap modelMap){
        List<User> users = userService.findReport();
        modelMap.addAttribute("users",users);
        return "admin/user";
    }

    @ResponseBody
    @RequestMapping(value = "changePower",produces = {"application/json;charset=UTF-8"})
    public int changePower(int id,String name){
        logger.info("------------"+name);
        AdminPermissions adminPer = new AdminPermissions();
        AdminPermissions adminPermissions2 = adminPerService.findByIDAndPerID(id,2);
        AdminPermissions adminPermissions3 = adminPerService.findByIDAndPerID(id,3);
        AdminPermissions adminPermissions4 = adminPerService.findByIDAndPerID(id,4);
        int x = 0;

//        权限被写死
        if(name.contains("角色管理")){
            if(adminPermissions2 == null){
                adminPer.setAdminid(id);
                adminPer.setPermissionsId(2);
                adminPerService.addPer(adminPer);
                x++;
            }
        }else {
            if(adminPermissions2 != null){
                adminPerService.deletePer(adminPermissions2.getAdminperid());
                x++;
            }
        }

        if(name.contains("权限管理")){
            if(adminPermissions3 == null){
                adminPer.setAdminid(id);
                adminPer.setPermissionsId(3);
                adminPerService.addPer(adminPer);
                x++;
            }
        }else {
            if(adminPermissions3 != null){
                adminPerService.deletePer(adminPermissions3.getAdminperid());
                x++;
            }
        }

        if(name.contains("用户管理")){
            if(adminPermissions4 == null){
                adminPer.setAdminid(id);
                adminPer.setPermissionsId(4);
                adminPerService.addPer(adminPer);
                x++;
            }
        }else {
            if(adminPermissions4 != null){
                adminPerService.deletePer(adminPermissions4.getAdminperid());
                x++;
            }
        }
        if(x==0){
            return 2;
        }else return 1;
    }
}
