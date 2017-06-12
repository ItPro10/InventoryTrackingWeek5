package InventoryItems;

import java.util.List;

/*
 * This is console demo to show the use of the framework package 
 * and architecture packages
 * by Nalinie Nybo
 * Assignment 5 - MET CS 665 
 */
//child class of Movie
public class FictionMovie extends Movie{
	//constructor
	public FictionMovie(String title, String type, int qty, String director) {
		super(title, type, qty, director);
	}
	//method to display fiction movie list
	@Override
	public void CreateMovieItemList(List<Movie> fictionMovie) {

		for(int i = 0 ; i < fictionMovie.size()  ; i++)
		{
			Movie name = (Movie)fictionMovie.get(i);
			System.out.println("Fiction Movie item: " + name.getTitle() + ", Director: " + name.getDirector() + ", Quantity: " + name.getQuantity() + ", Type: " + name.getItemType());
		}
	}

	//display movie info
	public String getMovieDetails()
	{
		return "Fiction Movie: \nTitle: " + title + "\n Director: " + getDirector() + "\n Quantity: " + quantity + "\n Type: " + itemType;
	}

	//override toString method
	public String toString()
	{
		return getMovieDetails();
	}
}
