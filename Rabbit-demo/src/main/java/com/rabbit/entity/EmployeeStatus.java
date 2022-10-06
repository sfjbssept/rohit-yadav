package com.rabbit.entity;

public class EmployeeStatus {

	private String employee;
	private String status;
	private String message;
	public EmployeeStatus() {
		super();
		// TODO Auto-generated constructor stub
	}
	public EmployeeStatus(String employee, String status, String message) {
		super();
		this.employee = employee;
		this.status = status;
		this.message = message;
	}
	public String getEmployee() {
		return employee;
	}
	public void setEmployee(String employee) {
		this.employee = employee;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	@Override
	public String toString() {
		return "EmployeeStatus [employee=" + employee + ", status=" + status + ", message=" + message + "]";
	}
	
	
}
