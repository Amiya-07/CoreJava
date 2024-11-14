package OOPS_Inheritance_Day5;

public class Ticket 
{
	private String eventName;
	private int seatNumber;
	private double price;
	public Ticket(String eventName, int seatNumber, double price) 
	{
		super();
		this.eventName = eventName;
		this.seatNumber = seatNumber;
		this.price = price;
	}
	public String getEventName() {
		return eventName;
	}
	public void setEventName(String eventName) {
		this.eventName = eventName;
	}
	public int getSeatNumber() {
		return seatNumber;
	}
	public void setSeatNumber(int seatNumber) {
		this.seatNumber = seatNumber;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
	public void displayDetails()
	{
		System.out.println("Regular Ticket");
		System.out.println("Event name : "+getEventName());
		System.out.println("Seat number : "+getSeatNumber());
		System.out.println("Ticket price : "+getPrice());
	}
	

}
/*
1.Create a class Ticket
------------------------

Instance variable:-

String eventName,private

int seatNumber,private

double price,private

Create a parameterized constructor for all Instance variable to initialize the variable.

Generate Getters and setters for all Instance variable to get values and set values.
*/