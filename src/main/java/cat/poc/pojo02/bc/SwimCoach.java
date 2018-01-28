package cat.poc.pojo02.bc;

public class SwimCoach implements Coach {

	private FortuneService fortuneService;

	public SwimCoach(FortuneService theFortuneService) {
		fortuneService = theFortuneService;
	}
	
	public String getDailyWorkout() {
		return "Swim 1000 meters as a warm up.";
	}

	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

}




