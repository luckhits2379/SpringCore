package com.ng.springcore.poc.springexpresssionlaunguage;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.expression.Expression;
import org.springframework.expression.spel.standard.SpelExpressionParser;

@SuppressWarnings("resource")
public class App {
	

	public static void main(String[] args) {
		
		//IOC container with ApplicationContext
		ApplicationContext context = new ClassPathXmlApplicationContext(new String[] { "com/ng/springcore/poc/springexpresssionlaunguage/SpEL_config.xml"});
		
		System.out.println(context.getBean(Student.class).toString());
		
		SpelExpressionParser temp = new SpelExpressionParser();
		Expression exp = temp.parseExpression(" 1 + 2 + 5 ");
		System.out.println(exp.getValue());
	
		

	}
}
