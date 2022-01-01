package com.entity;

public class EmployeeDetails {

	private int empid;
	private String name;
	private int age;
	private float salary;

	public EmployeeDetails() {

	}

	public int getEmpid() {
		return empid;
	}

	public void setEmpid(int empid) {
		this.empid = empid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public float getSalary() {
		return salary;
	}

	public void setSalary(float salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "EmployeeDetails [empid=" + empid + ", name=" + name + ", age=" + age + ", salary=" + salary + "]";
	}

}
