package com.capgemini.movies.classes;

import java.util.Comparator;
//Comparator class for lead actor
public class LeadActorComparator implements Comparator<MovieDetails> {

	@Override
	public int compare(MovieDetails o1, MovieDetails o2) {
		
		return o1.getLeadActor().compareTo(o2.getLeadActor());
	}
	

}
