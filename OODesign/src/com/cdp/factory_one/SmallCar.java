package com.cdp.factory_one;

public class SmallCar extends Car {

	public SmallCar() {
		super(CarType.SMALL);
		construct();
	}

	@Override
	protected void construct() {
		System.out.println("I am Small Car");

	}

}
