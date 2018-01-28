package cat.poc.xml01.pojo;

/**
 * Prototype with no spring configuration
 */
public class MyApp {

	public static void main(String[] args) {

		// create the object
		// Coach theCoach = new BaseballCoach();
		Coach theCoach = new TrackCoach();
		
		// use the object
		System.out.println(theCoach.getDailyWorkout());		
	}

}
