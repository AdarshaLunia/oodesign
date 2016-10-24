package com.cdp.sigleton;

public class EagerSingleton {

	private static volatile EagerSingleton instance = new EagerSingleton();

	private EagerSingleton() {
		// TODO Auto-generated constructor stub
	}

	public static EagerSingleton getInstance() {
		System.out.println("EagerSingleton");
		return instance;
	}

	public static void main(String[] args) {

		getInstance();
		getInstance();
		getInstance();

	}

}
