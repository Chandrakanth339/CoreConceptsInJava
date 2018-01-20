package com.chandrakanth.calendarandpattern;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

public class CalendarConcepts {

	private CalendarConcepts() {

	}

	public static void main(String[] args) {

		Calendar calendar = Calendar.getInstance();
		Date i = Calendar.getInstance().getTime();
		System.out.println("1 "+i);
		calendar.set(Calendar.HOUR, 10);
		calendar.set(Calendar.YEAR, 2014);
		System.out.println("Available Locale" + calendar.getAvailableLocales() + "\n");
		System.out.println("2 "+calendar.get(Calendar.HOUR));
		Date d = calendar.getTime();

		System.out.println("3 "+d);
		System.out.println(d.compareTo(i));
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy hh:mm:ss");
		sdf.setLenient(false);
		String date = sdf.format(d);
		System.out.println(date);
		sdf.setLenient(true);
		try {
			Date toD = sdf.parse("22/14/2016 21:14:68 +0630");

			System.out.println("4 "+ toD.before(new Date()));

			Date date2 = toD;
			System.out.println("5 "+date2.clone()); // clone returns date value
			System.out.println("6 "+date2);

			System.out.println(toD);
		} catch (ParseException e) {
			e.printStackTrace();
		}

	}

}
