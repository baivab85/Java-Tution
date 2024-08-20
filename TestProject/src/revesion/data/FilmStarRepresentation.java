package revesion.data;

import java.util.Arrays;

public class FilmStarRepresentation extends HumanRepresentation {
	private String[] movies;

	public String[] getMovies() {
		return movies;
	}

	public void setMovies(String[] movies) {
		this.movies = movies;
	}


	public String toString() {
		return super.toString()+"[movies=" + Arrays.toString(movies) + "]";
	}
	
	
}
