package com.chandrakanth.miscellaneous;

import java.io.IOException;

import org.apache.log4j.Logger;

public class MethodSubjToOverriding {

	private static final Logger logger = Logger.getLogger(MethodSubjToOverriding.class);

	private static final String CONSTANT_FIELD = "PARENT";

	
	
	
	private static MethodSubjToOverriding mOR = new MethodSubjToOverriding();

	public static void main(String[] argz) throws Exception{
//		logger.info(mOR.bing());
	}

	// if this method is marked final, then the subclass cannot override this method
	public /*final*/ Number bing() throws IOException{
		return /*CONSTANT_FIELD;*/ new Integer(3);
	}

	public static String returnStaticValue() { 
		return CONSTANT_FIELD;
	}
	
	
	
}
