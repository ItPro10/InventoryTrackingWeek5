package MyFramework;
/*
 * This is console demo to show the use of the framework package 
 * and architecture packages
 * by Nalinie Nybo
 * Assignment 5 - MET CS 665 
 */
//Framework class for data storage
public abstract class DataStorage {
	public abstract void add();

	// setup data connection
	public abstract void SetConnections() ;

	// verify data
	public abstract void VerifyData() ;

	// methods to retrieve data
	public abstract void getBookData() ;

	public abstract void getMovieData() ;

	// insert data
	public abstract void addBookData(String title, String author) ;

	public abstract void addMovieData(String title, String director) ;

	// edit data
	public abstract void editBookData(String title, String author, int quantity) ;

	public abstract void editMovieData(String title, String director, int quantity) ;
}
