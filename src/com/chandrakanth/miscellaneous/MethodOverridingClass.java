package com.chandrakanth.miscellaneous;

import java.io.FileNotFoundException;
import java.io.IOException;

public class MethodOverridingClass extends MethodOverriddenClass {

	private static final MethodOverridingClass mORDNG = new MethodOverridingClass();

	public static void main(String argz[]) throws IOException {
//		System.out.println(mORDNG.returnStaticValue());
		MethodOverriddenClass mOVRDN = new MethodOverridingClass();
		System.out.println(mOVRDN.returnStaticValue());
		System.out.println(MethodOverriddenClass.returnStaticValue());
		System.out.println(MethodOverridingClass.returnStaticValue());
		MethodOverriddenClass mOVC = new MethodOverridingClass();
		System.out.println(mOVC.bing());
	
	}

	// final Method cannot be overridden - if MethodOverriddenClass.bing() is marked final
	/*public final String bing() {
		
	}*/

	/* This is called inherited method overloading - in case if @Override is not 
	 * specified on this method and method signature is not @Override
	 * equivalent. 
	 * @Overriding is otherwise called as runtime polymorphism
	 * If @Override is specified, then method signature 
	 *  - cannot reduce the visibility in overriding method
	 *  - cannot override when actual method is static
	 *  - cannot override when actual method is final
	 *  - can have covariant return type
	 *  - cannot throw super - Exceptions, if exception is thrown in actual method
	 *  - cannot throw an exception - if actual method doesn't throw exception at all
	 *  - can be left without throwing exception  -if actual method is throwing exception
	 *  - cannot have different return type when compared to actual method
	 *  - cannot have void return type , when actual method is returning the value
	*/
	@Override
	public Integer bing() throws FileNotFoundException{
		return /*"CHILD" ;*/ new Integer(4);
	}
	
	
	public static String returnStaticValue() { 
		return "abc";
	}
	
	
}
