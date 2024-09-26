package com.constructor;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("com/constructor/personconfig.xml");
		Person personbean = (Person) context.getBean("person");
		//System.out.println(personbean);
		
		Addition additionbean = (Addition) context.getBean("add");
		additionbean.doSum();

	}

}
