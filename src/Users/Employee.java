package Users;
/*
 * This is console demo to show the use of the framework package 
 * and architecture packages
 * by Nalinie Nybo
 * Assignment 5 - MET CS 665 
 */
import MyFramework.Person;
//Employee class that uses the Person framework class
public abstract class Employee extends Person{
	//constructor
	public Employee(String first, String last) {
		super(first, last);
	}
}
