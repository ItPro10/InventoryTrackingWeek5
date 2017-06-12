package InventoryItems;

import java.util.List;

/*
 * This is console demo to show the use of the framework package 
 * and architecture packages
 * by Nalinie Nybo
 * Assignment 5 - MET CS 665 
 */
//child class of book
public class FictionBook extends Book{

	//constructor
	public FictionBook(String title, String type, int qty, String author) {
		super(title, type, qty, author);
	}
	//method to display fiction book list
	@Override
	public void CreateBookItemList(List<Book> fictionBook) {

		for(int i = 0 ; i < fictionBook.size()  ; i++)
		{
			Book name = (Book)fictionBook.get(i);
			System.out.println("Fiction Book item: " + name.getTitle() + ", Author: " + name.getAuthor() + ", Quantity: " + name.getQuantity() + ", Type: " + name.getItemType());
		}
	}

	//display book info
	public String getBookDetails()
	{
		return "Fiction Book: \n Title: " + title + "\n Author: " + this.getAuthor() + "\n Quantity: " + quantity + "\n Type: " + itemType;
	}

	//override toString method
	public String toString()
	{
		return getBookDetails();
	}
}
