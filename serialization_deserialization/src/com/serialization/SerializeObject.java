package com.serialization;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.net.URLDecoder;

public class SerializeObject {

	public static void main(String[] args){
		Student s1=new Student(11,"aaa");
//		System.out.println(s1);
		
//		String filename="Hello.txt";  
		FileOutputStream fos = null;
		ObjectOutputStream oos = null;
		
		
		try {
//			fos= new FileOutputStream(filename);   we can use this also
			fos= new FileOutputStream("C:/Users/admin/Desktop/New/abc.txt");
			oos=new ObjectOutputStream(fos);
			oos.writeObject(s1);
			System.out.println("successfully serializa object!!");
		}
		catch(FileNotFoundException e) {
			System.out.println("error");
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
			try {
				fos.close();
				oos.close();
				System.out.println("close");
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		
		
		
	}

}
