package com.cdp.abstractfactory;

import com.cdp.factory_one.CarType;

public abstract class Car {

	private CarType model = null;
	private Location location = null;

	public CarType getModel() {
		return model;
	}

	public void setModel(CarType model) {
		this.model = model;
	}

	public Location getLocation() {
		return location;
	}

	public void setLocation(Location location) {
		this.location = location;
	}

	public Car(CarType model, Location location) {
		super();
		this.model = model;
		this.location = location;
	}

	@Override
	public String toString() {
		return "Car [model=" + model + ", location=" + location + "]";
	}
	protected abstract void construct();

}
