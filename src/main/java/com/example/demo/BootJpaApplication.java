package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@SpringBootApplication
@EnableWebMvc
public class BootJpaApplication {

	/*@Bean
	public WebMvcConfigurer corsConfigurer() {
	 	return new WebMvcConfigurerAdapter() {
		 	@Override
		 	public void addCorsMappings(CorsRegistry registry) {
		 		registry.addMapping("/api/v1/**").allowedOrigins("*").allowedMethods("*");
		 		}
		 	}; 
	}*/
	
	public static void main(String[] args) {
		SpringApplication.run(BootJpaApplication.class, args);
	}
	
	@Bean
	public WebMvcConfigurer corsConfigurer(){
		return new WebMvcConfigurerAdapter() {
			@Override
			public void addCorsMappings(CorsRegistry registry){
				registry.addMapping("/addAlien").allowedOrigins("*").allowedMethods("*");
			}
		} ;
		
	}
}
