package in.co.capgemini.test;

//program to add,remove,find by name,find by genre,removeAll movies
public class MovieMain {

	public static void main(String[] args) {
		MovieDetailsList movie = new MovieDetailsList();

		// add movie details
		movie.addMovie(new MovieDetails("Arjun Reddy", "Vijay", "Shalini", "Romantic"));
		movie.addMovie(new MovieDetails("bahubali", "prabhas", "anushka", "action"));
		movie.addMovie(new MovieDetails("DDLJ", "Sharukh", "kajol", "Romantic"));

		// display all the movies in the collection
		movie.display();
		boolean checkByName = movie.findByName("Arjun Reddy");
		if (checkByName) {
			System.out.println("Movie Found");
		} else {
			System.out.println("Movie not Found");
		}

		boolean checkByGenre = movie.findByGenre("Romantic");
		if (checkByGenre) {
			System.out.println("Movie Found");
		} else {
			System.out.println("Movie not Found");
		}
		// remove the movie
		movie.removeAll();
		movie.display();
	}

}
