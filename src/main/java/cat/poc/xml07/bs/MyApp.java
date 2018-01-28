package cat.poc.xml07.bs;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Spring bean scopes
 */
public class MyApp {

	public static void main(String[] args) {

		// load the spring configuration file
		ClassPathXmlApplicationContext context =
				new ClassPathXmlApplicationContext("beanScope-applicationContext.xml");
				
		// retrieve bean from spring container
		
		// default scope
		Coach theCoachDef = context.getBean("myCoachDef07", Coach.class);
		Coach alphaCoachDef = context.getBean("myCoachDef07", Coach.class);
		// prototype scope
		Coach theCoachPro = context.getBean("myCoachPro07", Coach.class);
		Coach alphaCoachPro = context.getBean("myCoachPro07", Coach.class);
		
		// check if they are the same
		boolean resultDef = (theCoachDef == alphaCoachDef);
		boolean resultPro = (theCoachPro == alphaCoachPro);
		
		// print out the results
		System.out.println("\nDEfault scope");
		System.out.println("\nPointing to the same object: " + resultDef);
		System.out.println("\nMemory location for theCoachDef: " + theCoachDef);
		System.out.println("\nMemory location for alphaCoachDef: " + alphaCoachDef + "\n");

		System.out.println("\nPrototype scope");
		System.out.println("\nPointing to the same object: " + resultPro);
		System.out.println("\nMemory location for theCoachPro: " + theCoachPro);
		System.out.println("\nMemory location for alphaCoachPro: " + alphaCoachPro + "\n");
	
		// close the context
		context.close();
	}

}








