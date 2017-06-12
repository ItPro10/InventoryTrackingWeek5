package MyFramework;
/*
 * This is console demo to show the use of the framework package 
 * and architecture packages
 * by Nalinie Nybo
 * Assignment 5 - MET CS 665 
 */

//framework class for creating any type of user
public abstract class Person {
	//declare private variables
	private String firstName;
	private String lastName;

	//constructor
	public Person(String first, String last)
	{
		this.firstName = first;
		this.lastName = last;
	}
	//method to add user
	public abstract void add();

	//setters
	public void SetFirstName(String first)
	{
		this.firstName = first;
	}
	public void SetLastName(String last)
	{
		this.lastName = last;
	}

	//getters
	public String getFirstName()
	{
		return firstName;
	}
	public String getLastName()
	{
		return lastName;
	}
}
