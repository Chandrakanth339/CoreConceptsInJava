package com.chandrakanth.comparators;

import java.util.Comparator;


/*
 * To sort object based on strings
 *  
 * */
public class ComparatorImpl implements Comparator<Class1> {

	@Override
	public int compare(Class1 o1, Class1 o2) {
        return o1.getString1().compareTo(o2.getString1());
        
       // to sort based on numbers
//		return o1.getNumber1() - o2.getNumber1();
	}
}
