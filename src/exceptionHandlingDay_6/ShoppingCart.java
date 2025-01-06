package exceptionHandlingDay_6;

public class ShoppingCart 
{
	private int availableItems;

	public ShoppingCart(int availableItems)
	{
		super();
		this.availableItems = availableItems;
	}
	
	public void addItem(int quantity) throws InvalidItemException
	{
		if(this.availableItems<quantity)
		{
			throw new OutOfStockException("Sorry This Item Is Running Out Of Stock"); 
		}
		else if(quantity<=0)
		{
			throw new InvalidItemException("Invalid Item Quatity Request");
		}
		else
		{
			this.availableItems=this.availableItems-quantity;
			System.out.println("Item Added to your cart Successfully");
		}
	}
	
	public void addItemUnchecked(int quantity) throws OutOfStockException, InvalidItemException
	{
		if(this.availableItems<quantity)
		{
			throw new OutOfStockException("Sorry This Item Is Running Out Of Stock"); 
		}
		else if(quantity<=0)
		{
			throw new InvalidItemException("Invalid Item Quatity Request");
		}
		else
		{
			this.availableItems=this.availableItems-quantity;
			System.out.println("Item Added to your cart Successfully");
		}
	}
	
	
}
/*
* ShoppingCart Class:
-> The class should have a private instance variable availableItems representing the number of items in stock.
-> Implement a constructor to initialize the initial number of available items.
-> Implement a method addItem(int quantity) that adds items to the cart, throwing InvalidItemException for invalid quantities or 
insufficient stock.
-> Implement a method addItemUnchecked(int quantity) that simulates adding items, throwing OutOfStockException for 
quantities exceeding the available stock and handling IllegalArgumentException for invalid quantities.

*/