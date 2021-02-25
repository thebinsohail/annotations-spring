package com.annotations.config;

import org.springframework.beans.factory.annotation.Value;

public class SwimCoach implements Coach {

	private FortuneService fortuneService;


	@Value("${foo.email}")
	private String email;
	
	@Value("${foo.username}")
	private String username;
	
	public String getUsername() {
		return username;
	}


	public String getEmail() {
		return email;
	}

	

	
	

	public SwimCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {

		return "Swim Swim Swim x 10";
	}

	@Override
	public String getFortune() {

		return fortuneService.getFortune();
	}

}
