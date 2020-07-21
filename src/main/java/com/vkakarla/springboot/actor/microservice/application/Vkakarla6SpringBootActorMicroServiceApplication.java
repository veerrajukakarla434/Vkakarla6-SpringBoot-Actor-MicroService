package com.vkakarla.springboot.actor.microservice.application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@ComponentScan(value="com.vkakarla.springboot.actor.microservice.*")
@EnableSwagger2
public class Vkakarla6SpringBootActorMicroServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(Vkakarla6SpringBootActorMicroServiceApplication.class, args);
	}
   
	
	@Bean
	public Docket api() {                
	    return new Docket(DocumentationType.SWAGGER_2)          
	      .select()
	      .apis(RequestHandlerSelectors.basePackage("com.vkakarla.springboot.actor.microservice.controller"))
	      .build();
	}
	 
}
