package InventoryItems;

import java.util.List;

/*
 * This is console demo to show the use of the framework package 
 * and architecture packages
 * by Nalinie Nybo
 * Assignment 5 - MET CS 665 
 */
//child class of movie
public class NonFictionMovie extends Movie{
	//constructor
	public NonFictionMovie(String title, String type, int qty, String director) {
		super(title, type, qty, director);
	}
	//method to display non-fiction movie list
	@Override
	public void CreateMovieItemList(List<Movie> nonFictionMovie) {

		for(int i = 0 ; i < nonFictionMovie.size() ; i++)
		{
			Movie name = (Movie)nonFictionMovie.get(i);
			System.out.println("Non-Fiction Movie item: " + name.getTitle() + ", Director: " + name.getDirector() + ", Quantity: " + name.getQuantity() + ", Type: " + name.getItemType());

		}
	}
	//display movie info
	public String getMovieDetails()
	{
		return "Non-Fiction Movie: \nTitle: " + title + "\n Director: " + this.getDirector() + "\n Quantity: " + quantity + "\n Type: " + itemType;
	}

	//override toString method
	public String toString()
	{
		return getMovieDetails();
	}
}
