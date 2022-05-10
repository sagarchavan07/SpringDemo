package com.ml.SpringDemo;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
public class MediaTek implements MobileProcessor{
	
	public void processor() {
		System.out.println("MediaTek is worlds 2nd Best Processor");
	}
}
