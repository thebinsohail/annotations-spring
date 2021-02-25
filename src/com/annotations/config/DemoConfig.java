package com.annotations.config;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class DemoConfig {

	public static void main(String[] args) {

		//Configuration with annotation
		AnnotationConfigApplicationContext context=
				new AnnotationConfigApplicationContext(SportsConfig.class);
		
//		Coach tennis =context.getBean("tennisCoach",Coach.class);
//		System.out.println(tennis.getDailyWorkout());
//		
//		Coach football=context.getBean("footballCoach",Coach.class);
//		System.out.println(football.getDailyWorkout());

		Coach swimming=context.getBean("swimCoach",Coach.class);	
		System.out.println(swimming.getDailyWorkout());
		System.out.println(swimming.getFortune());
		
		context.close();
		
	}

}
