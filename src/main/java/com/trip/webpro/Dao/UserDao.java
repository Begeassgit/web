package com.trip.webpro.Dao;

import com.trip.webpro.Entity.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
@Mapper
public interface UserDao {

    @Insert("INSERT INTO trip_db.user_t(user_email,user_password,user_sex,user_age,user_career,user_phone,user_tag1," +
            "user_tag2,user_tag3,user_tag4,user_tag5,user_tag6,user_tag7,user_tag8,user_tag9,user_tag10) VALUES (" +
            "#{user_email},#{user_password},#{user_sex},#{user_age},#{user_career},#{user_phone},#{user_tag1}," +
            "#{user_tag2},#{user_tag3},#{user_tag4},#{user_tag5},#{user_tag6},#{user_tag7},#{user_tag8},#{user_tag9}," +
            "#{user_tag10})")
    int register(User user);


    @Select("select * from trip_db.user_t where user_email=#{user_email} and user_password=#{user_password}")
    User login(@Param("user_email") String user_email, @Param("user_password") String user_password);
}
