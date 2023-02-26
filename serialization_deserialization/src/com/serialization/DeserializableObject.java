package com.serialization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;

public class DeserializableObject {

	public static void main(String[] args) throws IOException {
		Student s1 = null;

//		String filename="abc.txt";
		
		FileInputStream fis = null;
		ObjectInputStream ois = null;

		try {
//			fis = new FileInputStream(filename);           // we can use this also
			fis = new FileInputStream("C:/Users/admin/Desktop/New/abc.txt");
			ois = new ObjectInputStream(fis);
			System.out.println("successfully deserialize object");
			
			s1=(Student) ois.readObject();
			System.out.println(s1);

		} catch (FileNotFoundException e) {

			System.out.println("error");
			e.printStackTrace();
		} catch (ClassNotFoundException e) {

			System.out.println("ClassNotFoundEx");
			e.printStackTrace();
		}
		finally {
			fis.close();
			ois.close();
			System.out.println("close");
		}

	}
}
