package com.capgemini.streams.performoperation;

import java.util.ArrayList;

public class OperationTest {

	public static void main(String[] args) {
		ArrayList<Integer> list=new ArrayList<>();
		//populating the arrayList with 1 to 100
	for (int i=1;i<=100;i++)
		{
			list.add(i);
		}
		
		//checking the isOdd predicate
		list.stream().filter(PerformOperation.isOdd()).forEach(System.out::println);
		
		System.out.println("*************************************************");
		
		//checking the isEven predicate
		list.stream().filter(PerformOperation.isEven()).forEach(System.out::println);
		
		System.out.println("*************************************************");
		
		//checking the isPalindrome predicate
		list.stream().filter(PerformOperation.isPalindrome()).forEach(System.out::println);

	}

}
