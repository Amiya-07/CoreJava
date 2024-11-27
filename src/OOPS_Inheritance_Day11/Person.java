package OOPS_Inheritance_Day11;

public class Person 
{
	private String name;
	private Address address;
	public Person(String name, Address address) 
	{
		super();
		this.name = name;
		this.address = address;
	}
	
	public void displayInfo()
	{
		System.out.println("Name : "+this.name);
		System.out.println("Street : "+address.getStreet());
		System.out.println("City : "+address.getCity());
	}
	
}
/*
Create Person Class:
--------------------
Implement a class with private fields for the name and an Address object.
Provide a constructor to initialize the name and address.
Implement a method to display the person's name and address.

*/