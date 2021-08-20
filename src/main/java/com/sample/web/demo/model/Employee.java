package com.sample.web.demo.model;

public class Employee {
	
	public Employee(String firstname, String lastName, Long age, String department) {
		super();
		this.firstname = firstname;
		this.lastName = lastName;
		this.age = age;
		this.department = department;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public Long getAge() {
		return age;
	}
	public void setAge(Long age) {
		this.age = age;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	@Override
	public String toString() {
		return "Employee [firstname=" + firstname + ", lastName=" + lastName + ", age=" + age + ", department="
				+ department + ", getFirstname()=" + getFirstname() + ", getLastName()=" + getLastName() + ", getAge()="
				+ getAge() + ", getDepartment()=" + getDepartment() + "]";
	}
	
	private String firstname;
	private String lastName;
	private Long age;
	private String department;

}
