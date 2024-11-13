package OOPS_Inheritance_Day4;

public class Bike extends Vehicle
{
	String type;

	public Bike(String make, String model, int year, String type) 
	{
		super(make, model, year);
		this.type = type;
	}
	
	public void displayDetails()
	{
		System.out.println("bike make : "+super.make);
		System.out.println("bike model : "+super.model);
		System.out.println("bike manufacturing year : "+super.year);
		System.out.println("The bike type is : "+this.type);
	}
	
}
/*
 Define the subclass Bike Inherits from Vehicle
---------------------------------------------

Attribute:
type: String

Constructor:
Bike(String make, String model, int year, String type): Constructor to initialize the attributes.

Methods:
void displayDetails(): Method to display the details of the bike, overriding the method from Vehicle.

*/
