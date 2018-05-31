package com.gofine.dataSite;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
/**
 * server Application
 *
 * @author qiwei
 * @create 2018/04/27
 **/
@SpringBootApplication
@MapperScan("com.gofine.dataSite.mapper")
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
}
