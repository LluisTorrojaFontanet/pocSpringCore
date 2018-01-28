package cat.poc.ann08.blc;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Spring bean life cycle with annotations configuration
 */
public class MyApp {

	public static void main(String[] args) {

		// load spring config file
		ClassPathXmlApplicationContext context = new 
				ClassPathXmlApplicationContext("applicationAnnotationsContext.xml");	
				
		// retrieve bean from spring container
		Coach theCoach = context.getBean("tennisCoach08", Coach.class);

		Coach alphaCoach = context.getBean("tennisCoach08", Coach.class);
		
		// check if they are the same
		boolean result = (theCoach == alphaCoach);
		
		// print out the results
		System.out.println("\nPointing to the same object: " + result);
		
		System.out.println("\nMemory location for theCoach: " + theCoach);

		System.out.println("\nMemory location for alphaCoach: " + alphaCoach + "\n");
		
		// close the context
		context.close();
	}

}








