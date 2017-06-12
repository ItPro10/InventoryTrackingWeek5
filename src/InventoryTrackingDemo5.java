import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import InventoryItems.Book;
import InventoryItems.FictionBook;
import InventoryItems.FictionMovie;
import InventoryItems.Movie;
import InventoryItems.NonFictionBook;
import InventoryItems.NonFictionMovie;

public class InventoryTrackingDemo5 {
	/*
	 * This is console demo 
	 * to show the use of the framework package 
	 * and architecture packages
	 * by Nalinie Nybo
	 * Assignment 5 - MET CS 665 
	 */

	/*
	 * PROMPTS
	 * This class prompts the user for input
	 * 1. User can select A to see a demo of adding an inventory item
	 * 2. User can select V to see a demo of viewing a list of inventory items
	 * 3. User can select E to see a demo of editing an inventory item
	 */

	/*
	 * Additional Info
	 * Framework and Architecture separated into different packages
	 * default package contains the demo class - InventoryTrackingDemo5.java
	 */
	public static void main(String[] args) {
		//declare and instantiate Lists of type Book and Movie
		List<Book> fictionBookList = new ArrayList<Book>();
		List<Book> nonFictionBookList = new ArrayList<Book>();
		List<Movie> fictionMovieList = new ArrayList<Movie>();
		List<Movie> nonFictionMovieList = new ArrayList<Movie>();

		//prompt user for input
		String input = JOptionPane.showInputDialog("Enter A to add new book item, V to view a list of Inventory Items, E to edit an item: ");

		//demo adding a new book item
		if(input.equalsIgnoreCase("A"))
		{
			//prompt for more input
			String name = JOptionPane.showInputDialog("Enter name of book: ");
			String type = JOptionPane.showInputDialog("Enter type of book: ");
			String quantity = JOptionPane.showInputDialog("Enter quantity of book: ");
			String author = JOptionPane.showInputDialog("Enter author of book: ");
			Book newBook = new FictionBook(name, type, Integer.parseInt(quantity), author);
			System.out.println("Adding new book..");
			System.out.println(newBook);
		}


		//demo viewing a list of inventory items
		else if(input.equalsIgnoreCase("V"))
		{
			System.out.println("Viewing list of items in inventory..");
			//create item
			Book product = new FictionBook("The Hobbit", "Fiction", 50, "JRR Tolkien");
			Book product2 = new FictionBook("Fellowship of the Ring", "Fiction", 50, "JRR Tolkien");
			//add to list
			fictionBookList.add(product);
			fictionBookList.add(product2);
			//create item
			Book product3 = new NonFictionBook("Software Design", "NonFiction", 30, "Eric Braude");
			Book product4 = new NonFictionBook("Software Design 2", "NonFiction", 30, "Eric Braude");
			//add to list
			nonFictionBookList.add(product3);
			nonFictionBookList.add(product4);
			//create item
			Movie product5 = new FictionMovie("Star Wars", "Fiction", 50, "George Lucas");
			Movie product6 = new FictionMovie("The Empire Strikes Back", "Fiction", 50, "George Lucas");
			//add to list
			fictionMovieList.add(product5);
			fictionMovieList.add(product6);
			//create item
			Movie product7 = new NonFictionMovie("History of Rome", "NonFiction", 40, "Julius Casear");
			Movie product8 = new NonFictionMovie("History of Rome 2", "NonFiction", 40, "Julius Casear");
			//add to list
			nonFictionMovieList.add(product7);
			nonFictionMovieList.add(product8);

			//call functions to iterate through lists 
			//and display list items
			product.CreateBookItemList(fictionBookList);
			product3.CreateBookItemList(nonFictionBookList);
			product5.CreateMovieItemList(fictionMovieList);
			product7.CreateMovieItemList(nonFictionMovieList);
		}

		//demo editing item
		else if(input.equalsIgnoreCase("E"))
		{
			//prompt for value to update quantity
			String input2 = JOptionPane.showInputDialog("Enter new quantity value to update item to: ");
			System.out.println("Original item values: ");
			Book product = new FictionBook("The Hobbit", "Fiction", 50, "JRR Tolkien");
			System.out.println(product);
			//call setter from ProductCatalog framework class
			product.SetQuantity(Integer.parseInt(input2.trim()));
			System.out.println("New item values: ");
			System.out.println(product); 
		}
	}
}
