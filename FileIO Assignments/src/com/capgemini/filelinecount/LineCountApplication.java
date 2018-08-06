package com.capgemini.filelinecount;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
//Class to count lines in a text file
public class LineCountApplication {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println(
				"Enter the name of the file (Hint: Enter TestFile.txt to test the text file present in the project)");

		String path = br.readLine();
		int count = 0;

		// creating a file object with the file path specified
		File file = new File(path);

		// checking whether the file exists or the path is a directory
		if (!file.exists() || !file.isFile()) {
			System.out.println("File not found, or the file may be a directory");
			System.exit(1);
		}

		// file reader object with the file object
		FileReader fr = new FileReader(file);

		// Buffered Reader to readthe lines of the files
		BufferedReader reader = new BufferedReader(fr);

		while (reader.readLine() != null)
			count++;

		System.out.println("Number of lines= " + count);
		reader.close();

	}

}
