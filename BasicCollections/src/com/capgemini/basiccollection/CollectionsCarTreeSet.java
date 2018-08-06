package com.capgemini.basiccollection;

import java.util.Set;
import java.util.TreeSet;

import com.capgemini.basiccollection.classes.Car;
//implementing TreeSet
public class CollectionsCarTreeSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Set<Car> setOfCars = new TreeSet<Car>();
		//adding in random order of make...
		setOfCars.add(new Car("Suzuki", "WagonR", 2015, 3_20_000.00));
		setOfCars.add(new Car("Audi", "A9", 2013, 10_00_000.00));
		setOfCars.add(new Car("Lamborghini", "Gallardo", 2017, 50_00_000.00));
		setOfCars.stream().forEach((car)->System.out.println(car));;


	}

}
