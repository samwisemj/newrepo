package com.capgemini.javagrep;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
//Java emulation of unix's grep 
public class JavaGrepApplication {

	public static void main(String[] args) throws IOException {
		System.out.println(
				"Enter the name of the file (Hint: Enter TestFile.txt to test the text file present in the project)\n also enter the search element");

		String path = args[0];
//		String path = "TestFile.txt";
		
		int occurenceCount = 0;
		int lineCount = 0;
		
		String line = null;
		
		// creating a file object with the file path specified
		File file = new File(path);

		// checking whether the file exists or the path is a directory
		if (!file.exists() || !file.isFile()) {
			System.out.println("File not found, or the file may be a directory");
			System.exit(1);
		}

		//System.out.println("Enter the word to be searched");
		String element = args[1];

		// file reader object with the file object
		FileReader fr = new FileReader(file);

		// Buffered Reader to read the lines of the files
		BufferedReader reader = new BufferedReader(fr);

		//logic to find the word by iterating through every line of the document
		do {
			line = reader.readLine();
			if (line == null)
				break;
			lineCount++;

			if (line.contains(element)) {
				System.out.println("Found At Line Number " + lineCount + "\nThe line is :- " + line);
				occurenceCount++;
			}
		} while (line != null);
		if (occurenceCount == 0)
				System.out.println("The word was not found in the document");
			reader.close();
	}

}
