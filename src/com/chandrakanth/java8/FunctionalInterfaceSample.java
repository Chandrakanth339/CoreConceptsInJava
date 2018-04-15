package com.chandrakanth.java8;

@FunctionalInterface
public interface FunctionalInterfaceSample {

	void singleAbstractMethod(String value);

	default String returnDefaultMethodObject(String object) {
		return object;
	}
	
	static String returnStaticMethodObject(String object) {
		return object;
	}
	
}
