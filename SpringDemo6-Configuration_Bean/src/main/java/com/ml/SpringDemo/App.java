package com.ml.SpringDemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {

	public static void main(String[] args) {
		
		ApplicationContext context=new AnnotationConfigApplicationContext(AppConfig.class);
		Samsung samsung=(Samsung)context.getBean(Samsung.class);
		samsung.configuration();
	}

}
