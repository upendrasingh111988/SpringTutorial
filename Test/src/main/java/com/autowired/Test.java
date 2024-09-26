package com.autowired;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		 ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("com/autowired/config.xml");
		 Emp e1 = context.getBean("emp1",Emp.class);
		 System.out.println(e1);

	}

}
