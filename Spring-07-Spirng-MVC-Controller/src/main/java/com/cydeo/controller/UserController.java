package com.cydeo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class UserController {

    @RequestMapping("/user")
    public String userInfo(){
        return "user/userInfo.html"; //if there is no folder under static, as a default system will check only static folder
        //thats why we need to say where the html file is if there is a folder under static
    }
}
