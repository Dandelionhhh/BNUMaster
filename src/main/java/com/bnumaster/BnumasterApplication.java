package com.bnumaster;


import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;



@MapperScan(value = "com.bnumaster.mapper")
@SpringBootApplication
public class BnumasterApplication {

    public static void main(String[] args) {
        SpringApplication.run(BnumasterApplication.class, args);
    }

}
