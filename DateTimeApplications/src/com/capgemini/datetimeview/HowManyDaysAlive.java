package com.capgemini.datetimeview;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.temporal.ChronoUnit;
import java.util.Date;

public class HowManyDaysAlive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// using ChronoUnit.DAYS we find out the no of days elapsed between the day
		// given and the current day,(both of which are parameters...) note to fit the
		// format, we needed to convert a date object to instance object and then this
		// instance object was parsed to LocalDateTime
		
		System.out.println("Total Number of days alive is " + ChronoUnit.DAYS.between(
				LocalDateTime.ofInstant(new Date("07/07/1995").toInstant(), ZoneId.systemDefault()),
				LocalDateTime.now()));
	}

}
