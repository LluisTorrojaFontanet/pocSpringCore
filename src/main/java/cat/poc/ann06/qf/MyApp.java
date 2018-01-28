package cat.poc.ann06.qf;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Spring qualifiers with annotations configuration
 */
public class MyApp {

	public static void main(String[] args) {

		// read spring config file
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("applicationAnnotationsContext.xml");
		
		// get the bean from spring container
		Coach theCoach = context.getBean("tennisCoach06", Coach.class);
		
		// call a method on the bean
		System.out.println(theCoach.getDailyWorkout());

		// call method to get daily fortune
		System.out.println(theCoach.getDailyFortune());
				
		// close the context
		context.close();	
	}

}


