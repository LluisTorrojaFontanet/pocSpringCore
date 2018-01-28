package cat.poc.xml08.blc;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Spring life cycle with spring java configuration
 */
public class MyApp {
	
	public static void main(String[] args) {

		// load the spring configuration file
		ClassPathXmlApplicationContext context =
				new ClassPathXmlApplicationContext("beanLifeCycle-applicationContext.xml");
				
		// retrieve bean from spring container
		Coach theCoach = context.getBean("myCoach08", Coach.class);

		System.out.println(theCoach.getDailyWorkout());
		
		// close the context
		context.close();
	}

}








