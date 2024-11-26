package OOPS_Inheritance_Day_10;

public class Order
{
	private String orderId;
	private String productName;
	
	public Order(String orderId, String productName) 
	{
		super();
		this.orderId = orderId;
		this.productName = productName;
	}
	
	public String getOrderId()
	{
		return orderId;
	}
	
	public String getProductName()
	{
		return productName;
	}

	@Override
	public String toString() {
		return "Order [orderId=" + orderId + ", productName=" + productName + "]";
	}
	
	
	
}
/*
Create the Order Class 
----------------------
A class to represent an order with details like order ID and product name.

Variable Declarations:
private String orderId; — This variable stores the order ID.
private String productName; — This variable stores the name of the product ordered.

Constructor Declaration:
public Order(String orderId, String productName) — A constructor to initialize the order ID and product name.

Getter Methods Declaration:
public String getOrderId() — A method to get the order ID.
public String getProductName() — A method to get the product name.

toString Method Declaration:
@Override public String toString() — A method to return a string representation of the order.
*/