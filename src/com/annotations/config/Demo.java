package com.annotations.config;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Demo {

	public static void main(String[] args) {
	
//		ClassPathXmlApplicationContext context=
//				new ClassPathXmlApplicationContext("beans.xml");
		
		//Configuration with annotation
		AnnotationConfigApplicationContext context=
				new AnnotationConfigApplicationContext(SportsConfig.class);
		
		Coach tennis =context.getBean("tennisCoach",Coach.class);
		System.out.println(tennis.getDailyWorkout());
		
		Coach football=context.getBean("footballCoach",Coach.class);
		System.out.println(football.getDailyWorkout());

		context.close();
		
	}

}
