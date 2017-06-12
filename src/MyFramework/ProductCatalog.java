package MyFramework;

import java.util.List;

import InventoryItems.Book;
import InventoryItems.Movie;

/*
 * This is console demo to show the use of the framework package 
 * and architecture packages
 * by Nalinie Nybo
 * Assignment 5 - MET CS 665 
 */
//This framework class provides methods for products such as inventory items
public abstract class ProductCatalog {
	//private instance variables
	public String title;
	public String itemType;
	public int quantity;

	//constructor
	public ProductCatalog(String title, String type, int qty)
	{
		this.title = title;
		this.itemType = type;
		this.quantity = qty;
	}



	//setters
	public void SetTitle(String title)
	{
		this.title = title;
	}
	public void SetItemType(String type)
	{
		this.itemType = type;
	}
	public void SetQuantity(int qty)
	{
		this.quantity = qty;
	}

	//getters
	public String getTitle()
	{
		return title;
	}
	public String getItemType()
	{
		return itemType;
	}
	public int getQuantity()
	{
		return quantity;
	}

	//method to create item list
	public  void CreateItemList() {
	}
	//method to create movie items list
	public void CreateMovieItemList(List<Movie> movie) {
	}
	//method to create book items list
	public void CreateBookItemList(List<Book> book) {	
	}



}
