package com.atguigu.springboot;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@ServletComponentScan
@MapperScan("com.atguigu.springboot.dao")
@SpringBootApplication
@EnableTransactionManagement
public class Springboot0213Application {

	public static void main(String[] args) {
		SpringApplication.run(Springboot0213Application.class, args);
	}

}
