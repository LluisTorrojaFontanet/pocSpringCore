package cat.poc.xml05.ilv;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Injecting literal values with xml spring configuration
 */
public class MyApp {

	public static void main(String[] args) {

		// load the spring configuration file
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("applicationContext.xml");
		
		// retrieve bean from spring container
		CricketCoach theCoach = context.getBean("myCoach05", CricketCoach.class);
		
		// call methods on the bean
		// ... let's come back to this ...
		System.out.println(theCoach.getDailyWorkout());
		
		System.out.println(theCoach.getDailyFortune());
		
		// call our new methods to get the literal values
		System.out.println(theCoach.getEmailAddress());
		
		System.out.println(theCoach.getTeam());
				
		// close the context
		context.close();
	}

}






