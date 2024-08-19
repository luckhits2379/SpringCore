package com.ng.springcore.poc.javaconfig;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SuppressWarnings("resource")
public class App {
	

	public static void main(String[] args) {
		
		//IOC container with ApplicationContext
		ApplicationContext context = new AnnotationConfigApplicationContext(JavaConfig.class);
		
		Student s = context.getBean(Student.class);
		
		System.out.println(s);
		
        StudentDetails sd = context.getBean("test1", StudentDetails.class);
        
		
		System.out.println(context.getBean("studentDetails", StudentDetails.class));
		
	
	}
}
