package movies;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.TreeSet;
/**
 * creates a Hashset(in the superclass) of movies that have no duplicates and are sorted
 * @author solomonalemu
 *
 */
public class HashFilmArchive extends HashSet<Movie> implements FilmArchive
{


	
	/**
	 * gets the HS from the superclass(this) and puts it in a TS and passes that into an AR
	 * @return theMovies returns an AR of movies
	 */
	public ArrayList<Movie> getSorted()
	{
		
		
		TreeSet<Movie> sorted = new TreeSet<Movie>(this);
		ArrayList<Movie> theMovies = new ArrayList<Movie>(sorted);
				return theMovies;
		
	}
	
	
	

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
