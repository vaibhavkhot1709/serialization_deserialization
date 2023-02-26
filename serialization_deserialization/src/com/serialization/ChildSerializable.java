package com.serialization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class A {
	int i;
	public A() {
		super();
		// TODO Auto-generated constructor stub
	}
	public A(int i) {
		super();
		this.i = i;
	}
}

class B extends A implements Serializable {
	int j;

	public B(int i, int j) {
		super(i);
		this.j = j;
	}

	@Override
	public String toString() {
		return "B [j=" + j + ", i=" + i + "]";
	}

}

public class ChildSerializable {

	public static void main(String[] args) {
		B b1 = new B(10, 11);
		System.out.println(b1);


		try {
			FileOutputStream fos = new FileOutputStream("C:/Users/admin/Desktop/New/ChildSerialize.txt");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(b1);
			fos.close();
			oos.close();

			System.out.println("Object serialize succssefully");

			FileInputStream fis = new FileInputStream("C:/Users/admin/Desktop/New/ChildSerialize.txt");
			ObjectInputStream ois = new ObjectInputStream(fis);
			B b2 = (B) ois.readObject();

//			s1=(Student) ois.readObject();
			fis.close();
			ois.close();
			System.out.println("deserialise successfully");
			System.out.println(b2);

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
