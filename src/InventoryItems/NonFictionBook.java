package InventoryItems;

import java.util.List;

/*
 * This is console demo to show the use of the framework package 
 * and architecture packages
 * by Nalinie Nybo
 * Assignment 5 - MET CS 665 
 */
//child class of Book
public class NonFictionBook extends Book{
	//constructor
	public NonFictionBook(String title, String type, int qty, String author) {
		super(title, type, qty, author);
	}

	//method to display non-fiction book list
	@Override
	public void CreateBookItemList(List<Book> nonfictionBook) {

		for(int i = 0 ; i < nonfictionBook.size()  ; i++)
		{
			Book name = (Book)nonfictionBook.get(i);
			System.out.println("Non-Fiction Book item: " + name.getTitle() + ", Author: " + name.getAuthor() + ", Quantity: " + name.getQuantity() + ", Type: " + name.getItemType());
		}
	}
	//display book info
	public String getBookDetails()
	{
		return "Non-Fiction Book:\nTitle: " + title + "\n Author: " + this.getAuthor() + "\n Quantity: " + quantity + "\n Type: " + itemType;
	}

	//override toString method
	public String toString()
	{
		return getBookDetails();
	}
}
