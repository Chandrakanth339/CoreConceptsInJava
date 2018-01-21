package com.chandrakanth.miscellaneous;

import org.apache.log4j.Logger;

public class ClassNotFoundExceptionSample {
	
	private static final Logger logger = Logger.getLogger(ClassNotFoundExceptionSample.class);
	
	public static void main(String argz[]) {
		Class<?>/*Object*/ x;
		try {
			
			/*NOTE: Whichever the exception we handle at compile time, are known to be Compile-Time
			Exceptions*/
			// Throws ClassNotFoundException - if no class is available in the classpath
			/*Throws InstantiationException - 
			 * if new instance does not exist for a given class, Enum for Example
			 *Throws IllegalAccessException - if we are trying to get an instance from 
			 *class of an object that has private constructor 
			*/
			x = Class.forName("com.chandrakanth.miscellaneous.PrivateConstructor");
			logger.info(x.newInstance());
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (InstantiationException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		}
		
		
	}
}
