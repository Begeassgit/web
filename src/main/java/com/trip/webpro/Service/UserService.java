package com.trip.webpro.Service;

import com.trip.webpro.Dao.UserDao;
import com.trip.webpro.Entity.User;
import org.springframework.stereotype.Service;

//@Service
public interface UserService{
    public boolean register(User user);
    public User login(String user_email,String user_password);
}
//public class UserService {
//    public final UserDao userDao;
//
//    public UserService(UserDao userDao){
//        this.userDao=userDao;
//    }
//
//    public boolean register(User user){
//        return userDao.register(user)>=1?true:false;
//    }
//
//    public User login(User user) {
//        user=this.userDao.login(user.getUser_email(), user.getUser_password());
//        return user;
//    }
//
//}
