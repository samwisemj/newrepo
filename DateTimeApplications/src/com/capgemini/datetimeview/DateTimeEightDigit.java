package com.capgemini.datetimeview;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.Date;

public class DateTimeEightDigit {

	public static void main(String[] args) throws IOException {
		//initial date time format for parsing
		SimpleDateFormat sdf= new SimpleDateFormat("ddMMyyyy"); 
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the date in ddmmyyyy");
		
		String dateStr=br.readLine();/*"01082018";*/
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
		//checking is date entered is before current time
		if(date.before(Date.from(LocalDateTime.now().atZone(ZoneId.systemDefault()).toInstant())))
		{
			System.out.println("The day,month or year are outside acceptable limits");
			System.exit(1);
		}
		//defining new format as per requirement
		sdf=new SimpleDateFormat("dd/MM/yyyy");
		System.out.println("Date in dd/mm/yyyy format- "+sdf.format(date));
		
		//defining new format as per requirement
		sdf=new SimpleDateFormat("dd MMMMM, yyyy");
		System.out.println("Date in dd month, yyyy format- "+sdf.format(date));
		


	}

}
