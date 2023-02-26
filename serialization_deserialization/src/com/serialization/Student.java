package com.serialization;

import java.io.Serializable;

public class Student implements Serializable {

     final int roll ;
    final String nm ;

//	public Student() {
//		super();
//		// TODO Auto-generated constructor stub
//	}

	public Student(int roll, String nm) {
		super();
		this.roll = roll;
		this.nm = nm;
	}
	@Override
	public String toString() {
		return "Student [roll=" + roll + ", nm=" + nm + "]";
	}

	public static void main(String[] args) {

		Student s = new Student(11,"ccc");
		System.out.println(s);
	}
}
