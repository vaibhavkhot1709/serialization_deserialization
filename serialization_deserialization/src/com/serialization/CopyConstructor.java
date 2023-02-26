package com.serialization;

public class CopyConstructor {

	int a;
	int b;
	
	public CopyConstructor(CopyConstructor c) {        // copy constructor
		this.a=c.a;
		this.b=c.b;
	}
	public CopyConstructor(int a, int b) {
		super();
		this.a = a;
		this.b = b;
	}
	public CopyConstructor() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "CopyConstructor [a=" + a + ", b=" + b + "]";
	}
	
	public static void main(String[] args) {
		CopyConstructor c1=new CopyConstructor(10,20);
//		System.out.println(c1);
		
		CopyConstructor copyc=new CopyConstructor(c1);
		System.out.println(copyc);
		
		
		System.out.println(c1==copyc);
		System.out.println(c1.a==copyc.a);
		System.out.println(c1.b==copyc.b);
		
		
		
	}
	
}
