package in.co.capgemini.test;

import java.util.*;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.function.Consumer;
import java.util.function.Predicate;

//class movieDetailsList which contains all the methods
public class MovieDetailsList {
	Set<MovieDetails> movie = new LinkedHashSet<>(); // LinkedHAshSet collection

	// Add movie method
	public void addMovie(MovieDetails movieName) {
		movie.add(movieName);
		System.out.println(movieName.getMovieName() + "added");
	}

	// method to remove a movie
	public void removeMovie(String movieName) {
		Predicate<MovieDetails> delmovie = MovieDetails -> MovieDetails.getMovieName().equals(movieName);
		movie.removeIf(delmovie);
	}

	// method to remove all movies
	public void removeAll() {
		movie.clear();
		System.out.println("All movies deleted");
	}

	// method to find the movie by name
	public boolean findByName(String movieName) {
		Predicate<MovieDetails> checkMovieByName = MovieDetails -> MovieDetails.getMovieGenre().equals(movieName);
		return movie.stream().anyMatch(checkMovieByName);
	}

	// method to find the movie by genre
	public boolean findByGenre(String Genre) {
		Predicate<MovieDetails> checkMovieByGenre = MovieDetails -> MovieDetails.getMovieName().equals(Genre);
		return movie.stream().anyMatch(checkMovieByGenre);
	}

	// method to display all the movies in the colletion
	public void display() {
		Consumer<MovieDetails> disp = MovieDetails -> System.out.println(MovieDetails);
		movie.stream().forEach(disp); // display the elements of collection
	}
}
