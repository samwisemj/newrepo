package com.capgemini.fileclasslist;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class MyClassTest {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		// TODO Auto-generated method stub

		ArrayList<MyClass> arrayList = new ArrayList<>();

		// adding data to the array list
		arrayList.add(new MyClass(1, "Subhamoy"));
		arrayList.add(new MyClass(2, "Soumya"));
		arrayList.add(new MyClass(3, "Kushal"));
		arrayList.add(new MyClass(4, "Anirban"));
		arrayList.add(new MyClass(5, "Debanjan"));

		writeObject(arrayList);
		readObject();
	}

	private static void readObject() throws IOException, ClassNotFoundException {
		try {
			
			//read the array list object from the file
			FileInputStream fis=new FileInputStream("MyClass.txt");
			ObjectInputStream ois=new ObjectInputStream(fis);
			Object obj=ois.readObject();
			ArrayList<MyClass> myclass=(ArrayList<MyClass>)obj;
			
			myclass.stream().forEach((element)->System.out.println(element));
		}
		catch(EOFException E)
		{
			System.out.println("End");
		}
		catch(FileNotFoundException e)
		{
			System.out.println("FileNotFound");
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
	}

	private static void writeObject(ArrayList<MyClass> arrayList) throws IOException {

		// creating file output stream and object output stream objects
		FileOutputStream fos = new FileOutputStream("MyClass.txt");
		ObjectOutputStream oos = new ObjectOutputStream(fos);

		// writing object to a file
		oos.writeObject(arrayList);

		oos.close();
		fos.close();
	}

}
