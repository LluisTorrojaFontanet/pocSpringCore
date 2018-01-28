package cat.poc.ann04.si;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Spring setter injection with annotations configuration
 */
public class MyApp {

	public static void main(String[] args) {

		// read spring config file
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("applicationAnnotationsContext.xml");
		
		// get the bean from spring container
		Coach theCoach = context.getBean("tennisCoach04", Coach.class);
		
		// call a method on the bean
		System.out.println(theCoach.getDailyWorkout());

		// call method to get daily fortune
		System.out.println(theCoach.getDailyFortune());
				
		// close the context
		context.close();	
	}

}


