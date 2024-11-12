package OOPS_Inheritance_Day2;

public class Vehicle 
{
	String brandName;
	int manufacturingYear;
	
	public Vehicle(String brandName, int manufacturingYear)
	{
		this.brandName=brandName;
		this.manufacturingYear = manufacturingYear;
	}
	public void displayVehicleDetails() 
	{
		System.out.println("The brand name is : "+this.brandName);
		System.out.println("Manufacturing year of vehicle is : "+this.manufacturingYear);
	}

}
/*
Create a class named Vehicle with the following attributes:
brand (String): The brand of the vehicle.
year (int): The year the vehicle was manufactured.
Constructor:
Vehicle(String brand, int year): Initializes the brand and year of the vehicle.
Method:
void displayVehicleDetails(): Displays the vehicle’s brand and year.
*/