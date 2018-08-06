package com.capgemini.basiccollection;

import java.util.ArrayList;
import java.util.List;

import com.capgemini.basiccollection.classes.*;
//implementing lISTS
public class CollectionLists {

	public static void printLaptops() {
		// Creating and printing Laptop object

		List<Laptop> listOfLaptops = new ArrayList<Laptop>();

		listOfLaptops.add(new Laptop("Lenovo", "ThinkPad", "Windows", "Core i5"));
		listOfLaptops.add(new Laptop("Hewlett Packard", "Omen", "Linux,Windows", "Core i7"));
		listOfLaptops.add(new Laptop("Apple", "Mac Book Pro", "OsX", "A9"));

		System.out.println("The Laptops are ");
		listOfLaptops.stream().forEach((laptop) -> System.out.println("Company- " + laptop.getCompany() + "\nModel- "
				+ laptop.getModel() + "\nOS- " + laptop.getOs() + "\nProcessor- " + laptop.getProcessor() + "\n"));

	}

	public static void printCars() {
		// creating and printing Car object

		List<Car> listOfCars = new ArrayList<Car>();

		listOfCars.add(new Car("Suzuki", "WagonR", 2015, 3_20_000.00));
		listOfCars.add(new Car("Audi", "A9", 2013, 10_00_000.00));
		listOfCars.add(new Car("Lamborghini", "Gallardo", 2017, 50_00_000.00));

		System.out.println("The Cars are ");
		listOfCars.stream().forEach((car) -> System.out.println("Make- " + car.getMake() + "\nModel- " + car.getModel()
				+ "\nYear- " + car.getYear() + "\nPrice- " + car.getPrice() + "\n"));
	}

	public static void printTelevision() {

		// creating and printing Television object

		List<Television> listOfTelevisions = new ArrayList<Television>();

		listOfTelevisions.add(new Television("LG", "LCD", true, 60_000.00));
		listOfTelevisions.add(new Television("MI", "LED", true, 44_000.00));
		listOfTelevisions.add(new Television("Sony", "Plasma", true, 50_000.00));

		System.out.println("The Televisions are ");
		listOfTelevisions.stream()
				.forEach((television) -> System.out
						.println("Company- " + television.getCompany() + "\nType- " + television.getType() + "\n3D Feature- "
								+ television.isIs3DEnabled()+ "\nPrice- " + television.getPrice() + "\n"));

	}

	public static void printSchool() {
		// Creating and printing School object

		List<School> listOfSchools = new ArrayList<School>();

		listOfSchools.add(new School("National Gems", "Kolkata", "South 24 Parganas", 5));
		listOfSchools.add(new School("St. Xaviers", "Mumbai", "Airoli", 3));
		listOfSchools.add(new School("Delhi Public School", "Delhi", "Delhi", 6));

		System.out.println("The Schools are ");
		listOfSchools.stream()
				.forEach((school) -> System.out.println("Name- " + school.getName() + "\nCity- " + school.getCity()
						+ "\nDistrict- " + school.getDistrict() + "\nRank" + school.getGreatSchoolRanking() + "\n"));
	}

	public static void printCellPhones() {
		// creating CellPhones
		List<CellPhone> listOfCellPhone = new ArrayList<CellPhone>();

		listOfCellPhone.add(new CellPhone("MI", "A1", "4GBRam,64GB ROM", "Android Oreo", 15_000.00));
		listOfCellPhone.add(new CellPhone("MI", "Redmi", "3GBRam,32GB ROM", "Android Nougat", 9_000.00));
		listOfCellPhone.add(new CellPhone("Apple", "iPhone X", "4GBRam,64GB ROM", "iOs 10", 84_000.00));

		System.out.println("The Cellphones are ");
		listOfCellPhone.stream()
				.forEach((cellphone) -> System.out.println("Company- " + cellphone.getCompany() + "\nModel- "
						+ cellphone.getModel() + "\nDescription- " + cellphone.getDescription() + "\nOperating System- "
						+ cellphone.getOs() + "\nPrice- " + cellphone.getPrice() + "\n"));

	}

	public static void main(String args[]) {

		printLaptops();
		printCars();
		printTelevision();
		printCellPhones();
		printSchool();
	}

}
