package movies;

import java.util.ArrayList;

import java.util.TreeSet;
/**
 * creates an ArrayList(in the superclass) of movies that have no duplicates and are sorted
 * @author solomonalemu
 *
 */
public class ListFilmArchive extends ArrayList<Movie> implements FilmArchive
{

	/**
	 * the add method checks every movie in the ArrayList for duplicates and if there is none it adds to the list
	 * @param m is the movie that is going to be added to the ArrayList Assuming its originality
	 */
	public boolean add(Movie m)
	{
		if(!this.isEmpty())
		{
			
			for(Movie s: this)
			{
				if(s.equals(m))
				{
					
					return false;
				}
				
				
			}
			
			
		}
	
	
		
		boolean reallyAdded = super.add(m);
		
		return reallyAdded;
	
	
		
		
	}
	
	/**
	 * puts our AL into a TS and and returns it as an AR
	 * @return theMovies returns an AR of movies
	 */
	 public ArrayList<Movie> getSorted()
	{
		
		//puts the AR in the TS
		TreeSet<Movie> sorted = new TreeSet<Movie>(this);
		//
		ArrayList<Movie> theMovies = new ArrayList<Movie>(sorted);
				return theMovies;
		
	}
	
	
	
	public static void main(String[] args) 
	{
		ListFilmArchive archive = new ListFilmArchive(); 
		for (Movie m: Movie.getTestMovies())
			archive.add(m); 
		for (Movie m: archive)
			System.out.println(m); 
		System.out.println("**************"); 
		for (Movie m: archive.getSorted())
			System.out.println(m);
		}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
