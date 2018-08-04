package in.co.capgemini.test;

//class movie details
public class MovieDetails {
	public String MovieName;
	public String LeadActor; // instance members
	public String LeadActress;
	public String Genre;

	public MovieDetails(String movieName, String leadActor, String leadActress, String genre) {
		super();
		MovieName = movieName;
		LeadActor = leadActor;
		LeadActress = leadActress;
		Genre = genre;
	}

	// constructor
	public MovieDetails() {

	}

	public String getMovieName() {
		return MovieName;
	}

	public void setMovieName(String movieName) {
		MovieName = movieName;
	}

	public String getLeadActor() {
		return LeadActor;
	}

	public void setLeadActor(String leadActor) {
		LeadActor = leadActor;
	}

	public String getLeadActress() {
		return LeadActress;
	}

	public void setLeadActress(String leadActress) {
		LeadActress = leadActress;
	}

	public String getGenre() {
		return Genre;
	}

	public void setGenre(String genre) {
		Genre = genre;
	}

	@Override
	public String toString() {
		return "MovieDetails [MovieName=" + MovieName + ", LeadActor=" + LeadActor + ", LeadActress=" + LeadActress
				+ ", Genre=" + Genre + "]";
	}

}
