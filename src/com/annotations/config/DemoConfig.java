package com.annotations.config;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class DemoConfig {

	public static void main(String[] args) {

		//Configuration with annotation
		AnnotationConfigApplicationContext context=
				new AnnotationConfigApplicationContext(SportsConfig.class);
		


//		Coach swimming=context.getBean("swimCoach",Coach.class);	
//		System.out.println(swimming.getDailyWorkout());
//		System.out.println(swimming.getFortune());
		SwimCoach swimming=context.getBean("swimCoach",SwimCoach.class);
		System.out.println("Value Injection");
		System.out.println(swimming.getEmail());
		System.out.println(swimming.getUsername());
		
		context.close();
		
	}

}
