package com.ml.SpringDemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Samsung {
	
	@Autowired
	private Snapdragon cpu;
	
	public Snapdragon getCpu() {
		return cpu;
	}

	public void setCpu(Snapdragon cpu) {
		this.cpu = cpu;
	}

	void configuration() {
		System.out.println("Octa Core, 8gb Ram, 32 MP Camera");
		cpu.processor();
	}

	@Override
	public String toString() {
		return "Samsung [cpu=" + cpu + "]";
	}
	
}
