package DataAccess;
/*
 * This is console demo to show the use of the framework package 
 * and architecture packages
 * by Nalinie Nybo
 * Assignment 5 - MET CS 665 
 */
import MyFramework.DataStorage;
//DataAccess class that uses DataStorage framework
public class DataAccess extends DataStorage {

	//inherited from data storage framework
	@Override
	public void add() {
	}

	@Override
	public void SetConnections() {
		// not implemented
		System.out.println("Setting up connection to database...");
	}
	@Override
	public void VerifyData() {
		// not implemented
		System.out.println("Verifying data...");
	}

	// methods to retrieve data
	@Override
	public void getBookData() {
		// retrieve data from database
		System.out.println("Retrieving Books...");
		System.out.println(" Book: Harry Potter, Author: JK Rowling\n Book: Software Design, Author: Eric Braude");
	}
	@Override
	public void getMovieData() {
		// retrieve data from database
		System.out.println("Retrieving Movies...");
		System.out.println(" Movie: Star Wars, Director: George Lucas");
	}

	// insert data
	@Override
	public void addBookData(String title, String author) {
		// insert data
		VerifyData();
		System.out.println("Inserting Books...");
		System.out.println(" You have inserted: " + title + ", " + author);
	}
	@Override
	public void addMovieData(String title, String director) {
		// insert data
		VerifyData();
		System.out.println("Inserting Movies...");
		System.out.println(" You have inserted: " + title + ", " + director);
	}

	// edit data
	@Override
	public void editBookData(String title, String author, int quantity) {
		// edit data
		VerifyData();
		System.out.println("Editing Books...");
		System.out.println(" You have edited: " + title + ", " + author + " with a quantity of " + quantity);
	}
	@Override
	public void editMovieData(String title, String director, int quantity) {
		// edit data
		VerifyData();
		System.out.println("Editing Movies...");
		System.out.println(" You have edited: " + title + ", " + director + " with a quantity of " + quantity);
	}

}
