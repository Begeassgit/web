package com.trip.webpro;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;



@SpringBootApplication
@MapperScan("com.trip.webpro.Dao")
@ServletComponentScan
public class WebproApplication extends SpringBootServletInitializer {

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder applicationBuilder){
        return applicationBuilder.sources(WebproApplication.class);
    }

    public static void main(String[] args) {
        SpringApplication.run(WebproApplication.class, args);
    }

}
