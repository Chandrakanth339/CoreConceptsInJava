package com.chandrakanth.miscellaneous;

import java.io.FileNotFoundException;

import org.apache.log4j.Logger;

public class MethodOverriddenClass {

	private static final Logger logger = Logger.getLogger(MethodOverriddenClass.class);

	private static final String CONSTANT_FIELD = "Juminfu";

	private static MethodOverriddenClass mOR = new MethodOverriddenClass();

	public static void main(String[] argz) throws Exception{
//		logger.info(mOR.bing());
	}

	// if this method is marked final, then the subclass cannot override this method
	public /*final*/ String bing() throws FileNotFoundException{
		return CONSTANT_FIELD;
	}

}
