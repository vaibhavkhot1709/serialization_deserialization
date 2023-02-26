package com.serialization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class TestEmployeeDeserialize {

	
	public static void main(String[] args) {
		
		Employee deseri=null;
		Employee deseri2=null;
		
		FileInputStream fis=null;
		ObjectInputStream ois=null;
		
		try {
			fis=new FileInputStream("D:\\Eclipse IDE\\Java\\serialization_deserialization\\src\\Employee.txt");
			ois=new ObjectInputStream(fis);
			deseri=(Employee)ois.readObject();
			deseri2=(Employee) ois.readObject();
			System.out.println("suuccssefully serialise object");

			System.out.println("deserialise object is : "+deseri);
			System.out.println("deserialise object is : "+deseri2);
			
		} catch (FileNotFoundException e) {
			System.out.println("FileNotFoundException");
			e.printStackTrace();
		} catch (IOException e) {
			System.out.println("IOException ");
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			System.out.println("ClassNotFoundException");
			e.printStackTrace();
		}finally {
			try {
				fis.close();
				ois.close();
			} catch (IOException e) {
				System.out.println("error while closing files");
				e.printStackTrace();
			}
		}
		
	}
	
}
