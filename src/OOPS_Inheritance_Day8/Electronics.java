package OOPS_Inheritance_Day8;

public class Electronics extends Product
{
	String brand;

	public Electronics(String name, double price, String brand)
	{
		super(name, price);
		this.brand = brand;
	}
	
	public void displayInfo()
	{
		super.displayInfo();
		System.out.println("Product Brand : "+this.brand);
	}
	
}
/*
Create a subclass named Electronics:
Extend the Product class.

Add a private instance variable brand (String).
Implement a constructor that takes name, price, and brand as parameters and initializes the superclass constructor.
Define a method displayInfo() method to additionally print the product's brand.

*/