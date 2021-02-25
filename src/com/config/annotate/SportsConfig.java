//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.ComponentScan;
//import org.springframework.context.annotation.Configuration;
//
//import com.annotations.config.Coach;
//import com.annotations.config.FortuneService;
//import com.annotations.config.SadFortuneService;
//import com.annotations.config.SwimCoach;
//
//@Configuration
//@ComponentScan("com.annotations.config")
//public class SportsConfig {
//
//	@Bean
//	public FortuneService sadFortuneService() {
//		return new SadFortuneService();
//	}
//
//	@Bean
//	public Coach swimCoach() {
//		return new SwimCoach(sadFortuneService());
//	}
//
//}
