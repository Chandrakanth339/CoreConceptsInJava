package com.chandrakanth.miscellaneous;

import org.apache.log4j.Logger;

public class ClassNotFoundExceptionSample {

	private static final Logger logger = Logger.getLogger(ClassNotFoundExceptionSample.class);

	public static void main(String argz[]) {
		Class<?>/* Object */ x;
		try {

			/*
			 * NOTE: Whichever the exceptions we handle at compile time, are known to be
			 * Compile-Time Exceptions
			 */
			// Throws ClassNotFoundException - if no class is available in the classpath
			/*
			 * can be a case where corresponding Java class itself is nowhere avaialble in
			 * any of the packages in the project or can be a case where corresponding
			 * .class file is not available to process, if Class.forName is used
			 * 
			 */
			/*
			 * Throws InstantiationException - if new instance does not exist for a given
			 * class, Enum for Example
			 */
			/*
			 * Throws IllegalAccessException - if we are trying to get an instance from
			 * class of an object that has private constructor
			 */
			x = Class.forName("com.chandrakanth.miscellaneous.PrivateConstructor");

			/*
			 * Throws unchecked Exception - NoClassDefFoundError If a class is being
			 * referenced and that corresponding .class file is not available at runtime
			 * this runtime exception is wrapped by ClassNotFoundException
			 */
			PrivateConstructor pv = new PrivateConstructor();
			logger.info(x.newInstance());
		}
		/* Applicable from Java 1.7 - we can combine exceptions as a single argument 
		 * augmented with Binary OR operator, in case if the catch block has
		 * same set of instructions for all such different exceptions
		 */
		catch (ClassNotFoundException | InstantiationException | IllegalAccessException e) {
			e.printStackTrace();
		}

	}
}
