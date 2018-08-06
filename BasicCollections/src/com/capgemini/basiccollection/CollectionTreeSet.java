package com.capgemini.basiccollection;

import java.util.Set;
import java.util.TreeSet;
//Implementing TreeSet
public class CollectionTreeSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Set<String> nameSet=new TreeSet<String>();
		
		//adding names in an order
		nameSet.add("Subhamoy");
		nameSet.add("Mehul");
		nameSet.add("Alfaiz");
		nameSet.add("Amit");
		nameSet.stream().forEach((name)->System.out.println(name));
	}

}
