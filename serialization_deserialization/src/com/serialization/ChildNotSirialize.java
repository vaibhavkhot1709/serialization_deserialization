package com.serialization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.NotSerializableException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class AA implements Serializable{
	int i;

	public AA() {
		super();
		// TODO Auto-generated constructor stub
	}

	public AA(int i) {
		super();
		this.i = i;
	}
	
}

class BB extends AA{
	int j;

	public BB() {
		super();
		// TODO Auto-generated constructor stub
	}

	public BB(int i,int j) {
		super(i);
		this.j = j;
	}

	@Override
	public String toString() {
		return "BB [j=" + j + ", i=" + i + "]";
	}
	
	public void writeObject(ObjectOutputStream oo) throws IOException {
		throw new NotSerializableException();
	}
	
	public void readObject(ObjectInputStream oi) throws IOException {
		throw new NotSerializableException();
	}

}
public class ChildNotSirialize {

	public static void main(String[] args) {
		

		BB b1=new BB(10,20);
	        System.out.println("i = " + b1.i); 
	        System.out.println("j = " + b1.j); 
	          
	        BB b2 = null;

	        FileInputStream fis;
			try {
				FileOutputStream fos = new FileOutputStream("C:/Users/admin/Desktop/New/CustomSerialization.txt"); 
				ObjectOutputStream oos = new ObjectOutputStream(fos); 
				oos.writeObject(b1); 
				oos.close(); 
				fos.close(); 
				fis = new FileInputStream("C:/Users/admin/Desktop/New/CustomSerialization.txt");
				ObjectInputStream oi=new ObjectInputStream(fis);
				 b2=(BB)oi.readObject();
				fis.close();
				oi.close();
				
				
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
	        System.out.println("Object has been deserialized"); 
	          
	        System.out.println("i = " + b2.i); 
	        System.out.println("j = " + b2.j); 
		
		
	}
	
}
