package com.capgemini.movies.classes;

import java.util.Comparator;
//Comparator class for movie genre
public class GenreComparator implements Comparator<MovieDetails> {

	@Override
	public int compare(MovieDetails o1, MovieDetails o2) {
		// TODO Auto-generated method stub
		return o1.getGenre().compareTo(o2.getGenre());
	}

}
