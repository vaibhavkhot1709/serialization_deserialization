package com.serialization;

public class StudentCopyConstrct  {

	int roll;
	String nm;
	
	public StudentCopyConstrct(StudentCopyConstrct copy) {
		this.roll=copy.roll;
		this.nm=copy.nm;
	}
	public StudentCopyConstrct() {
		super();
		// TODO Auto-generated constructor stub
	}
	public StudentCopyConstrct(int roll, String nm) {
		super();
		this.roll = roll;
		this.nm = nm;
	}
	@Override
	public String toString() {
		return "Student [roll=" + roll + ", nm=" + nm + "]";
	}
	
	
}
