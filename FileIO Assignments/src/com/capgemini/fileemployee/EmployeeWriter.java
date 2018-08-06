package com.capgemini.fileemployee;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.OutputStream;

//Class to write employee objects to a file
public class EmployeeWriter {

	public static void main(String[] args) throws IOException {
	
		OutputStream ops = new FileOutputStream("Employee.txt");
		ObjectOutputStream oos = new ObjectOutputStream(ops);
		
		//creating three employee objects and writing into file simultaneously
		oos.writeObject(new Employee(1234,"Samwise",20_000.00));
		oos.writeObject(new Employee(1254,"Suresh",60_000.00));
		oos.writeObject(new Employee(1834,"Ramesh",10_000.00));
		oos.close();
		ops.close();

	}
	

}
