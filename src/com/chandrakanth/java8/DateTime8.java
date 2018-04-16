package com.chandrakanth.java8;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Year;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalAdjusters;

public interface DateTime8 {

	public static LocalDate returnCurrentDate() {
		LocalDate localDate = null;
		try {
			// LocalDate.now(); // Returns the date in the format yyyy-MM-dd
			// LocalDate.of(2031, Month.JANUARY, 28);
			localDate = LocalDate.of(2014, 2, 26); // 1<={month}<=12 {dayOfMonth} <=31
		} catch (Exception e) {
			e.printStackTrace();
		}
		return localDate;
	}

	/**
	 * Method to check if current date's Year is a leap year
	 * 
	 * @return
	 */
	static boolean returnIsLeapYear() {
		return returnCurrentDate().isLeapYear();
	}

	static LocalDate returnMaxDate() {
		return LocalDate.MAX;
	}

	static LocalDate returnMinDate() {
		return LocalDate.MIN;
	}

	static LocalDate returnDecadeAddedDate() {
		return returnCurrentDate().minus(1, ChronoUnit.ERAS);
	}

	static LocalDate returnParsedDate() {
		return LocalDate.parse("2016-10-01");
	}

	static LocalDate returnFirstDayOfMonth() {
		return returnCurrentDate().with(TemporalAdjusters.firstDayOfMonth());
	}

	static DayOfWeek returnDayOfWeek() {
		return returnCurrentDate().getDayOfWeek();
	}

	static boolean returnWhetherDate1B4Date2() {
		return returnCurrentDate().isBefore(returnCurrentDate().plus(3, ChronoUnit.DAYS));
	}

	static LocalTime returnCurrentLocalTime() {
		return
		// LocalTime.now();
		LocalTime.of(15, 34, 43, 333);
	}

	static LocalTime returnParsedTime() {
		return LocalTime.parse("06:45:07");
	}

	static LocalDateTime returnCurrentTimeStamp() {
		return LocalDateTime.now();
	}

	static LocalDateTime returnParsedTimeStamp() {
		return LocalDateTime.parse("2015-05-14T06:23");
	}

}
