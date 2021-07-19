package com.odianyun.internship;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * @author wxj
 * @date 2021/7/19 - 14:20
 */
@SpringBootApplication
@ComponentScan("com.odianyun.internship")
@MapperScan("com.odianyun.internship.mapper")
public class Springbootmybatis02Application {

    public static void main (String[] args) {
        SpringApplication.run(Springbootmybatis02Application.class, args);
    }

}
