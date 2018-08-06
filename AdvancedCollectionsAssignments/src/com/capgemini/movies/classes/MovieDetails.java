package com.capgemini.movies.classes;

//movie details class
public class MovieDetails {

	private String movieName;
	private String leadActor;
	private String leadActress;
	private String genre;

	@Override
	public String toString() {
		return "MovieDetails [movieName=" + movieName + ", leadActor=" + leadActor + ", leadActress=" + leadActress
				+ ", genre=" + genre + "]";
	}


	public MovieDetails(String movieName, String leadActor, String leadActress, String genre) {

		this.movieName = movieName;
		this.leadActor = leadActor;
		this.leadActress = leadActress;
		this.genre = genre;
	}

	public String getMovieName() {
		return movieName;
	}

	public String getLeadActor() {
		return leadActor;
	}

	public String getLeadActress() {
		return leadActress;
	}

	public String getGenre() {
		return genre;
	}
}

//	@Override
//	public int compareTo(MovieDetails arg0) {
//		switch (constant) {
//		case 1:
//			return (this.movieName).compareTo(arg0.getMovieName());
//
//		case 2:
//			return (this.leadActor).compareTo(arg0.getLeadActor());
//
//		case 3:
//			return (this.leadActress).compareTo(arg0.getLeadActress());
//
//		default:
//			return (this.genre).compareTo(arg0.getGenre());
//
//		}

//	}
//}
