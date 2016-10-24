package com.cdp.factory_one;

public class TestFactoryPattern {

	public static void main(String a[]) {
		System.out.println(CarFactory.carBuilder(CarType.SMALL));
		System.out.println(CarFactory.carBuilder(CarType.SEDAN));
		System.out.println(CarFactory.carBuilder(CarType.LUXURY));
	}

}
