package com.chandrakanth.miscellaneous;

public class PrivateConstructor {

	
	private PrivateConstructor() {
		
	}
	
	public PrivateConstructor newInstance() {
		return new PrivateConstructor();
	}
	
}
