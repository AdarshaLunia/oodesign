package com.cdp.sigleton;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;

public class SerializationTest {

	static DemoSingleton instanceOne = DemoSingleton.getInstance();

	public static void main(String a[]) throws ClassNotFoundException {

		try {
			ObjectOutput output = new ObjectOutputStream(new FileOutputStream("demoOne.txt"));
			output.writeObject(instanceOne);
			output.close();
			instanceOne.setI(12);

			ObjectInput in = new ObjectInputStream(new FileInputStream("demoOne.txt"));
			DemoSingleton instanceTwo = (DemoSingleton) in.readObject();
			in.close();

			System.out.println(instanceOne.getI());
			System.out.println(instanceTwo.getI());

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
