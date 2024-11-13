package OOPS_Inheritance_Day4;

public class Car extends Vehicle
{
	int numberOfDoors;
	
	public Car(String make, String model, int year,int numberOfDoors)
	{
		super(make,model,year);
		if(numberOfDoors<=0)
		{
			System.err.print("Error Invalid Input");
			System.exit(0);
		}
		this.numberOfDoors= numberOfDoors;
	}
	
	public void displayDetails()
	{
		System.out.println("car make : "+super.make);
		System.out.println("car model : "+super.model);
		System.out.println("car manufacturing year : "+super.year);
		System.out.println("The car have "+this.numberOfDoors+" number of doors");
	}
}
/*
 Define the subclass Car Inherits from Vehicle
---------------------------------------------

Attributes:
numberOfDoors: int

Constructor:
Car(String make, String model, int year, int numberOfDoors): Constructor to initialize the attributes.

Methods:
void displayDetails(): Method to display the details of the car, overriding the method from Vehicle.
*/
