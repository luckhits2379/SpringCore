package com.ng.springcore.poc.standalonecollections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SuppressWarnings("resource")
public class App {
	

	public static void main(String[] args) {
		
		//IOC container with ApplicationContext
		ApplicationContext context = new ClassPathXmlApplicationContext(new String[] {"com/ng/springcore/poc/standalonecollections/standalone_collection_config.xml"});
		
		StudentDetails student = context.getBean(StudentDetails.class);

		System.out.println(student);
				
		
	
	}
}
