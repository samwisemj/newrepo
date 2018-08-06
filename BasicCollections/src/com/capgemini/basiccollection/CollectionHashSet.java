package com.capgemini.basiccollection;

import java.util.HashSet;
import java.util.Set;

import com.capgemini.basiccollection.classes.*;

//implementing HashSet
public class CollectionHashSet {

	public static void main(String[] args) {

		//Hash Set not accepting two duplicate values
		Set<Laptop> laptopSet=new HashSet<Laptop>(); 
		laptopSet.add(new Laptop("Lenovo", "ThinkPad", "Windows", "Core i5"));
		laptopSet.add(new Laptop("Hewlett Packard", "Omen", "Linux,Windows", "Core i7"));
		laptopSet.add(new Laptop("Apple", "Mac Book Pro", "OsX", "A9"));
		
		laptopSet.add(new Laptop("Lenovo", "ThinkPad", "Windows", "Core i5"));//Duplicate Value
		
		laptopSet.stream().forEach((laptop)->System.out.println(laptop));

		// Hash set not accepting two duplicate CellPhone values
		Set<CellPhone> listOfCellPhone = new HashSet<CellPhone>();
		listOfCellPhone.add(new CellPhone("MI", "A1", "4GBRam,64GB ROM", "Android Oreo", 15_000.00));
		listOfCellPhone.add(new CellPhone("MI", "Redmi", "3GBRam,32GB ROM", "Android Nougat", 9_000.00));
		listOfCellPhone.add(new CellPhone("Apple", "iPhone X", "4GBRam,64GB ROM", "iOS10", 84_000.00));
		listOfCellPhone.add(new CellPhone("Apple", "iPhone X", "4GBRam,64GB ROM", "iOS10", 84_400.00));// Duplicate
																										// values

		System.out.println("The Cellphones are ");
		listOfCellPhone.stream().forEach((cellphone) -> System.out.println(cellphone));

	}

}
