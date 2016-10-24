package com.cdp.abstractfactory;

import com.cdp.factory_one.CarType;

public class AsiaCarFactory {

	public static Car buildCar(CarType model) {
		Car car = null;
		switch (model) {
		case SMALL:
			car = new LuxuryCar(Location.ASIA);
			break;
		case LUXURY:
			car = new LuxuryCar(Location.ASIA);
			break;
		case SEDAN:
			car = new LuxuryCar(Location.ASIA);
			break;

		default:
			break;
		}
		return car;

	}

}
