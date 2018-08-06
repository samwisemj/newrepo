package com.capgemini.movies.classes;

import java.util.Comparator;

//Comparator class for movie name
public class MovieNameComparator implements Comparator<MovieDetails>{

	@Override
	public int compare(MovieDetails arg0, MovieDetails arg1) {
		
		return arg0.getMovieName().compareTo(arg1.getMovieName());
	}

}
