package com.wz.debug;

import com.wz.debug.service.CityService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author zhen.wang
 */
@ComponentScan("com.wz")
@Configuration
public class DebugSpring {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(DebugSpring.class);
		System.out.println(ac.getBean(CityService.class));
	}
}
