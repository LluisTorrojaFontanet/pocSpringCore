package cat.poc.ann04.si;

import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.Autowired;

@Component
public class TennisCoach04 implements Coach {

	private FortuneService04 fortuneService;
	
	// define a default constructor
	public TennisCoach04() {
		System.out.println(">> TennisCoach: inside default constructor");
	}

	// define a setter method
	@Autowired
	public void setFortuneService(FortuneService04 theFortuneService) {
		System.out.println(">> TennisCoach: inside setFortuneService() method");
		this.fortuneService = theFortuneService;
	}

	/*
	@Autowired
	public TennisCoach(FortuneService theFortuneService) {
		fortuneService = theFortuneService;
	}
	*/
	
	public String getDailyWorkout() {
		return "Practice your backhand volley";
	}

	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

}
