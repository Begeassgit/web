package com.trip.webpro.Service.impl;

import com.trip.webpro.Dao.UserDao;
import com.trip.webpro.Entity.User;
import com.trip.webpro.Service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @Author:JohnSong
 * @Date:2020/2/5 0:46
 * @ProjectName:webpro
 **/
@Service(value = "userService")
public class UserServiceImpl implements UserService {
    @Resource
    public final UserDao userDao;

    public UserServiceImpl(UserDao userDao){
        this.userDao=userDao;
    }

    @Override
    public boolean register(User user){
        return userDao.register(user)>=1?true:false;
    }

    @Override
    public User login(String user_email,String user_password) {
        return userDao.login(user_email,user_password);
    }
}
