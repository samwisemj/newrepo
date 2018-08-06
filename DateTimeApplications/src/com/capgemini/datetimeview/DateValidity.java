package com.capgemini.datetimeview;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateValidity {

	public static void main(String[] args) throws IOException {
		//initial date time format for parsing
		SimpleDateFormat sdf= new SimpleDateFormat("dd/MM/yyyy"); 
		
		//input date
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the date in dd/mm/yyyy");
		String dateStr=br.readLine();//"01/08/2018";
		
		sdf.setLenient(false);
		
		//parsing new date object,throws exception if given invalid date
		Date date=null;
		
		try
		{
			 date=sdf.parse(dateStr);
		}
		
		catch(Exception e) {
			e.printStackTrace();
			System.out.println("Invalid Date");
		}
		//using calendar class to add no of days to date
		System.out.println("Enter the no of days to add");
		
		Calendar c=Calendar.getInstance();//gets a calander instance
		
		c.setTime(date);//sets the static variable in the calandar class
		
		c.add(Calendar.DATE,Integer.parseInt(br.readLine()));//adds the date with some integers
		
		System.out.println(sdf.format(c.getTime()));
	}

}
