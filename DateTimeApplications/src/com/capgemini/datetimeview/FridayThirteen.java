package com.capgemini.datetimeview;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;

public class FridayThirteen {

	public static void main(String[] args) throws ParseException {
		LocalDate startDate = LocalDate.of(1900, 1, 1);
		LocalDate endDate = LocalDate.of(2000, 12, 31);
		
	/*	SimpleDateFormat is formatting the date in a particular format...this object is used to
		 parse the date object from the string in the given format*/
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		SimpleDateFormat sdf2 = new SimpleDateFormat("dd-MMMMM-yyyy");

		System.out.println("The list of Friday the 13th in the 20th Century are :- ");
		// date for loop
		for (LocalDate date = startDate; date.isBefore(endDate); date = date.plusDays(1)) {
			// checking logic for friday 13th
			if (date.getDayOfMonth() == 13 && (date.getDayOfWeek().toString().equalsIgnoreCase("Friday")))
				System.out.println(sdf2.format(sdf.parse(date.toString())));// parsing date and converting to desired
																			// format
		}
	}

}
