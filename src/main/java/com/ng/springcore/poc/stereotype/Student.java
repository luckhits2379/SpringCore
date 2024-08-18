package com.ng.springcore.poc.stereotype;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;


@Component("ob")
public class Student implements InitializingBean, DisposableBean {
	
	
	private int studentId;
	private String studentName;
	private String studentAddress;
	
	@Autowired
	private StudentDetails studentDetails;
	
	@Value("#{myList}")
	private List list;

	public StudentDetails getStudentDetails() {
		return studentDetails;}

	public void setStudentDetails(StudentDetails studentDetails) {
		this.studentDetails = studentDetails;
	}
	
	
	public int getStudentId() {
		return studentId;
	}
	
	@Value("123") 
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public String getStudentName() {
		return studentName;
	}
     
	@Value("stereo type")
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public String getStudentAddress() {
		return studentAddress;
	}
    
	@Value("stereo type")
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
		return "Student [studentId=" + studentId + ", studentName=" + studentName + ", studentAddress=" + studentAddress
				+ ", studentDetails=" + studentDetails + ", list=" + list + "]";
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
