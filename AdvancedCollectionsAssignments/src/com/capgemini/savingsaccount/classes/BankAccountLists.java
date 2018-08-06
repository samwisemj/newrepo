package com.capgemini.savingsaccount.classes;

import java.util.TreeSet;

public class BankAccountLists {

	TreeSet<SavingsAccount> treeSet ;
	public BankAccountLists()
	{
		treeSet=new TreeSet<>();
	}
	
	//add method to insert new accounts
	public void add(int accID, double accBal, boolean isSalarised, String name)
	{
		treeSet.add(new SavingsAccount(accID, accBal, isSalarised, name));
		
	}
	public void display()
	{
		treeSet.stream().forEach((account)->System.out.println(account));
	}

}
