package com.ml.SpringDemo;

import org.springframework.stereotype.Component;

@Component
public class Cycle implements Vehicle {

	public void drive() {
		System.out.println("Cycle is running.....");
	}

}
