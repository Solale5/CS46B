package movies;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * 
 * @author solomonalemu
 * Movie class that creates movies with a title and a year and has various methods to compare other movies
 */
public class Movie implements Comparable<Movie>
{

private String title;
private int year;



public Movie(String title, int year) 
{
	this.title = title;
	this.year = year;
}

/**
 * the compareTo method takes a movie and compares it to another movie by title, then by year and returns -1, 0, or 1 
 * @param that is the movie THAT you will be comparing to the earlier constructed movie (this)
 * @return compares this to another movie by title, then by year and returns -1, 0, or 1 
 */
public int compareTo(Movie that)
{
	
	int titleCmp = this.title.compareTo(that.title);
	if(titleCmp != 0)
	{
		
		return titleCmp;	
	}
	return (int)Math.signum(this.year - that.year);
}


public String getTitle() 
{
	return this.title;
}



public int getYear()
{
	return this.year;
	
}




/**
 * equals and hashCode allows use to use Hash Sets in our code later 
 * @param x Takes an object
 * @return returns true or false depending on if the movies have the same instance variables
 */
public boolean equals(Object x)
{
	//cast object x as a movie
	Movie that = (Movie)x;
	
	return this.compareTo(that) == 0;

}

/**
 * gets our movie we constructed as a string with its information
 * @return returns a string with the movie, the title, and the year
 */
public String toString()
{

String movie = ("Movie");

	return movie + " " +this.title + " " + "(" +this.year + ")";

}

/**
 * gets test movies
 * @return theMovies returns an array of test movies for later in the assignment
 */
public static Movie[] getTestMovies()
{
	Movie [] theMovies = new Movie[10];
	theMovies [0] = new Movie("Avengers", 2010);
	theMovies [1] = new Movie("Avengers", 1950);
	theMovies [2] = new Movie("Spiderman", 2002);
	theMovies [3] = new Movie("Solomon's Movie", 2002);
	theMovies [4] = new Movie("Iron Man", 2010);
	theMovies [5] = new Movie("Iron Man", 2010);
	theMovies [6] =  new Movie("Thor", 2010);
	theMovies [7] = new Movie("Captain America", 2010);
	theMovies [8] = new Movie("Hulk", 2008);
	theMovies [9] = new Movie("Incredibles", 2004);
	
	return theMovies;
											
			
	
}



public int hashCode() 
{
return title.hashCode() + year; 
}



}
