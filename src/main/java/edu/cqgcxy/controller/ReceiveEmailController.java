package edu.cqgcxy.controller;

import edu.cqgcxy.model.ReceiveEmail;
import edu.cqgcxy.service.ReceiveEmailBox;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.logging.Logger;


@Controller
public class ReceiveEmailController {

    private static Logger logger = Logger.getLogger("ReceiveEmailController");

    @Autowired
    private ReceiveEmailBox receiveEmailBox;

    //回信

    @RequestMapping(value = "reply",produces = {"application/json;charset=UTF-8"})
    public String reply( @Param("receiveEmailID") int receiveEmailID, ModelMap modelMap){
        logger.info("111111");
        ReceiveEmail receiveEmail = receiveEmailBox.findByID(receiveEmailID);
        modelMap.addAttribute("receiveEmail",receiveEmail);
        return "user/reply" ;
    }

}
