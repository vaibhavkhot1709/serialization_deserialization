package com.serialization;

import java.io.Externalizable;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;

public class ExternalizationDemo implements Externalizable {

	int roll;
	String nm;

	public ExternalizationDemo() {
		super();
	}

	public ExternalizationDemo(int roll, String nm) {
		super();
		this.roll = roll;
		this.nm = nm;
	}

	@Override
	public String toString() {
		return "ExternalizationDemo [roll=" + roll + ", nm=" + nm + "]";
	}
	
//
//	public int getRoll() {
//		return roll;
//	}
//
//	public void setRoll(int roll) {
//		this.roll = roll;
//	}
//
//	public String getNm() {
//		return nm;
//	}
//
//	public void setNm(String nm) {
//		this.nm = nm;
//	}

	@Override
	public void writeExternal(ObjectOutput out) throws IOException {
		out.writeInt(roll);
		out.writeUTF(nm);
	}

	@Override
	public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
		roll = in.readInt();
		nm = (String) in.readUTF();
	}

	public static void main(String[] args) {

		ExternalizationDemo ex = new ExternalizationDemo(11, "abc");
		try {
			FileOutputStream fos = new FileOutputStream(
					"D:\\Eclipse IDE\\Java\\serialization_deserialization\\src\\ExternalizationDemo.txt");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(ex);
			fos.close();
			oos.close();

			System.out.println("ExternalizationDemo get serialize successfully");

			FileInputStream fis = new FileInputStream(
					"D:\\Eclipse IDE\\Java\\serialization_deserialization\\src\\ExternalizationDemo.txt");
			ObjectInputStream ois = new ObjectInputStream(fis);

			ExternalizationDemo e2 = (ExternalizationDemo) ois.readObject();

			System.out.println("ExternalizationDemo deserialize suuccessfully");

			System.out.println("ex2 roll : " + e2.roll);
			System.out.println("ex2 nm   : " + e2.nm);

		} catch (FileNotFoundException e) {

			System.out.println("FileNotFound");
			e.printStackTrace();
		} catch (IOException e) {
			System.out.println("IOEx");
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			System.out.println("ClassNotFound");
			e.printStackTrace();
		}

	}
}
