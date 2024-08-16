package com.ng.springcore.poc.autoWiring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SuppressWarnings("resource")
public class App {
	

	public static void main(String[] args) {
		
		//IOC container with ApplicationContext
		ApplicationContext context = new ClassPathXmlApplicationContext(new String[] {"com/ng/springcore/poc/autoWiring/autowiring_config.xml"});
		
		
		//Setter Injection example
		Student student1 = context.getBean("student1", Student.class); // using setter injection value tag
		
		Student student2 = context.getBean("student2", Student.class); // using setter injection value attribute
		
		Student student3 = context.getBean("student3", Student.class); // using setter injection p schema
		
		
		
		//constructor Injection example
		Student student4 = context.getBean("student4", Student.class); // using contructor arg and value attribute
		
		Student student5 = context.getBean("student5", Student.class); // using contructor arg and value tag
		
		Student student6 = context.getBean("student6", Student.class); // using c schema
		
		Student student7 = context.getBean("student7", Student.class); // constructor using value and name attr, without type
		
		
		
		StudentDetails studentDetail1 = context.getBean("studentDetail1", StudentDetails.class); // using collections
		
		
		
		System.out.println(student1);
		
		System.out.println("-------");
		
		System.out.println(student2);
		
		System.out.println("-------");
		
		System.out.println(student3);
		
		System.out.println("-------");
		
		System.out.println(student4);
		
		System.out.println("-------");
		
		System.out.println(student5);
		
		System.out.println("-------");
		
		System.out.println(student6);
		
		System.out.println("-------");
		
		System.out.println(student7);
		
		System.out.println("-------");
		
		System.out.println(studentDetail1);
		
		System.out.println("-------");
		
		//AbstractApplicationContext IOC container to register destroy method, this will call destroy method now
		AbstractApplicationContext abstractApplicationContext = new ClassPathXmlApplicationContext("com/ng/springcore/poc/autoWiring/autowiring_config.xml");
		abstractApplicationContext.registerShutdownHook();
		
		//IOC container with AbstractApplicationContext init and destroy demo
		AbstractApplicationContext context1 = new ClassPathXmlApplicationContext("com/ng/springcore/poc/autoWiring/autowiring_config.xml");
		
		context1.registerShutdownHook();		
		
				
		
	
	}
}
