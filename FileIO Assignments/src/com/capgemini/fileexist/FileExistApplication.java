package com.capgemini.fileexist;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;

//Class to check whether file exists
public class FileExistApplication {

	public static void main(String[] args) throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the name of the file (Hint: Enter TestFile.txt tos test the text file present in the project)");
		String path=br.readLine();
		
		//creating a file object with the file path specified
		File file=new File(path);
		
		//checking whether the file exists or the path is a directory
		if(file.exists() && file.isFile())
			System.out.println("File found");
		else
			System.out.println("File not found");
	}

}
