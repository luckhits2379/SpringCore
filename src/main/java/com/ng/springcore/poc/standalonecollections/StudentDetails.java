package com.ng.springcore.poc.standalonecollections;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class StudentDetails {

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
		return "[studentPhoneNumber=" + studentPhoneNumber + ", subject=" + subject + ", addressMap=" + addressMap
				+ "]";
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
