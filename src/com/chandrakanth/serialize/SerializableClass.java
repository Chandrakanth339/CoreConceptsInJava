package com.chandrakanth.serialize;

import java.io.Serializable;

public class SerializableClass implements Serializable{

//	private static final long serialVersionUID = 1L;
	
	private String newString = "new String";
	private int newInt = 4;
	private Integer integer = new Integer(20);
	private transient long longValue = 4L;
	public int getNewInt() {
		return newInt;
	}
	public void setNewInt(int newInt) {
		this.newInt = newInt;
	}
	public String getNewString() {
		return newString;
	}
	public void setNewString(String newString) {
		this.newString = newString;
	}
	public long getLongValue() {
		return longValue;
	}
	public void setLongValue(long longValue) {
		this.longValue = longValue;
	}
	public Integer getInteger() {
		return integer;
	}
	public void setInteger(Integer integer) {
		this.integer = integer;
	}

	
}
