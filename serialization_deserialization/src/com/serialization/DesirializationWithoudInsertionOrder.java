package com.serialization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class DesirializationWithoudInsertionOrder {

	public static void main(String[] args) {

		Student s1 = new Student(11, "male");
		Employee e1 = new Employee(12, "M", 3333, "nnn");
		Employee e2 = new Employee(13, "F", 4444, "zzz");
		
		FileOutputStream fos=null;
		ObjectOutputStream oos=null;
		
		FileInputStream fis=null;
		ObjectInputStream ois=null;
		
		try {
			fos=new FileOutputStream("C:\\Users\\admin\\Desktop\\New\\withoutpath.txt");
			oos=new ObjectOutputStream(fos);
			oos.writeObject(s1);
			oos.writeObject(e1);
			oos.writeObject(e2);
			
			System.out.println("serializeee suuccssess>>");
			
			fis=new FileInputStream("C:\\Users\\admin\\Desktop\\New\\withoutpath.txt");
			ois=new ObjectInputStream(fis);
			
			if(ois.available()!=0) {
				Object o=ois.readObject();
				while(o!=null) {
					if(o instanceof Employee)
						e1=(Employee)o;
					else if(o instanceof Student)
						s1=(Student)o;
					else if(o instanceof Employee)
						e2=(Employee)o;
					
				}
				
			}
			System.out.println(">>>>>>>>>>>>>>>>>");
			System.out.println(s1);
			System.out.println(e1);
			System.out.println(e2);
			
			
		} catch (FileNotFoundException e) {
			
			System.out.println("error FileNotFoundException");
			e.printStackTrace();
		} catch (IOException e) {
			System.out.println("error IOException");
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			System.out.println("error ClassNotFound");
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				fos.close();
				oos.close();
				
				fis.close();
				ois.close();
			} catch (IOException e) {
				System.out.println("error IOex closing");
				e.printStackTrace();
			}
		}
		
	}
}
