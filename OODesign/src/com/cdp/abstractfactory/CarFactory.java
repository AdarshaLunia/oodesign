package com.cdp.abstractfactory;

import com.cdp.factory_one.CarType;

public class CarFactory {

	private CarFactory() {
	}

	public static Car buildCar(CarType carType) {
		Car car = null;
		Location location = Location.DEFAULT; // Read location property somewhere
											// from configuration
											// Use location specific car factory

		switch (location) {
		case USA:
			car = USAFactory.buildCar(carType);
			break;
		case ASIA:
			car = AsiaCarFactory.buildCar(carType);
			break;
		default:
			car = DefaultFactory.buildCar(carType);
		}
		return car;
	}

}
