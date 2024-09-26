package com.lifecycleMethod;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Pepsi implements InitializingBean, DisposableBean {
	private double price;
	
	public Pepsi() {
		
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Pepsi [price=" + price + "]";
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("Taking pepsi");
		
	}

	@Override
	public void destroy() throws Exception {
		System.out.println("Going to keep bottle to shop");
		
	}
	

}
