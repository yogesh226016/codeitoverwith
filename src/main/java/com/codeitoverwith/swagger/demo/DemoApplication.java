package com.codeitoverwith.swagger.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import com.codeitoverwith.swagger.demo.rest.UserInfoResource;

@SpringBootApplication
@ComponentScan(basePackages = "com.codeitoverwith.swagger")
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

}
