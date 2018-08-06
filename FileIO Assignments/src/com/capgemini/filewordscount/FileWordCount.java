package com.capgemini.filewordscount;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
//Lines to count number of files in a word
public class FileWordCount {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println(
				"Enter the name of the file (Hint: Enter TestFile.txt to test the text file present in the project)");
		
		String path = br.readLine();
		int count = 0;
		String line=null;

		// creating a file object with the file path specified
		File file = new File(path);

		// checking whether the file exists or the path is a directory
		if (!file.exists() || !file.isFile()) {
			System.out.println("File not found, or the file may be a directory");
			System.exit(1);
		}

		// file reader object with the file object
		FileReader fr = new FileReader(file);

		// Buffered Reader to read the lines of the files
		BufferedReader reader = new BufferedReader(fr);
		
		//Exit controlled loop to extract the lines
		do
		{
			line = reader.readLine();
			if(line==null)	break;
			
			count+=countWords(line);
			
		}while(line!=null);
		
		System.out.println("Number of words= " + count);
		reader.close();

	}

	private static int countWords(String line) {
		// Counts the no of words in a line
		int count =0;
		//word extraction logic
		while(line!=null)
		{
			count++;
			line=line.trim();
			if(line.indexOf(' ')>0)
				line=line.substring(line.indexOf(' '),line.length());
			else
				line=null;
		}
		return count;
	}

}
