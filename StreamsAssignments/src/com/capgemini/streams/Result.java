package com.capgemini.streams;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class Result {

	public static void main(String[] args) throws IOException {
//		System.out.println((Math.random()*1000)%40);
		//writes to boy.txt
		writeToBoy();
		//reads from boy.txt and performs some task
		readBoy();
	}

	private static void readBoy() throws IOException {
		
		FileReader file=new FileReader("boy.txt");
		BufferedReader reader=new BufferedReader(file);
		ArrayList<Integer> treeset=new ArrayList<>();
		//reading each integer
		for(int i=0;i<100;i++)
		{
			treeset.add(Integer.valueOf(reader.readLine()));
		}
		reader.close();
		//distict element then sorting
		treeset.stream().distinct().sorted().forEach(System.out::println);
		
	}

	private static void writeToBoy() throws IOException {
		FileWriter file=new FileWriter("boy.txt");
		BufferedWriter writer =new BufferedWriter(file);
		for(int i=0;i<100;i++)
		{
			String x=String.valueOf(((int)((Math.random()*1000)%100)+1));
			writer.write(x+"\r\n");
		}
		writer.close();
	}
}
