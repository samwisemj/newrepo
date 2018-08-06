package com.capgemini.fileemployee;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
//Class to read employee objects from a file
public class EmployeeReader {

	public static void main(String[] args) throws IOException, FileNotFoundException, ClassNotFoundException {
		// TODO Auto-generated method stub

		InputStream is;
		ObjectInputStream ois;

		// reading objects from previously written data
		try {
			is = new FileInputStream(new File("Employee.txt"));
			ois = new ObjectInputStream(is);

			do {
				Employee employee = (Employee) ois.readObject();
				System.out.println(employee);
			} while (true);
			
		} catch (EOFException e) {
			System.out.println("End");
			
		} catch (FileNotFoundException e) {
			System.out.println("File Not Found");
		}

	}
}