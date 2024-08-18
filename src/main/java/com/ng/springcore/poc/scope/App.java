package com.ng.springcore.poc.scope;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SuppressWarnings("resource")
public class App {
	

	public static void main(String[] args) {
		
		//IOC container with ApplicationContext
		ApplicationContext context = new ClassPathXmlApplicationContext(new String[] { "com/ng/springcore/poc/scope/scope_config.xml"});
		
		
		//proto type
		Student s1 = context.getBean(Student.class);
		Student s2 = context.getBean(Student.class);
	
		System.out.println("proto type test with diff hashcode");
		
		//2 diff instance with diff hashcode created
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		
		System.out.println("-------------");
		
		//singleton type
		StudentDetails sd1 = context.getBean(StudentDetails.class);
		StudentDetails sd2 = context.getBean(StudentDetails.class);
		
		System.out.println("singleton type test with same hashcode");
		
		//same instance with same hashcode created
		System.out.println(sd1.hashCode());
		System.out.println(sd2.hashCode());
	
		
	
	}
}
