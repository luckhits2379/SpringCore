package com.ng.springcore.poc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SuppressWarnings("resource")
public class App {
	

	public static void main(String[] args) {
		
		//IOC container
		ApplicationContext context = new ClassPathXmlApplicationContext(new String[] {"config.xml", "com/ng/springcore/poc/config.xml"});
		
		
		Student student1 = context.getBean("student1", Student.class); // using value tag
		
		Student student2 = context.getBean("student2", Student.class); // using value attribute
		
		Student student3 = context.getBean("student3", Student.class); // using p schema
		
		System.out.println(student1);
		
		System.out.println(student2);
		
		System.out.println(student3);
		
		StudentDetails studentDetail1 = context.getBean("studentDetail1", StudentDetails.class); // using collections
		
		System.out.println(studentDetail1);
		
		
	
	}
}
