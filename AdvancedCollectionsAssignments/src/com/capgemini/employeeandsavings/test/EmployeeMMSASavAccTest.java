package com.capgemini.employeeandsavings.test;
import java.util.HashMap;

import com.capgemini.employeeandsavings.classes.*;
public class EmployeeMMSASavAccTest {

	public static void main(String[] args) {
		
		HashMap<Employee,MMASavingsAccount> hashMap=new HashMap<Employee,MMASavingsAccount>();
		
		MMASavingsAccount account1=new MMASavingsAccount(1234, "Subhamoy", 1000.00, true);
		MMASavingsAccount account2=new MMASavingsAccount(1235, "Sankadip", 10000.00, true);
		
		Employee employee1=new Employee(12356, "Subhamoy", "Analyst A4", 20_000.00, "8697036339");
		Employee employee2=new Employee(12376, "Sankhadip", "Analyst B1", 50_000.00, "8697036355");
	
		//creating relation 
		hashMap.put(employee1,account1);
		hashMap.put(employee2,account2);
	
		//printing the relations
		
		System.out.println("Employee 1 account details\n"+hashMap.get(employee1));
		System.out.println("Employee 1 account details\n"+hashMap.get(employee2));
		
	}

}
