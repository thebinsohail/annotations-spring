package com.annotations.config;

import org.springframework.stereotype.Component;

@Component("sillycoach")
public class TennisCoach implements Coach{

	@Override
	public String getDailyWorkout() {
		
		return "Tennis Coach Workout";
	}

}
