package com.capgemini.movies.classes;

import java.util.ArrayList;
import java.util.Collections;
//Class to insert new movies into a list and adds functionality of varios types
public class MovieDetailsList {

	ArrayList<MovieDetails> arrayList;

	public MovieDetailsList() {
		arrayList = new ArrayList<>();
	}

	// find movie by name
	public void findMovieName(String movieName) {

		int flag = 0;
		for (MovieDetails movie : arrayList) {

			if (movie.getMovieName().equalsIgnoreCase(movieName)) {
				System.out.println("Found\n" + movie);
				flag = 1;
			}
		}
		if (flag != 1) {
			System.out.println("Not Found");
		}
	}

	// remove all the movies from the collections
	public void removeAllMovies() {
		System.out.println("Removing all movies from list....This action cant be undone");
		arrayList.removeAll(arrayList);
	}

	// find movie by genre
	public void findMovieGenre(String genre) {

		int flag = 0;
		for (MovieDetails movie : arrayList) {

			if (movie.getGenre().equalsIgnoreCase(genre)) {
				System.out.println("Found\n" + movie);
				flag = 1;
			}
		}
		if (flag != 1) {
			System.out.println("Not Found");
		}
	}

	// lets assume we will remove the movie by movie name
	public void remove_movie(String movieName) {
		MovieDetails removeMovie = null;
		for (MovieDetails movie : arrayList) {
			if (movie.getMovieName().equalsIgnoreCase(movieName)) {
				System.out.println("Deleting--\n" + movie);
				removeMovie = movie;
			}
		}
		if (removeMovie != null)
			arrayList.remove(removeMovie);
		else
			System.out.println("Movie Not Present");
	}

	// add movie
	public void add_movie(String movieName, String leadActor, String leadActress, String genre) {
		arrayList.add(new MovieDetails(movieName, leadActor, leadActress, genre));
	}

	//displays the list elements
	public void display() {
		arrayList.stream().forEach((movie) -> System.out.println(movie));
	}

//	this function takes in a parameter and sorts the list accordingly
	public void sort(int x)
	{
		switch (x) {
		case 1:
			Collections.sort(arrayList, new MovieNameComparator());
			break;

		case 2:
			Collections.sort(arrayList, new LeadActorComparator());
			break;
		case 3:
			Collections.sort(arrayList, new MovieLeadActressComparator());
			break;

		default:
			Collections.sort(arrayList, new GenreComparator());
			break;

		}
	}

}
