package com.cdp.abstractfactory;

import com.cdp.factory_one.CarType;

public class USAFactory {

	public static Car buildCar(CarType model) {
		Car car = null;
		switch (model) {
		case SMALL:
			car = new LuxuryCar(Location.USA);
			break;
		case LUXURY:
			car = new LuxuryCar(Location.USA);
			break;
		case SEDAN:
			car = new LuxuryCar(Location.USA);
			break;

		default:
			break;
		}
		return car;

	}

}
