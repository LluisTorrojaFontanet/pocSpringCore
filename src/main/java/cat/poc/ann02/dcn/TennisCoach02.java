package cat.poc.ann02.dcn;

import org.springframework.stereotype.Component;

@Component
public class TennisCoach02 implements Coach {

	public String getDailyWorkout() {
		return "Practice your backhand volley";
	}

}
