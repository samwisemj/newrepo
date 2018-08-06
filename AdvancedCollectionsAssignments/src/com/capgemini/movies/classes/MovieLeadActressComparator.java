package com.capgemini.movies.classes;

import java.util.Comparator;
//Comparator class for lead actress
public class MovieLeadActressComparator implements Comparator<MovieDetails>{

	@Override
	public int compare(MovieDetails o1, MovieDetails o2) {
		// TODO Auto-generated method stub
		return o1.getLeadActress().compareTo(o2.getLeadActress());
				
	}

}
