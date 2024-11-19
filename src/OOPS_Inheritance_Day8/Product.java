package OOPS_Inheritance_Day8;

public class Product 
{
	String name;
	double price;
	public Product(String name, double price) 
	{
		super();
		this.name = name;
		this.price = price;
	}
	
	public void displayInfo()
	{
		System.out.println("Product name : "+this.name);
		System.out.println("Product Price : "+this.price);
	}
	public double calculateTotalCost(int quantity)
	{
		double totalPrice = quantity*this.price;
		return totalPrice;
	}
}
/*
Create a class named Product:

It should have protected instance variables name (String) and price (double).
Implement a constructor that initializes the name and price.
Define a method displayInfo() that prints the product's name and price.
Define a method calculateTotalCost(int quantity) that calculates and returns the total cost of purchasing a given quantity of the product.

*/