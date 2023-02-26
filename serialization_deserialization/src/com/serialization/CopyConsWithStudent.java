package com.serialization;

public class CopyConsWithStudent {

	int a;
	int b;
	StudentCopyConstrct c;
	
	public CopyConsWithStudent(CopyConsWithStudent copy) {         // copy constructor
		this.a=copy.a;
		this.b=copy.b;
		StudentCopyConstrct s=new StudentCopyConstrct(copy.c);
		this.c=s;
		
		
	}
	public CopyConsWithStudent() {
		super();
		// TODO Auto-generated constructor stub
	}
	public CopyConsWithStudent(int a, int b, StudentCopyConstrct s1) {
		super();
		this.a = a;
		this.b = b;
		this.c = s1;
	}
	@Override
	public String toString() {
		return "CopyConsWithStudent [a=" + a + ", b=" + b + ", c=" + c + "]";
	}
	
	public static void main(String[] args) {
		StudentCopyConstrct s1=new StudentCopyConstrct(10,"abc");
		CopyConsWithStudent c1=new CopyConsWithStudent(10,20,s1);
//		System.out.println(c1);
		
		CopyConsWithStudent c2=new CopyConsWithStudent(c1);
		System.out.println(c2);
		
		System.out.println(c1.c==c2.c);
		
		
	}
}
