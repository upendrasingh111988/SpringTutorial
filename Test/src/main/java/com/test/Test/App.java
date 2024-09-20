package com.test.Test;

import org.springframework.beans.BeansException;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        
        try (ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("config.xml")) {
			Student  studentbean = (Student) classPathXmlApplicationContext.getBean("student1");
			Student student2 = (Student) classPathXmlApplicationContext.getBean("student2");
			System.out.println("Detais f student 2::"+ student2);
			System.out.println("Student first infrmation::"+ studentbean);
		} catch (BeansException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }
}
