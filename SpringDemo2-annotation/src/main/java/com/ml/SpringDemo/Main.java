package com.ml.SpringDemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

//Annotation Based Configuration

public class Main {
	public static void main(String[] args) {
		
		ApplicationContext context=new ClassPathXmlApplicationContext("Spring.xml");
		
		Vehicle vehicle = (Vehicle)context.getBean("cycle");
		vehicle.drive();
		
	}
}
