package com.capgemini.datetimeview;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.Date;

public class DayOfTheDate {

	public static void main(String[] args) throws IOException, ParseException {
		// TODO Auto-generated method stub
		SimpleDateFormat sdf= new SimpleDateFormat("dd/MM/yyyy"); 
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter date in dd/MM/yyyy format");
		
		String s=br.readLine();
		Date date=sdf.parse(s);
		//		String s="07/07/1995";
		System.out.println(LocalDateTime.ofInstant(date.toInstant(), ZoneId.systemDefault()).getDayOfWeek());
		//System.out.println(date);

	}

}
