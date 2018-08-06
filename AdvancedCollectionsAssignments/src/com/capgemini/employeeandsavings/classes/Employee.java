package com.capgemini.employeeandsavings.classes;

//an employee class with getters and setters
public class Employee {

	private int id;
	private String name;
	private String employee_designation;
	private double salary;
	private String communication;
	public Employee(int id,String name, String employee_designation, double salary, String communication) {
		this.id=id;
		this.name = name;
		this.employee_designation = employee_designation;
		this.salary = salary;
		this.communication = communication;
	}
	public String getName() {
		return name;
	}
	public String getEmployee_designation() {
		return employee_designation;
	}
	public double getSalary() {
		return salary;
	}
	public String getCommunication() {
		return communication;
	}
	
	public int getId() {
		return id;
	}
	
	
}
