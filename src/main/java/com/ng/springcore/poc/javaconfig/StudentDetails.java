package com.ng.springcore.poc.javaconfig;

import java.util.List;
import java.util.Map;
import java.util.Set;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class StudentDetails {
	
	@Value("Student Details using java config and @component scan")
    private String name;
	private List<Integer> studentPhoneNumber;
	private Set<String> subject;
	private Map<String, String> addressMap;

	public List<Integer> getStudentPhoneNumber() {
		return studentPhoneNumber;
	}

	public void setStudentPhoneNumber(List<Integer> studentPhoneNumber) {
		this.studentPhoneNumber = studentPhoneNumber;
	}

	public Set<String> getSubject() {
		return subject;
	}

	public void setSubject(Set<String> subject) {
		this.subject = subject;
	}

	public Map<String, String> getAddressMap() {
		return addressMap;
	}

	public void setAddressMap(Map<String, String> addressMap) {
		this.addressMap = addressMap;
	}

	public StudentDetails(List<Integer> studentPhoneNumber, Set<String> subject, Map<String, String> addressMap) {
		super();
		this.studentPhoneNumber = studentPhoneNumber;
		this.subject = subject;
		this.addressMap = addressMap;
	}

	public StudentDetails() {
		super();
		// TODO Auto-generated constructor stub
	}



	@Override
	public String toString() {
		return "StudentDetails [name=" + name + ", studentPhoneNumber=" + studentPhoneNumber + ", subject=" + subject
				+ ", addressMap=" + addressMap + "]";
	}

	public void init() {

		System.out.println("I am initiating student details using xml init-method attr");
		System.out.println("--------------");
	}

	public void destroy() {

		System.out.println("I am destroying student details using xml destroy-method attr");
		System.out.println("--------------");
	}

}
