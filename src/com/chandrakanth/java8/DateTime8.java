package com.chandrakanth.java8;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalAdjusters;

public class DateTime8 {

	public DateTime8() {
		super();
	}

	protected static final LocalDate returnCurrentDate() {
		LocalDate localDate = null;
		try {
		// LocalDate.now(); // Returns the date in the format yyyy-MM-dd
		// LocalDate.of(2031, Month.JANUARY, 28);
		localDate = LocalDate.of(2014, 2, 26); // 1<={month}<=12 {dayOfMonth} <=31
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return localDate;
	}
	
	/**
	 * Method to check if current date's Year is a leap year
	 * @return
	 */
	protected static final boolean returnIsLeapYear() {
		return returnCurrentDate().isLeapYear();
	}
	
	protected static final LocalDate returnMaxDate() {
		return LocalDate.MAX;
	}
	
	protected static final LocalDate returnMinDate() {
		return LocalDate.MIN;
	}
	
	protected static final LocalDate returnDecadeAddedDate() {
		return returnCurrentDate().minus(1, ChronoUnit.ERAS);
	}
	
	protected static final LocalDate returnParsedDate() {
		return LocalDate.parse("2016-10-01");
	}
	
	protected static final LocalDate returnFirstDayOfMonth() {
		return returnCurrentDate().with(TemporalAdjusters.firstDayOfMonth());
	}
	
	protected static final DayOfWeek returnDayOfWeek() {
		return returnCurrentDate().getDayOfWeek();
	}
	
	
}
