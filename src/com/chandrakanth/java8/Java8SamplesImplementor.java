package com.chandrakanth.java8;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;

public class Java8SamplesImplementor {

	public static void main(String[] argz) {
		/*
		 * Functional Interface having argument - Define the argument followed by Lambda
		 * arrow head followed by block of code
		 */
		FunctionalInterfaceSample sample = (/* String */s) -> {
			System.out.println(s);
		};
		// call the actual method
		sample.singleAbstractMethod("argument value");

		// static method call defined in Interface
		System.out.println(FunctionalInterfaceSample.returnStaticMethodObject("Static method arg"));
		// default method call defined in interface
		System.out.println(sample.returnDefaultMethodObject("Default method arg"));

		LocalDate localDate1 = null;
		LocalDate localDate2 = null;
		localDate1 = DateTime8.returnCurrentDate();
		System.out.println(localDate1);

		boolean isLeapYear = DateTime8.returnIsLeapYear();
		System.out.println(isLeapYear);

		localDate1 = DateTime8.returnMaxDate(); // Max Date 
		localDate2 = DateTime8.returnMinDate(); // Min Date

		System.out.println(localDate1);
		System.out.println(localDate2);

		/*Date modified by adding/removing ChronoUnit. gives 
		Gives negative result in case if the datetime exceeds the max value
		+999999999-12-31*/
		localDate1 = DateTime8.returnDecadeAddedDate();
		System.out.println("Modified Date\nby adding century:\t"+localDate1);
		
		localDate1 = DateTime8.returnParsedDate();
		System.out.println("Parsed Date:\t\t"+localDate1);
		
		localDate2 = DateTime8.returnFirstDayOfMonth();
		System.out.println("First Day Of Month:\t"+localDate2);
		
		DayOfWeek dayOfWeek = DateTime8.returnDayOfWeek();
		System.out.println("Day Of Week:\t\t"+dayOfWeek);
		
		Month currentMonth = DateTime8.returnCurrentDate().getMonth();
		System.out.println("Current Month:\t\t"+currentMonth);
		
		
		
	}
}
