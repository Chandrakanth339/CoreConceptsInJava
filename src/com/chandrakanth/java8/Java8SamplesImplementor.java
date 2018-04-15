package com.chandrakanth.java8;

public class Java8SamplesImplementor {

	public static void main(String[] argz) {
		/* Functional Interface having argument - 
		 * Define the argument followed by Lambda arrow head followed by block of code*/ 
		FunctionalInterfaceSample sample = (/*String */s) -> {
			System.out.println(s);
		};
		// call the actual method 
		sample.singleAbstractMethod("argument value");
		
		// static method call defined in Interface 
		System.out.println(FunctionalInterfaceSample.returnStaticMethodObject("Static method arg"));
		// default method call defined in interface
		System.out.println(sample.returnDefaultMethodObject("Default method arg"));
	}
}
