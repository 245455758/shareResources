package com.trouble.shareresources;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@EnableTransactionManagement//开启事务管理
@MapperScan("com.trouble.shareresources.mapper")
public class ShareresourcesApplication {

	public static void main(String[] args) {
		SpringApplication.run(ShareresourcesApplication.class, args);
	}
}
