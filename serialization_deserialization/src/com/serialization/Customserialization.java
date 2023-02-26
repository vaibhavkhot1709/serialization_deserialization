package com.serialization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.NotSerializableException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class X implements Serializable {
	int i;

	public X(int i) {
		super();
		this.i = i;
	}
}

class Y extends X {
	int j;

	public Y(int i, int j) {
		super(i);
		this.j = j;
	}

	@Override
	public String toString() {
		return "Y [ child j=" + j + ", parent i=" + i + "]";
	}

	private void writeObject(ObjectOutputStream oos) throws NotSerializableException {
		throw new NotSerializableException();
	}

	private void readObject(ObjectInputStream ois) throws NotSerializableException {
		throw new NotSerializableException();
	}

}

public class Customserialization {

	public static void main(String[] args) {

		Y y1 = new Y(10, 11);
//		System.out.println(y1);

		try {
			FileOutputStream fos = new FileOutputStream("C:/Users/admin/Desktop/New/CustomSerialization.txt");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(y1);
			fos.close();
			oos.close();

			System.out.println("Object serialize succssefully");

			FileInputStream fis = new FileInputStream("C:/Users/admin/Desktop/New/CustomSerialization.txt");
			ObjectInputStream ois = new ObjectInputStream(fis);
			Y y2 = (Y) ois.readObject();

//			s1=(Student) ois.readObject();
			fis.close();
			ois.close();
			System.out.println("deserialise successfully");
//			System.out.println(y2);
			System.out.println(y2.i);
			System.out.println(y2.j);

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
