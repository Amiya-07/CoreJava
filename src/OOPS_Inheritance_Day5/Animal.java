package OOPS_Inheritance_Day5;

public class Animal 
{
	private String name;

	public Animal(String name) 
	{
		super();
		this.name = name;
	}
	
	public void setName (String name)
	{
		this.name=name;
		
	}
	
	public String getName()
	{
		return this.name;
	}
	
	public void displayDetails()
	{
		System.out.println("Name : "+this.name);
	}
	
}
/*
Create the Animal Class
Requirements:
Define a private String attribute named name.
Implement a parameterized constructor to initialize name.
Implement getter and setter methods for name.
Create a method to display the animal's details.
*/