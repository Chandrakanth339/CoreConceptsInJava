package com.chandrakanth.enums;

import org.apache.log4j.Logger;

public class EnumImpl {

	private static final Logger logger = Logger.getLogger(EnumImpl.class);
	public static void main(String[] argz) {
		logger.info(Enum.ASITA);
		logger.info(Enum.ASITA.getCode());
		logger.info(Enum.ASITA.getStr());
	   
	}
}
