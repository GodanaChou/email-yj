package edu.cqgcxy.controller;

import edu.cqgcxy.model.Admin;
import edu.cqgcxy.model.AdminPermissions;
import edu.cqgcxy.model.Permissions;
import edu.cqgcxy.service.AdminPerService;
import edu.cqgcxy.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.List;
import java.util.logging.Logger;

@Controller
@RequestMapping("/admin")
public class AdminController {
    @Autowired
    private AdminPerService adminPerService;

    @Autowired
    private AdminService adminService;

    private  static Logger logger = Logger.getLogger("adminController");

    @ResponseBody
    @RequestMapping(value = "doLogin",produces = {"application/json;charset=UTF-8"})
    public int doLogin(Admin admin,HttpServletRequest request){

        return 1;
    }

    @RequestMapping(value = "",produces = {"application/json;charset=UTF-8"})
    public String login(HttpServletRequest request){
        HttpSession session = request.getSession();

        Admin admin = new Admin();
        admin.setAdminid(1);
        admin.setName("小桂子");
        admin.setPhone("18883993870");
        session.setAttribute("admin",admin);

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
    public String panel(){
        return "admin/panel";
    }

    @RequestMapping(value = "role",produces = {"application/json;charset=UTF-8"})
    public String role(){
        return "admin/role";
    }

    @RequestMapping(value = "power",produces = {"application/json;charset=UTF-8"})
    public String power(){
        return "admin/power";
    }

    @RequestMapping(value = "user",produces = {"application/json;charset=UTF-8"})
    public String user(){
        return "admin/user";
    }
}
