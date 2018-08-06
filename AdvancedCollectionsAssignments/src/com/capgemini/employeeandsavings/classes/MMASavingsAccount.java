package com.capgemini.employeeandsavings.classes;

//savings account class with getters
public class MMASavingsAccount {

	private int accountId;
	private String accountHolderName;
	private double accountBal;
	private boolean isSalaried;
	public MMASavingsAccount(int accountId, String accountHolderName, double accountBal, boolean isSalaried) {
		super();
		this.accountId = accountId;
		this.accountHolderName = accountHolderName;
		this.accountBal = accountBal;
		this.isSalaried = isSalaried;
	}
	public int getAccountId() {
		return accountId;
	}
	public String getAccountHolderName() {
		return accountHolderName;
	}
	public double getAccountBal() {
		return accountBal;
	}
	public boolean isSalaried() {
		return isSalaried;
	}
	@Override
	public String toString() {
		return "MMASavingsAccount [accountId=" + accountId + ", accountHolderName=" + accountHolderName
				+ ", accountBal=" + accountBal + ", isSalaried=" + isSalaried + "]";
	}
	
}
