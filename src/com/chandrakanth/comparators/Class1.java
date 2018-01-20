package com.chandrakanth.comparators;

import java.util.Comparator;

public class Class1 {//implements Comparator<Class1> {

	public Class1() {

	}

	private int number1;
	private String string1;

	public int getNumber1() {
		return number1;
	}

	public void setNumber1(int number1) {
		this.number1 = number1;
	}

	public String getString1() {
		return string1;
	}

	public void setString1(String string1) {
		this.string1 = string1;
	}

	public Class1(int number1, String string1) {
		this.number1 = number1;
		this.string1 = string1;
	}

	/*@Override
	public int compare(Class1 o1, Class1 o2) {

		return o1.getNumber1()-o2.getNumber1();
	}*/

}
