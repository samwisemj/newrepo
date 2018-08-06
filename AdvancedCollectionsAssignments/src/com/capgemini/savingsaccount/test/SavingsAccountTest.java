package com.capgemini.savingsaccount.test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.List;

import com.capgemini.savingsaccount.classes.SavingsAccount;

//class to test the savings class
public class SavingsAccountTest {

	// calls the helper functions
	public static void arrayListFileOp(List<SavingsAccount> accounts) throws IOException {
		writeToFile(accounts);
		readFromFile();
	}

	// reading from the written file
	private static void readFromFile() throws IOException {

		InputStream is = new FileInputStream(new File("SavingsAccounts.txt"));
		ObjectInputStream ois = new ObjectInputStream(is);
		try {
			
			do
			{	
				SavingsAccount account = (SavingsAccount)ois.readObject();
				System.out.println("Account no " + account.getAccID() + "\nBalance " + account.getAccBal() + "\nName "
						+ account.getName() + "\nAccount is salaried " + account.isSalarised() + "\n");
			}while(true); 
		} catch (Exception e) {
			//e.printStackTrace();
		}
		finally {
		ois.close();
		is.close();
		}
	}

	// writing objects to a file
	private static void writeToFile(List<SavingsAccount> accounts) throws IOException {
		OutputStream ops = new FileOutputStream("SavingsAccounts.txt");
		ObjectOutputStream oos = new ObjectOutputStream(ops);

		accounts.stream().forEach((account) -> {

			try {
				oos.writeObject(account);
			} catch (Exception e) {
				e.printStackTrace();
			}
		});
		oos.close();
		ops.close();
	}

	// print the arraylist
	public static void arrayListPrint(List<SavingsAccount> accounts) {
		accounts.stream()
				.forEach((arg0) -> System.out.println("Account no " + arg0.getAccID() + "\nBalance " + arg0.getAccBal()
						+ "\nName " + arg0.getName() + "\nAccount is salaried " + arg0.isSalarised() + "\n"));
	}

	// main method to call other methods
	public static void main(String[] args) throws IOException {

		List<SavingsAccount> accounts = new ArrayList<>();
		// adding in array list
		accounts.add(new SavingsAccount(1000, 100.00, false, "Rakesh"));
		accounts.add(new SavingsAccount(1001, 500.00, true, "Abish"));
		accounts.add(new SavingsAccount(1002, 10000.00, false, "Asish"));
		accounts.add(new SavingsAccount(1003, 0.00, true, "Suresh"));
		accounts.add(new SavingsAccount(1004, 150000.00, false, "Jhilmil"));
		
		System.out.println("Normal File Reading And Writing\n-------------------------------");
		arrayListPrint(accounts);

		System.out.println("Object Reading and Writing\n---------------------------------");
		arrayListFileOp(accounts);
	}

}
