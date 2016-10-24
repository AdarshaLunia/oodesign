package com.cdp.abstractfactory;

import com.cdp.factory_one.CarType;

public class LuxuryCar extends Car {

	public LuxuryCar(Location location) {
		super(CarType.LUXURY, location);
		// TODO Auto-generated constructor stub
		construct();
	}

	@Override
	protected void construct() {
		System.out.println("Building LuxuryCar ");

	}

}
