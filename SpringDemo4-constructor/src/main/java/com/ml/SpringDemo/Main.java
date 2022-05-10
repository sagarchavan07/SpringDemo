package com.ml.SpringDemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

//Constructor Injection

public class Main {
	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("Spring.xml");
		
		
		Tyre tyre=(Tyre)context.getBean("tyre");
		System.out.println(tyre);
	}
}
