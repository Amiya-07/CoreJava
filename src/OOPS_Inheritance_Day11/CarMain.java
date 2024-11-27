package OOPS_Inheritance_Day11;

public class CarMain 
{
	
	public static void displayCarDetails(Car c)
	{
		System.out.println("Car Brand name : "+c.getBrand());
		System.out.println("Car model  : "+c.getModel());
		System.out.println("Car year : "+c.getYear());
		System.out.println("Driver name : "+c.getDriver().getName());
		System.out.println("Driver age : "+c.getDriver().getAge());
		
	}
	

	public static void main(String[] args) 
	{
		Driver d1 = new Driver("Gourav",21); 
		Car c1 = new Car("Porsche","Tycan",2023,d1);
		System.out.println(" Original Car Details:");
		displayCarDetails(c1);
		System.out.println("Original Car Details after Changing Driver:");
		Driver d2 = new Driver("Mohan",20);
		c1.changeDriver(d2);
		displayCarDetails(c1);
		
		Driver d3 = new Driver("Vishwajeet",22);
		c1.changeDriver(d3);
		displayCarDetails(c1);
		
	}

}
