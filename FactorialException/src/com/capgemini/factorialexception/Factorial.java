
package com.capgemini.factorialexception;

import com.capgemini.factorialexception.exceptions.FactorialException;
import com.capgemini.factorialexception.exceptions.InvalidInputException;
//Factorial Class that returns exception is range is out of max integer range
public class Factorial {

	//returns factorial
	public int getFactorial(int num)throws Exception
	{
		int fact=1;
		final int maxVal=Integer.MAX_VALUE;
		if (num<2) 
			throw new InvalidInputException("Please input number greater than 1");
		for(int i=1;i<=num;i++)
		{
			fact*=i;
			if(((fact/i)<=maxVal) && fact>0)
				continue;
			else
				throw new FactorialException("Integer value overflow");
		}
		return fact;
	}
}
