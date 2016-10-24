package com.cdp.sigleton;

import java.io.Serializable;

public class DemoSingleton implements Serializable {

	private volatile static DemoSingleton instance = null;
	private int i = 10;

	public static DemoSingleton getInstance() {

		if (instance == null) {
			instance = new DemoSingleton();
		}
		return instance;
	}

	public int getI() {
		return i;
	}

	public void setI(int i) {
		this.i = i;
	}

	// we need to include readResolve() method in our DemoSingleton class.
	// This method will be invoked when you will de-serialize the object.
	// Inside this method, you must return the existing instance to ensure
	// single instance application wide

	protected Object readResolve() {
		return instance;
	}

}
