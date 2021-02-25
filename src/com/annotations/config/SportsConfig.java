package com.annotations.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;


@Configuration
@ComponentScan("com.annotations.config")
public class SportsConfig {

	@Bean
	public FortuneService sadFortuneService() {
		return new SadFortuneService();
	}

	@Bean
	public Coach swimCoach() {
		return new SwimCoach(sadFortuneService());
	}

}
