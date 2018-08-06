package com.capgemini.basiccollection;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
//implementinmg HashMap
public class CollectionsMapSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String,String> map=new HashMap<String,String>();
		

		map.put("Subhamoy", "Mango");
		map.put("Amit", "Banana");
		map.put("Alfaiz", "Apple");
		map.put("Mehul", "Pomegranate");
		
		System.out.println(map.get("Subhamoy"));//get value from key
		System.out.println(map.keySet());//get all keys(keyset)
		System.out.println(map.entrySet());//get all entries
		
		Set<Entry<String,String>> set=map.entrySet();
		
		set.stream().forEach((element)->System.out.println(element.getValue()+" "+element.getKey()));
		
		
		
		

	}

}
