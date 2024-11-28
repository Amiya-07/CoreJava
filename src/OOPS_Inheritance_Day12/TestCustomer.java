package OOPS_Inheritance_Day12;

public class TestCustomer 
{

	public static void main(String[] args) 
	{
		Order order = new Order(121,"Shirt", 800);
		Customer customer = new Customer(121,"Amiya","Bhadrak",order);
		
		System.out.println(customer);

	}

}
