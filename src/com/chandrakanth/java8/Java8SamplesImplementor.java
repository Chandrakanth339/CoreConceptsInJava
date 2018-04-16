package com.chandrakanth.java8;

import java.time.DayOfWeek;
import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;

public class Java8SamplesImplementor {

	public static final Logger LOGGER = Logger.getLogger(Java8SamplesImplementor.class);
	
	public static void main(String[] argz) {
		BasicConfigurator.configure();
		/*
		 * Functional Interface having argument - Define the argument followed by Lambda
		 * arrow head followed by block of code
		 */
		FunctionalInterfaceSample sample = (/* String */s) -> {
			LOGGER.info(s);
		};
		// call the actual method
		sample.singleAbstractMethod("argument value");

		// static method call defined in Interface
		LOGGER.info(FunctionalInterfaceSample.returnStaticMethodObject("Static method arg"));
		// default method call defined in interface
		LOGGER.info(sample.returnDefaultMethodObject("Default method arg"));

		 Java8SamplesImplementor.localDateSamples();
		 Java8SamplesImplementor.localTimeSamples();
		 Java8SamplesImplementor.localDateTimeSamples();
		 Java8SamplesImplementor.zonedDateTimeSamples();
		 Java8SamplesImplementor.localDatesInPeriodAndDuration();
//		 Java8SamplesImplementor.dateTimeFormats();
	}

	public static void localDateSamples() {
		LocalDate localDate1 = null;
		LocalDate localDate2 = null;
		localDate1 = DateTime8.returnCurrentDate();
		LOGGER.info(localDate1);

		boolean booleanValue = DateTime8.returnIsLeapYear();
		LOGGER.info(booleanValue);

		localDate1 = DateTime8.returnMaxDate(); // Max Date
		localDate2 = DateTime8.returnMinDate(); // Min Date

		LOGGER.info(localDate1);
		LOGGER.info(localDate2);

		/*
		 * Date modified by adding/removing ChronoUnit. gives Gives negative result in
		 * case if the datetime exceeds the max value +999999999-12-31
		 */
		localDate1 = DateTime8.returnDecadeAddedDate();
		LOGGER.info("Modified Date\nby adding century:\t" + localDate1);

		localDate1 = DateTime8.returnParsedDate();
		LOGGER.info("Parsed Date:\t\t" + localDate1);

		localDate2 = DateTime8.returnFirstDayOfMonth();
		LOGGER.info("First Day Of Month:\t" + localDate2);

		DayOfWeek dayOfWeek = DateTime8.returnDayOfWeek();
		LOGGER.info("Day Of Week:\t\t" + dayOfWeek);

		Month currentMonth = DateTime8.returnCurrentDate().getMonth();
		LOGGER.info("Current Month:\t\t" + currentMonth);

		booleanValue = DateTime8.returnWhetherDate1B4Date2();
		LOGGER.info("Check whether Date1 is before Date2: " + booleanValue);

	}

	public static void localTimeSamples() {
		LocalTime localTime1 = null;
		LocalTime localTime2 = null;
		localTime1 = DateTime8.returnCurrentLocalTime();
		LOGGER.info("Current Local Time: " + localTime1);

		localTime2 = DateTime8.returnParsedTime();
		LOGGER.info("Current Parsed Time: " + localTime2);

		localTime1 = DateTime8.returnCurrentLocalTime();
		localTime2 = DateTime8.returnCurrentLocalTime().plus(3, ChronoUnit.HOURS);
		LOGGER.info("Check if Time1 is after time2" + localTime2.isAfter(localTime1));

	}

	public static void localDateTimeSamples() {
		LocalDateTime localDateTime1 = null;
		LocalDateTime localDateTime2 = null;

		localDateTime1 = DateTime8.returnCurrentTimeStamp();
		LOGGER.info("Current Local Timestamp:" + localDateTime1);

		localDateTime2 = DateTime8.returnParsedTimeStamp();
		LOGGER.info("Current parsed Timestamp: " + localDateTime2);

		localDateTime2 = localDateTime1.plus(4, ChronoUnit.YEARS);
		LOGGER.info("Check if Timestamp1\nis after Timestamp2: " + localDateTime2.isAfter(localDateTime1));
	}

	public static void zonedDateTimeSamples() {

	}

	public static void localDatesInPeriodAndDuration() {
		LocalDate localDate1 = null;
		LocalDate localDate2 = null;
		localDate1 = DateTime8.returnCurrentDate();
		localDate2 = localDate1;
		localDate1 = localDate1.plus(Period.of(3, 3, 4));
		LOGGER.info(Period.between(localDate1, localDate2));
		LOGGER.info(localDate1);
		LOGGER.info(localDate2);

		LocalTime lt1 = DateTime8.returnCurrentLocalTime();
		LocalTime lt2 = DateTime8.returnCurrentLocalTime()
				.plus(Duration.of(3, ChronoUnit.HOURS).plus(Duration.of(4, ChronoUnit.MINUTES)
						.plus(Duration.of(15, ChronoUnit.SECONDS).plus(Duration.of(3, ChronoUnit.MILLIS)))));
		LOGGER.info(Duration.between(lt1, lt2));
	}

	public static void dateTimeFormats() {
		LocalDate localDate = DateTime8.returnCurrentDate();
		String formattedDate = localDate.format(DateTimeFormatter.ofPattern("MM-YYYY-dd"));
		
		LocalDateTime localDateTime = DateTime8.returnCurrentTimeStamp();
		String timeStampFormat = localDateTime.format(DateTimeFormatter.ISO_ZONED_DATE_TIME);
		LOGGER.info(timeStampFormat);
		
		
		LOGGER.info(formattedDate);
	}

}
