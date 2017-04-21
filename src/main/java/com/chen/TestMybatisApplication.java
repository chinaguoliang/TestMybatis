package com.chen;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@MapperScan(basePackages = "com.chen.mapper")    //这句一定要加，否则扫描不出来
public class TestMybatisApplication {
	public static void main(String[] args) {
		SpringApplication.run(TestMybatisApplication.class, args);
	}
}
