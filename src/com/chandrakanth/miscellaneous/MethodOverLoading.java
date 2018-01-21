package com.chandrakanth.miscellaneous;

import org.apache.log4j.Logger;

public class MethodOverLoading {

	Logger logger = Logger.getLogger(MethodOverLoading.class);

	static MethodOverLoading mL = new MethodOverLoading();

	public static void main(String[] args) {
		try {
			mL.logger.info("Method invocations for different overloaded methods");
			mL.logger.info(mL.overLoadingMethod("", Integer.valueOf(3)));
			mL.overLoadingMethod("", 1);
			mL.logger.info(mL.overLoadingMethod("", Integer.valueOf(3)));
			mL.logger.info(overLoadingMethod("", Double.valueOf(3)));
		} catch (Exception e) {
			mL.logger.info(" Error !!!");
		}
	}

	// Method to be overloaded
	private final Number overLoadingMethod(String str1, int int1) throws Exception {
		return new Integer(20);
	}

	/*
	 * Access - visibility increased Argument datatypes changed, returntype changed
	 * Allowed (No compilation Error)
	 */
	Integer overLoadingMethod(String str1, Integer integerValue) {
		return integerValue;
	}

	/*
	 * Exception Thrown - Allowed
	 */
	float overLoadingMethod(String str2, float floatVal) throws Exception {
		return floatVal;
	}

	/*
	 * static keyword added - Allowed
	 */
	static double overLoadingMethod(String str2, Double doubleVal) throws Exception {
		return doubleVal;
	}

}
