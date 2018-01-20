package com.chandrakanth.json;

public class POJOClass {

	private String stringField;
	private boolean booleanField;
	private int intField;

	public POJOClass() {
		super();
	}

	public POJOClass(String stringField, boolean booleanField, int intField) {
		super();
		this.stringField = stringField;
		this.booleanField = booleanField;
		this.intField = intField;
	}

	public String getStringField() {
		return stringField;
	}

	public void setStringField(String stringField) {
		this.stringField = stringField;
	}

	public boolean isBooleanField() {
		return booleanField;
	}

	public void setBooleanField(boolean booleanField) {
		this.booleanField = booleanField;
	}

	public int getIntField() {
		return intField;
	}

	public void setIntField(int intField) {
		this.intField = intField;
	}

}
