package com.capgemini.lambda.filefilter;

import java.io.File;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class FilenameFilterAssignment {

	public static void main(String[] args) {
		
		File file=new File("MyFolder");
		String extension=".txt";
		
		//converting a returned String array to list using asList()
		List<String> listOfFoldersAndFiles=Arrays.asList(file.list());

		//defining the predicate
		Predicate<String> predicate=(element)->element.contains(extension);
		listOfFoldersAndFiles.stream().filter(predicate).forEach(System.out::println);
	}

}
