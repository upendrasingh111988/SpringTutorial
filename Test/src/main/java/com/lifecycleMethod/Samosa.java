package com.lifecycleMethod;

public class Samosa {
	private double price;

	public Samosa() {
		
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		System.out.println("Setting properties::");
		this.price = price;
	}

	@Override
	public String toString() {
		return "Samosa [price=" + price + "]";
	}
	
	public void init() {
		System.out.println("calling init method::");
	}
	public void destroy() {
		System.out.println("callling destroy method::");
	}

}
