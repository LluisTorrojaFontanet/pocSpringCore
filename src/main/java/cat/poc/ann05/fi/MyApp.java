package cat.poc.ann05.fi;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Spring field injection with annotations configuration
 */
public class MyApp {

	public static void main(String[] args) {

		// read spring config file
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("applicationAnnotationsContext.xml");
		
		// get the bean from spring container
		Coach theCoach = context.getBean("tennisCoach05", Coach.class);
		
		// call a method on the bean
		System.out.println(theCoach.getDailyWorkout());

		// call method to get daily fortune
		System.out.println(theCoach.getDailyFortune());
				
		// close the context
		context.close();	
	}

}


