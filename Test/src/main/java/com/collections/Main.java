package com.collections;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		 ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("com/collections/config.xml");
		 Emp empbean = (Emp) context.getBean("emp1");
		 
		 System.out.println(empbean.getName());
		 System.out.println(empbean.getAddressees());
		 System.out.println(empbean.getPhone());
		 System.out.println(empbean.getCources());
		 
	}

}
