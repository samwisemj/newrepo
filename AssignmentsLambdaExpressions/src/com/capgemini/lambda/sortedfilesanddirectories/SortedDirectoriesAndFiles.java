package com.capgemini.lambda.sortedfilesanddirectories;

import java.io.File;
import java.util.Arrays;
import java.util.TreeSet;
import java.util.function.Predicate;
//lists folder and files respectively in a sorted order
public class SortedDirectoriesAndFiles {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		File file=new File("MyFolder");
		
		File listOfFolder[]=file.listFiles();
		
		//treeset object with lambda instead of comparator
		TreeSet<File> treeSet=new TreeSet<File>( (arg0,arg1) -> arg0.compareTo(arg1));
			
		treeSet.addAll(Arrays.asList(listOfFolder));
		Predicate<File> predicate=(element)->element.getName().contains(".");//returns whether file or not
		
		//applying negative predicate logic for the predicate to list the directories
		treeSet.stream().filter(predicate.negate()).forEach(System.out::println);
		//applying actual predicate logic to list the files
		treeSet.stream().filter(predicate).forEach(System.out::println);
	
	}

}
