package com.referenceType;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext coontext = new ClassPathXmlApplicationContext("com/referenceType/refconfig.xml");
		A beanA = (A) coontext.getBean("aClassreference");
		System.out.println(beanA.getX());
		System.out.println(beanA.getBj().getY());
	}

}
