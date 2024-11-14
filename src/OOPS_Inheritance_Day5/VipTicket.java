package OOPS_Inheritance_Day5;

public class VipTicket extends Ticket
{
	private String specialAccess;

	public VipTicket(String eventName, int seatNumber, double price, String specialAccess) 
	{
		super(eventName, seatNumber, price);
		this.specialAccess = specialAccess;
	}

	public String getSpecialAccess() {
		return specialAccess;
	}

	public void setSpecialAccess(String specialAccess) {
		this.specialAccess = specialAccess;
	}
	
	
	public void displayDetails()
	{
		System.out.println("VIP Ticket");
		System.out.println("Event name : "+super.getEventName());
		System.out.println("Seat number : "+super.getSeatNumber());
		System.out.println("Ticket price : "+super.getPrice());
		System.out.println("Special Access : "+getSpecialAccess());
	}
	
}
/*
Create another class VIPTicket and inherit Ticket class here.
---------------------------------------------------------------

Instance variable:-

String specialAccess,private

Create a parameterized constructor for Instance variable to initialize the variable.

//Use super keyword to initialize Ticket class constructor attributes.

Generate Getters and setters for Instance variable to get values and set values.
*/