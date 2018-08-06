package com.capgemini.factorialexception.tests;

import com.capgemini.factorialexception.Factorial;
import com.capgemini.factorialexception.exceptions.FactorialException;
import com.capgemini.factorialexception.exceptions.InvalidInputException;
//This class instantiates Factorial class and tests it
public class FactorialTest {
	public static int getFact(int num)
	{
		int factorial=0;
		try
		{
			 factorial=new Factorial().getFactorial(num);
			 
		}
		catch(FactorialException e)
		{
			e.printStackTrace();
		}
		catch(InvalidInputException e)
		{
			e.printStackTrace();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}		
		return factorial;
	}
	public static void main(String[] args)throws Exception {
		
		System.out.println(getFact(10));//returns the correct value for factorial
		System.out.println(getFact(0));//will give an exception(InvalidInputException)
		System.out.println(getFact(150));//will give an exception(FactorialException)
	}
}
