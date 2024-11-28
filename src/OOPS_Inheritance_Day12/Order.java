package OOPS_Inheritance_Day12;

public class Order 
{
	private int orderId;
    private String itemName;
	private double itemPrice;
	
	public Order(int orderId, String itemName, double itemPrice) 
	{
		super();
		this.orderId = orderId;
		this.itemName = itemName;
		this.itemPrice = itemPrice;
	}

	@Override
	public String toString() {
		return "Order [orderId=" + orderId + ", itemName=" + itemName + ", itemPrice=" + itemPrice + "]";
	}
	
	
}
/*
Create a class Order (Business Logic Class)
Instance Variables: 
   private int orderId;
   private String itemName;
   private double itemPrice;
Create a parameterized constructor initialize the instance variable of the class.
Override toString() from Object class to print Order class properties.
*/