package com.cdp.factory_one;

public abstract class Car {

	private CarType model = null;

	public CarType getModel() {
		return model;
	}

	public void setModel(CarType model) {
		this.model = model;
		arrangeParts();
	}

	public Car(CarType carType) {

	}

	protected abstract void construct();

	private void arrangeParts() {
		// Do one time processing here
	}

}
