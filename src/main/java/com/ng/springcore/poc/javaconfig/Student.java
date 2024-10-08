package com.ng.springcore.poc.javaconfig;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;



public class Student implements InitializingBean, DisposableBean {
    
	@Value("123")
	private int studentId;
	
	@Value("Student bean using java config and bean")
	private String studentName;
	@Value("Student bean using java config and bean")
	private String studentAddress;
	@Autowired
	@Qualifier("test2")
	private StudentDetails studentDetails;

	public StudentDetails getStudentDetails() {
		return studentDetails;}

	public void setStudentDetails(StudentDetails studentDetails) {
		this.studentDetails = studentDetails;
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

	public Student(int studentId, String studentName, String studentAddress, StudentDetails studentDetails) {
		super();
		this.studentId = studentId;
		this.studentName = studentName;
		this.studentAddress = studentAddress;
		this.studentDetails = studentDetails;
	}

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "[studentName=" + studentName + ", studentId=" + studentId + ", studentAddress=" + studentAddress
				+ ", studentDetails=" + this.studentDetails + "]";
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
