package com.capgemini.savingsaccount.test;

import com.capgemini.savingsaccount.classes.*;

public class BankAccountsTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//adding to treeset in descending order of accID
		BankAccountLists bl=new BankAccountLists();
		
		bl.add(1004, 150000.00, false, "Jhilmil");
		bl.add(1003, 0.00, true, "Suresh");
		bl.add(1002, 10000.00, false, "Asish");
		bl.add(1001, 500.00, true, "Abish");
		bl.add(1000, 100.00, false, "Rakesh");
		
		bl.display();
	}
	

	
}
