package com.springcore.SpringCore;

public class Student {
	
	private int id;
	private String studentName;
	private String studentAddress;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		System.out.println("Setting Student ID");
		this.id = id;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		System.out.println("Setting Student Name");
		this.studentName = studentName;
	}
	public String getStudentAddress() {
		return studentAddress;
	}
	public void setStudentAddress(String studentAddress) {
		System.out.println("Setting Student Address");
		this.studentAddress = studentAddress;
	}
	public Student(int id, String studentName, String studentAddress) {
		super();
		this.id = id;
		this.studentName = studentName;
		this.studentAddress = studentAddress;
	}
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	@Override
	public String toString() {
		return "Student [id=" + id + ", studentName=" + studentName + ", studentAddress=" + studentAddress + "]";
	}
	
	

}
