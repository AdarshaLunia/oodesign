package com.cdp.abstractfactory;

import com.cdp.factory_one.CarType;

public class DefaultFactory {

	public static Car buildCar(CarType model) {
		Car car = null;
		switch (model) {
		case SMALL:
			car = new LuxuryCar(Location.DEFAULT);
			break;
		case LUXURY:
			car = new LuxuryCar(Location.DEFAULT);
			break;
		case SEDAN:
			car = new LuxuryCar(Location.DEFAULT);
			break;

		default:
			break;
		}
		return car;

	}

}
