package com.trip.webpro.Dao;

import com.trip.webpro.Entity.User;
import org.apache.ibatis.annotations.Insert;

public interface UserDao {

    @Insert("INSERT INTO trip_db.user_t(user_email,user_password,user_sex,user_age,user_career,user_phone,user_tag1," +
            "user_tag2,user_tag3,user_tag4,user_tag5,user_tag6,user_tag7,user_tag8,user_tag9,user_tag10) VALUES (" +
            "#{user_email},#{user_password},#{user_sex},#{user_age},#{user_career},#{user_phone},#{user_tag1}," +
            "#{user_tag2},#{user_tag3},#{user_tag4},#{user_tag5},#{user_tag6},#{user_tag7},#{user_tag8},#{user_tag9},#{user_tag10})")
    public int register(User user);
}
