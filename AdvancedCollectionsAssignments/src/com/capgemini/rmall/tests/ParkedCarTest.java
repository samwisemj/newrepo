package com.capgemini.rmall.tests;

import com.capgemini.rmall.classes.Parked_CarOwner_Details;
import com.capgemini.rmall.classes.Parked_Car_OwnerList;

public class ParkedCarTest {

	public static void main(String[] args) {
	
		Parked_Car_OwnerList pl=new Parked_Car_OwnerList();
		
		//adding new object in the list
		pl.add_new_car(new Parked_CarOwner_Details("Subhamoy", "WagonR", "WB02AL6513", "9876036339", "Behala,Kolkata"));
		pl.add_new_car(new Parked_CarOwner_Details("Soumya", "Audi", "WB02AL6515", "8251036339", "Behala,Kolkata"));
		pl.add_new_car(new Parked_CarOwner_Details("Mehul", "Dezire", "WB02AL6518", "8691526339", "Behala,Kolkata"));
		pl.add_new_car(new Parked_CarOwner_Details("Amit", "Bolero", "WB02AL6516", "8697421339", "Behala,Kolkata"));
		pl.add_new_car(new Parked_CarOwner_Details("Debanjan", "Bullet", "WB02AL6513", "8697145339", "Behala,Kolkata"));
		pl.add_new_car(new Parked_CarOwner_Details("Alfaiz", "Swift", "MH02AL66450","8697036339", "Behala,Kolkata"));
		pl.add_new_car(new Parked_CarOwner_Details("Anirban", "Santro", "WB02AL6813", "2547036339", "Behala,Kolkata"));
		pl.add_new_car(new Parked_CarOwner_Details("Sankhadip", "WagonR", "WB02AL6993", "2527036339", "Behala,Kolkata"));
		
		//showing all
		//pl.showAll();
		
		//removing the car at slot 3
		pl.removeCar(3);
		
		//showing all
//		pl.showAll();
		
		
		//checking a valid slot and an emptyb slot
		pl.get_parked_location(5);		
		pl.get_parked_location(3);
		
		//adding to an empty slot and checking whether it was entered in an intermediately emptied slot
		pl.add_new_car(new Parked_CarOwner_Details("Buna", "Bolero", "WB02OP6517", "8697852339", "Behala,Kolkata"));
		pl.get_parked_location(3);
			//pl.showAll();
	}

}
