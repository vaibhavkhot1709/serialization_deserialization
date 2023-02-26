package com.serialization;

import java.io.Serializable;

public class Person implements Serializable{

	int age;
	String gender;
	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Person(int age, String gender) {
		super();
		this.age = age;
		this.gender = gender;
	}
	@Override
	public String toString() {
		return "Person [age=" + age + ", gender=" + gender + "]";
	}
	
}
