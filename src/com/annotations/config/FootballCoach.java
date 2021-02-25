package com.annotations.config;

import org.springframework.stereotype.Component;

@Component
public class FootballCoach implements Coach{

	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "Football Coach Workout";
	}

	@Override
	public String getFortune() {
		// TODO Auto-generated method stub
		return null;
	}

}
