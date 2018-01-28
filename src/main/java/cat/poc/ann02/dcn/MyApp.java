package cat.poc.ann02.dcn;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Spring default componnent name with annotations configuration
 */
public class MyApp {

	public static void main(String[] args) {

		// read spring config file
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("applicationAnnotationsContext.xml");
		
		// get the bean from spring container
		Coach theCoach = context.getBean("tennisCoach02", Coach.class);
		
		// call a method on the bean
		System.out.println(theCoach.getDailyWorkout());
				
		// close the context
		context.close();
		
	}

}


