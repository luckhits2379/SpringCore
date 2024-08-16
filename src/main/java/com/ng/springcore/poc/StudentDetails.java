package com.ng.springcore.poc;

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
		return "StudentDetails [studentPhoneNumber=" + studentPhoneNumber + ", subject=" + subject + ", addressMap="
				+ addressMap + "]";
	}
	
	
	
	
	
	
	
	
	
	
}
