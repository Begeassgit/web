package com.trip.webpro.Controller;

import com.trip.webpro.Entity.User;
import com.trip.webpro.Service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@Controller
public class RegisterController {
    public final UserService userService;
    public RegisterController(UserService userService){
        this.userService=userService;
    }

    @RequestMapping(value = "/register")
    public String registerIndex(){
        return "register.html";
    }

    @RequestMapping(value = "/registerAction",method ={RequestMethod.POST,RequestMethod.GET})
    public String register(User user){
        if(userService.register(user))
        {
            return "login.html";
        }
        else{
            return "error.html";
        }
    }



}
