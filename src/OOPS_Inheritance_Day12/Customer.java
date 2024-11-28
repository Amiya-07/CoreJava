package OOPS_Inheritance_Day12;

public class Customer 
{
	private int customerId;
	private String customerName;
	private String customerAddress;
	private Order order;
	
	public Customer(int customerId, String customerName, String customerAddress, Order order) 
	{
		super();
		this.customerId = customerId;
		this.customerName = customerName;
		this.customerAddress = customerAddress;
		this.order = order;
	}

	@Override
	public String toString() {
		return "Customer [customerId=" + customerId + ", customerName=" + customerName + ", customerAddress="
				+ customerAddress + ", order=" + order + "]";
	}
	
	
}
/*
Create a class Customer (Business Logic Class)
Instance Variables: 
   private int customerId;
   private String customerName;
   private String customerAddress;
   private Order order; //HAS-A relation
Create a parameterized constructor initialize the instance variable of the class.
Override toString() from Object class to print Customer class properties.
*/