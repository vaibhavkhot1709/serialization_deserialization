package com.serialization;

public class Employee extends Person {

	int id;
	String name;
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Employee(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	
	public Employee(int age, String gender, int id, String name) {
		super(age, gender);
		this.id = id;
		this.name = name;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", age=" + age + ", gender=" + gender + "]";
	}
	
}
