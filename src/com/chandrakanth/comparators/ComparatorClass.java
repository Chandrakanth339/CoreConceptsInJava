package com.chandrakanth.comparators;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.TreeSet;

public class ComparatorClass {

	public static void main(String args[]) {
		// Takes a list o Dog objects
		List<Class1> list = new ArrayList<Class1>();

		list.add(new Class1(3, "Shaggy"));
		list.add(new Class1(2, "Lacy"));
		list.add(new Class1(10, "Roger"));
		list.add(new Class1(4, "Tommy"));
		list.add(new Class1(4, "Tommy"));
		list.add(new Class1(1, "Tammy"));

		for (Class1 c1 : list) { // printing the sorted list of names
			System.out.print(c1.getString1() + "\t");
		}
		// Sorts the array list based on numbers using comparator
		// Collections.sort(list, new ComparatorImpl());
		Collections.sort(list, new Comparator<Class1>() {
			
			@Override
			public int compare(Class1 o1, Class1 o2) {
				return o1.getString1().compareTo(o2.getString1());
			}

		});
		
		
		
		
		
		System.out.println("\n");
		System.out.println("sorting list based on strings");

		for (Class1 a : list) // printing the sorted list of ages
			System.out.print(a.getString1() + "      :" + a.getNumber1() + "\n");

		Collections.sort(list, new Comparator<Class1>() {

			@Override
			public int compare(Class1 o1, Class1 o2) {

				return o1.getNumber1() - o2.getNumber1();
			}

		});
		System.out.println(" ");
		System.out.println("sorting list based on numbers");

		for (Class1 a : list) // printing the sorted list of ages
			System.out.print(a.getNumber1() + " : " + a.getString1() + "\n");
	
	

		TreeSet trSet  =new TreeSet();
		trSet.add(new String("3"));
		trSet.add(new Integer(2));
		
		System.out.println(trSet);
	
	}
}