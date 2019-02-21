package com.baizhi.ems;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.baizhi.ems.dao")
public class Ems5Application {

    public static void main(String[] args) {

        SpringApplication.run(Ems5Application.class, args);
    }

}
