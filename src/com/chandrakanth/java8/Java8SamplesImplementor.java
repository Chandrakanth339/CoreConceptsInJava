package com.chandrakanth.java8;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.temporal.ChronoUnit;

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

		// Java8SamplesImplementor.localDateSamples();
		Java8SamplesImplementor.localTimeSamples();
		Java8SamplesImplementor.localDateTimeSamples();
	}

	public static void localDateSamples() {
		LocalDate localDate1 = null;
		LocalDate localDate2 = null;
		localDate1 = DateTime8.returnCurrentDate();
		System.out.println(localDate1);

		boolean booleanValue = DateTime8.returnIsLeapYear();
		System.out.println(booleanValue);

		localDate1 = DateTime8.returnMaxDate(); // Max Date
		localDate2 = DateTime8.returnMinDate(); // Min Date

		System.out.println(localDate1);
		System.out.println(localDate2);

		/*
		 * Date modified by adding/removing ChronoUnit. gives Gives negative result in
		 * case if the datetime exceeds the max value +999999999-12-31
		 */
		localDate1 = DateTime8.returnDecadeAddedDate();
		System.out.println("Modified Date\nby adding century:\t" + localDate1);

		localDate1 = DateTime8.returnParsedDate();
		System.out.println("Parsed Date:\t\t" + localDate1);

		localDate2 = DateTime8.returnFirstDayOfMonth();
		System.out.println("First Day Of Month:\t" + localDate2);

		DayOfWeek dayOfWeek = DateTime8.returnDayOfWeek();
		System.out.println("Day Of Week:\t\t" + dayOfWeek);

		Month currentMonth = DateTime8.returnCurrentDate().getMonth();
		System.out.println("Current Month:\t\t" + currentMonth);

		booleanValue = DateTime8.returnWhetherDate1B4Date2();
		System.out.println("Check whether Date1 is before Date2: " + booleanValue);

	}

	public static void localTimeSamples() {
		LocalTime localTime1 = null;
		LocalTime localTime2 = null;
		localTime1 = DateTime8.returnCurrentLocalTime();
		System.out.println("Current Local Time: "+localTime1);

		localTime2 = DateTime8.returnParsedTime();
		System.out.println("Current Parsed Time: "+localTime2);

		localTime1 = DateTime8.returnCurrentLocalTime();
		localTime2 = DateTime8.returnCurrentLocalTime().plus(3,  ChronoUnit.HOURS);
		System.out.println("Check if Time1 is after time2"+localTime2.isAfter(localTime1));
	
	}

	public static void localDateTimeSamples() {
		LocalDateTime localDateTime1 = null;
		LocalDateTime localDateTime2 = null;
		
		localDateTime1 = DateTime8.returnCurrentTimeStamp();
		System.out.println("Current Local Timestamp:"+localDateTime1);
		
		localDateTime2 = DateTime8.returnParsedTimeStamp();
		System.out.println("Current parsed Timestamp: "+localDateTime2);
		
		localDateTime2 = localDateTime1.plus(4, ChronoUnit.YEARS);
		System.out.println("Check if Timestamp1\nis after Timestamp2: "+localDateTime2.isAfter(localDateTime1));
	}
	
	
}
