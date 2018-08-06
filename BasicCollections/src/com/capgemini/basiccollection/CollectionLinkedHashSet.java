package com.capgemini.basiccollection;

import java.util.LinkedHashSet;
import java.util.Set;
//Implementing LinkedHashSet
public class CollectionLinkedHashSet {

	public static void main(String[] args) {
	
		Set<String> nameSet=new LinkedHashSet<String>();
		
		//adding names in an order
		nameSet.add("Subhamoy");
		nameSet.add("Mehul");
		nameSet.add("Alfaiz");
		nameSet.add("Amit");
		nameSet.stream().forEach((name)->System.out.println(name));

	}

}
