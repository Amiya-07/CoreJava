package OOPS_Inheritance_Day_10;

public class TestOrder {

	public static void main(String[] args) 
	{
		Order o = new Order("A1C21","Shirt");
		Costumer c = new Costumer("Amiya","nayakarup172@gmail.com",o);
		
		System.out.println(c);
	}

}
/*
Create Shoping class
---------------------
-> Create main method 
-> Create an Order object.
-> Create a Customer object that includes the Order.
-> Display the Customer information.
*/