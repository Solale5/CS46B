package movies;

import java.util.ArrayList;
import java.util.TreeSet;
/**
 * creates TreeSet(in the superclass) of movies that have no duplicates and are sorted
 * @author solomonalemu
 *
 */
public class TreeFilmArchive extends TreeSet<Movie> implements FilmArchive
{


	
	/**
	 * returns an arraylist with a treeset of movies inside of it and is sorted by compareTo
	 *  @return theMovies returns an AR of movies
	 */
	 public ArrayList<Movie> getSorted()
	{
		
		
		ArrayList<Movie> theMovies = new ArrayList<Movie>(this);
				return theMovies;
		
	}
	
	
}
