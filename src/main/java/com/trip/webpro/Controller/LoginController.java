package com.trip.webpro.Controller;

import com.trip.webpro.Dao.UserDao;
import com.trip.webpro.Entity.User;
import com.trip.webpro.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;


/**
 * @Author:JohnSong
 * @Date:2020/2/4 17:25
 * @ProjectName:webpro
 **/
@Controller
@EnableAutoConfiguration
@SpringBootApplication
public class LoginController {
    private final UserDao userDao;

    public LoginController(UserDao userDao) {
        this.userDao = userDao;
    }
//
    @Autowired
    private UserService userService;

    @RequestMapping(value = "/login")
    public String index(){
        return "login.html";
    }


    @RequestMapping(value = "/loginPage",method = {RequestMethod.GET,RequestMethod.POST})
    private ModelAndView login(HttpServletRequest request,HttpSession session){
        ModelAndView modelAndView=new ModelAndView();
        String user_email=request.getParameter("user_email");
//        Logger.getGlobal().info(user_email);
        String user_password=request.getParameter("user_password");
//        Logger.getGlobal().info(user_password);

        User tname=userService.login(user_email,user_password);
        if(tname==null){

            modelAndView.clear();
            modelAndView.setViewName("login");
            return modelAndView;
        }else {
            session.setAttribute("tname",tname);

            modelAndView.setViewName("detail");
            return modelAndView;
        }

    }
}
