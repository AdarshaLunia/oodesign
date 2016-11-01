package com.sdp.adapter_demo;

public class TestAdapter {

	public static void main(String a[]) {

		Apple apple1 = new Apple();
		Apple apple2 = new Apple();
		apple1.getAColor("Green");

		Orange orange = new Orange();
		AppleAdapter adapter = new AppleAdapter(orange);
		adapter.getAColor("Red");

	}

}
/*
 * he adapter contains an instance of Orange, and extends Apple. It seems to be
 * that after an Orange object gets a adapter skin, it acts like an Apple object
 * now.
 * 
 */
