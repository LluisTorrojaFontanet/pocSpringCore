package cat.poc.pojo02.bc;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Spring bean configuration with java spring configuration
 */
public class MyApp {

	public static void main(String[] args) {

		// read spring config java class
		AnnotationConfigApplicationContext context = 
				new AnnotationConfigApplicationContext(SportConfig.class);
		
		// get the bean from spring container
		Coach theCoach = context.getBean("swimCoach", Coach.class);
		
		// call a method on the bean
		System.out.println(theCoach.getDailyWorkout());
				
		// call method to get the daily fortune
		System.out.println(theCoach.getDailyFortune());
			
		// close the context
		context.close();
		
	}

}


