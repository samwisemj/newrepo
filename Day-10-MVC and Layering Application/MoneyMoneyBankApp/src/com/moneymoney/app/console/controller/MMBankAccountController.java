package com.moneymoney.app.console.controller;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;

import com.moneymoney.app.model.dao.MMBankCollection;
import com.moneymoney.app.model.factory.MMBankFactory;
import com.moneymoney.framework.account.dao.BankAccountCollection;
import com.moneymoney.framework.account.pojo.BankAccount;
import com.moneymoney.framework.account.pojo.Customer;
import com.moneymoney.framework.controller.BankController;
import com.moneymoney.framework.factory.BankFactory;

public class MMBankAccountController extends BankController {

	BankFactory factory;
	BankAccountCollection collection;
	
	public MMBankAccountController() {
		// TODO Auto-generated constructor stub
		 	 factory=new MMBankFactory();
			collection= new MMBankCollection();
	}
	
	
	
	@Override
	public void createNewCurrentAccount(Map<String, Object> arg0) {
		// TODO Auto-generated method stub
		
		collection.addBankAccount(factory.createNewCurrentAccount(arg0));
		
	}

	@Override
	public void createNewSavingsAccount(Map<String, Object> arg0) {
		// TODO Auto-generated method stub
		
		collection.addBankAccount(factory.createNewSavingsAccount(arg0));
	}

	@Override
	public Collection<BankAccount> getAllAccounts() {
		// TODO Auto-generated method stub
		return collection.viewAll();
	}

	@Override
	public Collection<Customer> getAllCustomers() {
		
		List<Customer> listOfCustomer=new ArrayList<>();
		(collection.viewAll()).stream().forEach((element)->listOfCustomer.add(element.getAccountHolder()));
		return listOfCustomer;
	}



	@Override
	public BankAccount getAccountById(int id) {
		

		for(BankAccount account:collection.viewAll())
		{
			if(account.getAccountNumber()==id)
				return account;
		}
		return null;
			
	}
	
	

}
