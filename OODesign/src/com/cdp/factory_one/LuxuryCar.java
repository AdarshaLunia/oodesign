package com.cdp.factory_one;

public class LuxuryCar extends Car {

	public LuxuryCar() {
		super(CarType.LUXURY);
		construct();
	}

	@Override
	protected void construct() {
		System.out.println("Building Luxury Car");

	}

}
