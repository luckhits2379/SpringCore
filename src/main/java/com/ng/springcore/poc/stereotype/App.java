package com.ng.springcore.poc.stereotype;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SuppressWarnings("resource")
public class App {
	

	public static void main(String[] args) {
		
		//IOC container with ApplicationContext
		ApplicationContext context = new ClassPathXmlApplicationContext(new String[] { "com/ng/springcore/poc/stereotype/stereotype_config.xml"});
		
		System.out.println(context.getBean(Student.class).toString()); // using @component, @value and collections
	
		
	
	}
}
