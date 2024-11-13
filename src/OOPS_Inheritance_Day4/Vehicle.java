package OOPS_Inheritance_Day4;

public class Vehicle
{
	String make ;
	String model;
	int year;
	
	public Vehicle(String make, String model, int year)
	{
		super();
		if(year<=0)
		{
			System.err.print("Error Invalid Input");
			System.exit(0);
		}
		this.make=make;
		this.model = model;
		this.year=year;
	}
	
	public void displayDetails()
	{
		System.out.println("The vehicle make : "+this.make);
		System.out.println("Vehicle model : "+this.model);
		System.out.println("Vehicle manufacturing year : "+this.year);
	}
}
/*
Define the base class Vehicle
-------------------------------

Attributes:
make: String
model: String
year: int

Constructor:
Vehicle(String make, String model, int year): Constructor to initialize the attributes.

Methods:
void displayDetails(): Method to display the details of the vehicle.
*/