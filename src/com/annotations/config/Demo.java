package com.annotations.config;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Demo {

	public static void main(String[] args) {
	
		ClassPathXmlApplicationContext context=
				new ClassPathXmlApplicationContext("beans.xml");
		
		Coach coach =context.getBean("sillycoach",Coach.class);
		System.out.println(coach.getDailyWorkout());
		
		context.close();
		
	}

}
