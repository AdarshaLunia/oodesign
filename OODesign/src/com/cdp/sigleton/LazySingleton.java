package com.cdp.sigleton;

public class LazySingleton {

	private static volatile LazySingleton instance = null;

	// private constructor
	private LazySingleton() {
	}

	public static LazySingleton getInstance() {
		if (instance == null) {
			System.out.println("LazySingleton");
			synchronized (LazySingleton.class) {
				// Double check
                if (instance == null) {
                    instance = new LazySingleton();
                }
			}
		}
		return instance;
	}

	public static void main(String[] args) {
		getInstance();
		getInstance();

	}

}
