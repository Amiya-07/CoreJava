package OOPS_Day7;

public class RetailStore 
{
	private String itemName;
	private double pricePerUnit;
	private int quantity;
	private double totalPrice;
	
	public RetailStore(String itemName, double pricePerUnit, int quantity) 
	{
		super();
		String name = itemName.toLowerCase();
		if(name.equals("null")||name.length()==0|| pricePerUnit==0 || quantity==0)
		{
			System.err.println("Invalid information");
			System.exit(0);
		}
		this.itemName = itemName;
		this.pricePerUnit = pricePerUnit;
		this.quantity = quantity;
	}

	public String getItemName() 
	{
		if(itemName.length()==0)
		{
			System.err.println("Invalid item name");
		}
		return itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public double getPricePerUnit() 
	{
		if(pricePerUnit==0 )
		{
			System.err.println("Invalid price per unit");
		}
		return pricePerUnit;
	}

	public void setPricePerUnit(double pricePerUnit) {
		this.pricePerUnit = pricePerUnit;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity)
	{
		if(quantity==0)
		{
			System.err.println("Invalid quantity");
		}
		this.quantity = quantity;
	}
	
	public double calculateTotalValue()
	{
		this.totalPrice=this.pricePerUnit*this.quantity;
		return this.totalPrice;
	}
	
	
}
/*
esign a inventory system for a retail store :

InventoryItem Class: [BLC Class]

Create an InventoryItem class with the following 
 
Attributes:
--------------
Names			dataType
---------		-----------
itemName        	String 
pricePerUnit    	double 
quantityInStock 	int 

Implement a constructor that takes parameters to initialize the attributes of the InventoryItem object.

Provide getter and setter methods for each attribute to ensure proper encapsulation.

 Method:
-------------
MethodName  		:calculateTotalValue()
Return Type		:double
Access Modifier 	:public

This method should calculate and return the total value of the inventory item in stock, which is the product of the price per unit and the quantity in stock.


Take a InventoryMain class (ELC Class) which is having  main method to  Create instances of the InventoryItem class, perform calculations, and display relevant information such as the total value of the item in stock and whether a reorder is required.

Taste Case -1
-----------------
Sample Input :

Item Name: "Apples"
Price per Unit: 10
Quantity in Stock: 15

Expected Output: 
Total Value of Apples in Stock: 150

Test Case 2:
--------------- 
Sample Input:

Item Name: "Oranges"
Price per Unit: -5.0
Quantity in Stock: 20

Expected Output: 
Error message indicating invalid price.

Test Case 3: 
---------------
Sample Input :

Item Name: "Bananas"
Price per Unit: 5.0
Quantity in Stock: -10

Expected Output:
 Error message indicating invalid quantity.

Test Case 4 :
--------------- 
sample input :

Item Name: ""
Price per Unit: 8.0
Quantity in Stock: 10

Expected Output:
 Error message indicating invalid item name
*/