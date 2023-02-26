package com.serialization;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class TestEmployeeSerialize {

	public static void main(String[] args) {

		Employee e1=new Employee(11, "male", 1111, "abc");
		Employee e2=new Employee(12, "male", 1112, "efg");
		FileOutputStream fos = null;
		ObjectOutputStream oos = null;

		try {
			fos = new FileOutputStream("D:\\Eclipse IDE\\Java\\serialization_deserialization\\src\\Employee.txt");
			oos = new ObjectOutputStream(fos);
			oos.writeObject(e1);
			oos.writeObject(e2);
			System.out.println("serialize Object Employee succssefully!!");
		} catch (FileNotFoundException e) {

			System.out.println("FileNotFoundEx while creating serialization");
			e.printStackTrace();
		} catch (IOException e) {

			System.out.println("IOEx while creating serialization");
			e.printStackTrace();
		}finally {
			try {
				fos.close();
				oos.close();
			} catch (IOException e) {
				
				System.out.println("error while closing the files");
				e.printStackTrace();
			}

		}

	}
}
