package com.moreeCommerce.users;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan({"controller","service"})
@EnableAutoConfiguration
@SpringBootApplication
public class UsersApplication  extends SpringBootServletInitializer{

	public static void main(String[] args) {
		SpringApplication.run(UsersApplication.class, args);
	}
	@Override
	protected SpringApplicationBuilder configure (SpringApplicationBuilder builder){
		return builder.sources(UsersApplication.class);
	}
}


