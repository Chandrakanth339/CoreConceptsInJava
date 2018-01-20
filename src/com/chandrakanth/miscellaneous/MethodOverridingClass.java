package com.chandrakanth.miscellaneous;

import java.io.FileNotFoundException;

public class MethodOverridingClass extends MethodOverriddenClass {

	private static final MethodOverridingClass mORDNG = new MethodOverridingClass();

	public static void main(String argz[]) {

	}

	// final Method cannot be overridden - if MethodOverriddenClass.bing() is marked final
	/*public final String bing() {
		
	}*/

	
	/* This is called inherited method overloading - in case if @Override is not 
	 * specified on this method and method signature is not @Override
	 * equivalent. 
	 * If @Override is specified, then method signature 
	 *  - cannot reduce the visibility in overriding method
	 *  - cannot override when actual method is static
	 *  - cannot throw super - Exceptions, if exception is thrown in actual method
	 *  - cannot throw an exception - if actual method doesn't throw exception at all
	 *  - can be left without throwing exception  -if actual method is throwing exception
	 *  - cannot have different return type when compared to actual method
	 *  - cannot have void return type , when actual method is returning the value
	*/
	@Override
	public String bing() throws FileNotFoundException{
		return "2" ;
	}
	
}
