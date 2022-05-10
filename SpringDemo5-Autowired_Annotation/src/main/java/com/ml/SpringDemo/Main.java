package com.ml.SpringDemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

//Autowired Annotation of field Tyre in Car Class

public class Main {
	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("Spring.xml");
		
		Vehicle vehicle = (Vehicle)context.getBean("car");
		vehicle.drive();
		

	}
}
