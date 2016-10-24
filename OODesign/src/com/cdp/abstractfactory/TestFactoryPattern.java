package com.cdp.abstractfactory;

import com.cdp.factory_one.CarType;

public class TestFactoryPattern {

	public static void main(String[] args) {
		System.out.println(CarFactory.buildCar(CarType.SMALL));
		System.out.println(CarFactory.buildCar(CarType.SEDAN));
		System.out.println(CarFactory.buildCar(CarType.LUXURY));
	}
}