package com.capgemini.datetimeview;

import java.time.LocalDateTime;

public class DateTimeView {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LocalDateTime date;
		date=LocalDateTime.now();
		//prints like THURSDAY, AUGUST 2, 2018
		System.out.println(date.getDayOfWeek()+", "+date.getMonth()+" "+date.getDayOfMonth()+", "+date.getYear());
		
	}

}
