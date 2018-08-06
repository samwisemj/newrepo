package com.capgemini.streams.performoperation;

import java.util.function.Predicate;

public class PerformOperation
{
	public static Predicate<Integer> isOdd()
	{
		Predicate<Integer> predicate=(element)->{
			return (element%2==0)?false:true;
			
		};
		
		return predicate;
	}
	public static Predicate<Integer> isEven()
	{
		Predicate<Integer> predicate=(element)->{
			return (element%2==0)?true:false;
		};
		return predicate;
	}
	public static Predicate<Integer> isPalindrome()
	{
		Predicate<Integer> predicate=(element)->{
			return (Integer.toString(element)).equals(new StringBuilder(Integer.toString(element)).reverse().toString());
			};
		return predicate;
	}
}
