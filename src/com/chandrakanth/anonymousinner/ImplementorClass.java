package com.chandrakanth.anonymousinner;

public class ImplementorClass implements Interface {

	private String newString;

	
	@Override
	public String getNewString() {
		return newString;
	}

	public void setNewString(String newString) {
		this.newString = newString;
	}
	
}
