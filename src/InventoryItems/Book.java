package InventoryItems;
import java.util.List;

/*
 * This is console demo to show the use of the framework package 
 * and architecture packages
 * by Nalinie Nybo
 * Assignment 5 - MET CS 665 
 */
import MyFramework.ProductCatalog;
//Book class using ProductCatalog framework class
public class Book extends ProductCatalog{
	//instance variables
	private String author;

	//constructor
	public Book(String title, String type, int qty, String author) {
		super(title, type, qty);
		this.author = author;
	}
	//setters
	public void setAuthor(String author)
	{
		this.author = author;
	}
	//getters
	public String getAuthor()
	{
		return author;
	}

	//method to display Book list
	@Override
	public void CreateBookItemList(List<Book> book) {

		for(int i = 0 ; i < book.size()  ; i++)
		{
			System.out.println("Book item: " + book.get(i).title);
		}
	}
	@Override
	public void CreateItemList() {
	}

	//display book item info
	public String getBookDetails()
	{
		return "Book: \nTitle: " + title + "\n Author: " + author + "\n Quantity: " + quantity + "\n Type: " + itemType;
	}

	//override toString method
	public String toString()
	{
		return getBookDetails();
	}


}
