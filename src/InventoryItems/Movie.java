package InventoryItems;
import java.util.List;

/*
 * This is console demo to show the use of the framework package 
 * and architecture packages
 * by Nalinie Nybo
 * Assignment 5 - MET CS 665 
 */
import MyFramework.ProductCatalog;
//Movie class using ProductCatalog framework class
public class Movie extends ProductCatalog{
	//instance variables
	private String director;

	//constructor
	public Movie(String title, String type, int qty, String director) {
		super(title, type, qty);
		this.director = director;
	}

	//setter
	public void setDirector(String director)
	{
		this.director = director;
	}
	//getter
	public String getDirector()
	{
		return director;
	}

	//method to display movie list
	@Override
	public void CreateMovieItemList(List<Movie> movie) {
		for(int i = 0 ; i < movie.size() ; i++)
		{
			System.out.println("Movie item: " + movie.get(i));
		}

	}

	@Override
	public void CreateItemList() {
		// TODO Auto-generated method stub

	}

	//display movie info
	public String getMovieDetails()
	{
		return "Movie: \nTitle: " + title + "\n Director: " + director + "\n Quantity: " + quantity + "\n Type: " + itemType;
	}

	//override toString method
	public String toString()
	{
		return getMovieDetails();
	}

}
