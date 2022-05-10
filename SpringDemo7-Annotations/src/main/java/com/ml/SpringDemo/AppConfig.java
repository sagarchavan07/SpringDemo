package com.ml.SpringDemo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

@Component
@ComponentScan(basePackages="com.ml.SpringDemo")
public class AppConfig 
{
	//	@Bean
	//	public Samsung s7() {
	//		return new Samsung();
	//	}
	//	
	//	@Bean
	//	public Snapdragon cpu() {
	//		return new Snapdragon();
	//	}
}
