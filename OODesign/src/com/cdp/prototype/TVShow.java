package com.cdp.prototype;

public class TVShow implements PrototypeCapable {
	private String name = null;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public TVShow clone() throws CloneNotSupportedException {
		System.out.println("Cloning Show object..");
		return (TVShow) super.clone();
	}

	@Override
	public String toString() {
		return "Show";
	}
}