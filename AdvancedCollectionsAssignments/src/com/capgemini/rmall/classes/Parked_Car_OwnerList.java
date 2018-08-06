package com.capgemini.rmall.classes;

import java.util.TreeMap;

public class Parked_Car_OwnerList {

	TreeMap<Integer, Parked_CarOwner_Details> parkings;
	

	public Parked_Car_OwnerList() {
		
		this.parkings = new TreeMap<>();
	}

	public int add_new_car(Parked_CarOwner_Details obj) {

		int i = 0;
		
		if (parkings.size() == 0) {
			parkings.put(1, obj);
			return 1;
		}
	else {
			for (i = 1; i <= 240; i++)
				if (parkings.containsKey(i) == false) {
					parkings.put(i, obj);
					return i;
				}
			return -1;
		}
	}
	
	//takes a token and remove that particular object
	public void removeCar(int x) {
		
		if(parkings.containsKey(x))
		{
			Parked_CarOwner_Details rem=(Parked_CarOwner_Details)(parkings.remove(x));
			System.out.println("Removed Car Details\n"+rem);
		}
	}
	//takes a token and gives details about the parked position
	public void get_parked_location(int token)
	{
		int floor;
		int section;
		int slot;
		if(parkings.containsKey(token))
		{
			if(token>=1 && token <=80)
				floor=1;
			else if(token>=81 && token <=160)
				floor=2;
			else floor=3;
			
			section=(token%80)+1;
			section=(section >=1 && section <=20  )?1:(section >20 && section <=40)?2:(section >=41 && section <= 60)?3:4;			
			
			slot=(token%20==0)?20:token%20;
			System.out.println("The token "+token+" is present at "+floor+" floor, "+section+" section, "+slot+" slot");
			System.out.println("Details of the car at" +token+" slot\n"+parkings.get(token));
		}
		else
			System.out.println("No car found in this particular slot");
		
	}
	
	public void showAll()
	{
		for(int i=1;i<=240;i++)
		{
			if(parkings.containsKey(i))
				System.out.println(i+" : "+parkings.get(i));
			else
				System.out.println(i+" : Empty");
		}
	}

}
