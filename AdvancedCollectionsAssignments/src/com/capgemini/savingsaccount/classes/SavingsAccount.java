package com.capgemini.savingsaccount.classes;

import java.io.Serializable;

public class SavingsAccount implements Serializable , Comparable<SavingsAccount>{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int accID;
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + accID;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		SavingsAccount other = (SavingsAccount) obj;
		if (accID != other.accID)
			return false;
		return true;
	}

	private double accBal;
	private boolean isSalarised;
	private String name;
	
	public SavingsAccount(int accID, double accBal, boolean isSalarised, String name) {
		super();
		this.accID = accID;
		this.accBal = accBal;
		this.isSalarised = isSalarised;
		this.name = name;
	}

	public int getAccID() {
		return accID;
	}

	public double getAccBal() {
		return accBal;
	}

	public boolean isSalarised() {
		return isSalarised;
	}

	public String getName() {
		return name;
	} 
	
	public boolean withdraw(double amount)
	{
		if(amount>accBal) return false;
		accBal-=amount;
		return true;
	}
	
	public void deposit(double amount)
	{
		
		accBal-=amount;
	}

	@Override
	public int compareTo(SavingsAccount arg0) {
		
		return this.accID-arg0.accID;
	}

	@Override
	public String toString() {
		return "SavingsAccount [accID=" + accID + ", accBal=" + accBal + ", isSalarised=" + isSalarised + ", name="
				+ name + "]";
	}
	
	

	
}
