package com.ml.SpringDemo;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
public class Snapdragon implements MobileProcessor {
	
	public void processor() {
		System.out.println("Qualcomm Snapdragon is worlds Best Processor");
	}
}
