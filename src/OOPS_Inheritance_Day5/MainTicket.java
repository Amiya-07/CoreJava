package OOPS_Inheritance_Day5;

public class MainTicket 
{

	public static void main(String[] args) 
	{
		Ticket t = new Ticket("Concert", 101, 50.0);
		t.displayDetails();
		System.out.println();
		VipTicket v = new VipTicket("VIP Concert", 201, 100.0, "Backstage Access") ;
		v.displayDetails();
		System.out.println();
		
		StudentTicket s = new StudentTicket("Student Event", 301, 30.0, true);
		s.displayDetails();
	}

}
/*
Create a class MainTicket which contains main method to demonstrate the usage.

//Creating a Ticket object using the parameterized constructor

//Creating a VIPTicket object using the parameterized constructor

//Creating a StudentTicket object using the parameterized constructor
*/