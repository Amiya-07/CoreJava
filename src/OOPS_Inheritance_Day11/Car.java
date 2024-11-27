package OOPS_Inheritance_Day11;

public class Car 
{
	private String brand;
	private String model ;
	private int year ;
	private Driver driver;
	
	public Car(String brand, String model, int year, Driver driver) 
	{
		super();
		if(year<0)
		{
			System.err.println("Invalid input");
			System.exit(0);
		}
		this.brand = brand;
		this.model = model;
		this.year = year;
		this.driver = driver;
	}
	
	
	public Car(Car c)
	{
		this.brand=c.getBrand();
		this.model=c.getModel();
		this.year=c.getYear();
		this.driver=c.getDriver();
	}


	public String getBrand() {
		return brand;
	}


	public void setBrand(String brand) {
		this.brand = brand;
	}


	public String getModel() {
		return model;
	}


	public void setModel(String model) {
		this.model = model;
	}


	public int getYear() {
		return year;
	}


	public void setYear(int year) {
		this.year = year;
	}


	public Driver getDriver() {
		return driver;
	}


	public void setDriver(Driver driver) {
		this.driver = driver;
	}
	
	
	public void changeDriver(Driver newDriver)
	{
		setDriver(newDriver);
	}


	
	

	
	

}
/*
Create a Java BLC class named Car with following attributes:
private String brand
private String model
private int year and
private Driver driver

Implement a parameterised constructor to initialise all the instance variable of Car.
Implement one copy constructor for the Car class that takes a Car object and  initialize the new Car object with the same attributes.
Take a pair of setter and getter method for all the instance variables.
In the Car class, create a method named changeDriver(Driver newDriver) that changes the driver of the car to the specified driver.
*/