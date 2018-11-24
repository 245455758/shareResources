package com.trouble.shareresources;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@EnableTransactionManagement//开启事务管理
@ComponentScan(basePackages = {"com.trouble.shareresources.service","com.trouble.shareresources.controller"})
@MapperScan("com.trouble.shareresources.mapper")
public class ShareresourcesApplication extends SpringBootServletInitializer {

	public static void main(String[] args) {
		SpringApplication.run(ShareresourcesApplication.class, args);
	}
}
