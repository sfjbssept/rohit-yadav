package com.rabbit.entity;

public class Employee {
	
	private String empId;
	private String name;
	private int Salary;
	
	public String getEmpId() {
		return empId;
	}
	public void setEmpId(String empId) {
		this.empId = empId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSalary() {
		return Salary;
	}
	public void setSalary(int salary) {
		Salary = salary;
	}
	
	public Employee(String empId, String name, int salary) {
		super();
		this.empId = empId;
		this.name = name;
		Salary = salary;
	}
	
	public Employee() {
		super();
	}
	
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", name=" + name + ", Salary=" + Salary + "]";
	}
	
	
	
	

}
