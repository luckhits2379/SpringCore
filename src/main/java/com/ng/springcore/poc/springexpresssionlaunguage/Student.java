package com.ng.springcore.poc.springexpresssionlaunguage;


import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;


@Component("ob")
public class Student implements InitializingBean, DisposableBean {
	
	
	@Value("#{ T(Integer).MAX_VALUE }") 
	private int studentId;
	@Value("#{ new com.ng.springcore.poc.springexpresssionlaunguage.Student().getName() }")
	private String studentName;
	@Value("#{ 1 + 2 + 3}")
	private String studentAddress;
	
	public String getName() {
		
		return "SpEL by method";
	}
	
	public int getStudentId() {
		return studentId;
	}
	
	
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public String getStudentName() {
		return studentName;
	}
     

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public String getStudentAddress() {
		return studentAddress;
	}
    

	public void setStudentAddress(String studentAddress) {
		this.studentAddress = studentAddress;
	}

	public Student(int studentId, String studentName, String studentAddress) {
		super();
		this.studentId = studentId;
		this.studentName = studentName;
		this.studentAddress = studentAddress;
	}

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	

	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", studentName=" + studentName + ", studentAddress=" + studentAddress
				+ "]";
	}

	@Override
	public void destroy() throws Exception {
		
		System.out.println("I am destroying student using interface");
		System.out.println("--------------");
		
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		
		System.out.println("I am initiating student using interface");
		System.out.println("--------------");
		
	}
	
	@PreDestroy
	@PostConstruct
	public void test() {
		
		System.out.println("I am initiating and Destroying student using annotation");
		System.out.println("--------------");
	}

}
