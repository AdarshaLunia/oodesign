package com.sdp.facade;

public class OrderFacade {
	private Payment pymt = new Payment();
	private Inventory inventry = new Inventory();

	public void placeOrder(String orderId) {
		String step1 = inventry.checkInventry(orderId);
		String step2 = pymt.deductPayment(orderId);
		System.out.println("Following steps completed:\n" + step1 + " & " + step2);
	}
}
