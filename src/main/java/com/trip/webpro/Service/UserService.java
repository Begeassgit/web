package com.trip.webpro.Service;

import com.trip.webpro.Dao.UserDao;
import com.trip.webpro.Entity.User;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    public final UserDao userDao;

    public UserService(UserDao userDao){
        this.userDao=userDao;
    }

    public boolean register(User user){
        return userDao.register(user)>=1?true:false;
    }
}
