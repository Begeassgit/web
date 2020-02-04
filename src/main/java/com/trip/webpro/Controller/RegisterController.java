package com.trip.webpro.Controller;

import com.trip.webpro.Entity.User;
import com.trip.webpro.Service.UserService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RegisterController {
    public final UserService userService;
    public RegisterController(UserService userService){
        this.userService=userService;
    }

    @RequestMapping(value = "/register",method = RequestMethod.POST)
    public boolean register(User user){
        return userService.register(user);
    }
}
