package OOPS_Inheritance_Day3;

public class LibraryItem 
{
	String title;

	public LibraryItem(String title) 
	{
		super();
		this.title = title;
	}
	public void displayInfo()
	{
		System.out.println("The book title is : "+this.title);
	}
	
}
/*
 LibraryItem (Base Class):

Attributes:
title (String): Title of the library item.
Methods:
displayInfo(): This method should print the title of the library item.
*/