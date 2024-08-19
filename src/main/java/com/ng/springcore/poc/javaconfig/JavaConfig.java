package com.ng.springcore.poc.javaconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages="com.ng.springcore.poc.javaconfig")   // we can define multiple packages here
public class JavaConfig {
	

	
	@Bean
	public Student getStudent() {
	
	   return new Student();
	}
	
	
	@Bean( name = {"test1", "test2"})// we can use multiple names and use any one
	public StudentDetails getStudentDetails() {
		
	   return new StudentDetails();
	}
	
}
