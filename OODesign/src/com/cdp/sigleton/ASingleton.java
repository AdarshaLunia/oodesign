package com.cdp.sigleton;

public class ASingleton {

	private static ASingleton instance = null;

	private ASingleton() {

	}

	public static ASingleton getInstance() {
		if (instance == null) {
			System.out.println("I am Done");
			instance = new ASingleton();
		}
		return instance;

	}

	public static void main(String a[]) {
		getInstance();
		getInstance();

	}

}
