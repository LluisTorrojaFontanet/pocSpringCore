package cat.poc.ann01.ecn;

import org.springframework.stereotype.Component;

@Component("thatSillyCoach")
public class TennisCoach implements Coach {

	
	public String getDailyWorkout() {
		return "Practice your backhand volley";
	}

}
