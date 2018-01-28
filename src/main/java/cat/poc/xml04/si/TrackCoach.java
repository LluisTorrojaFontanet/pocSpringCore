package cat.poc.xml04.si;

public class TrackCoach implements Coach {

	private FortuneService fortuneService;

	public TrackCoach() {
		System.out.println("TrackCoach: inside no-arg constructor");		
	}
	
	// our setter method
	public void setFortuneService(FortuneService fortuneService) {
		System.out.println("TrackCoach: inside setter method - setFortuneService");
		this.fortuneService = fortuneService;
	}

	public String getDailyWorkout() {
		return "Run a hard 5k";
	}

	public String getDailyFortune() {
		return "Just Do It: " + fortuneService.getFortune();
	}

}










