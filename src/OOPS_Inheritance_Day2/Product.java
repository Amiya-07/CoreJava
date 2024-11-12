package OOPS_Inheritance_Day2;

public class Product 
{
	protected String name;
	protected double price;
	public Product(String name, double price) 
	{
		super();
		this.name = name;
		this.price = price;
	}
	public void displayInfo()
	{
		System.out.println("The product name is : "+this.name);
		System.out.println("The price of product is : "+this.price);
	}
	
	public double calculateTotalCost(int quantity)
	{
		this.price = this.price*quantity;
		return this.price;
	}
	

}
