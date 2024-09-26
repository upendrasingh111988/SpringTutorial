package com.lifecycleMethod;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		 AbstractApplicationContext context = new ClassPathXmlApplicationContext("com/lifecycleMethod/samosaconfig.xml");
		 context.registerShutdownHook();
		 Samosa samosabean = (Samosa) context.getBean("samosa1");
		 System.out.println(samosabean);
		
		 
		 Pepsi pepsibean = (Pepsi) context.getBean("p1");
		 System.out.println(pepsibean);
		 
		 Example examplebean = (Example) context.getBean("e1");
		 System.out.println(examplebean);
		 //context.registerShutdownHook();
	}

}
