package com.SpringAuthinication.Authenication.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/users")
public class UserController {
    @GetMapping("/user")
    public String helloWorld(){
        return "welcome";
    }
}
