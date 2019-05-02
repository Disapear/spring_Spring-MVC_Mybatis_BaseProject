package com.Disappear.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/LoginController")
public class LoginController {
    @RequestMapping("/login")
    public String TestController() {
        System.out.println("TestOK!");

        return "index";
    }

}
