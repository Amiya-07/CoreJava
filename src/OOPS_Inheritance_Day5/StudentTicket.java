package OOPS_Inheritance_Day5;

public class StudentTicket extends Ticket
{
	private boolean studentDiscount;

	public StudentTicket(String eventName, int seatNumber, double price, boolean studentDiscount) 
	{
		super(eventName, seatNumber, price);
		this.studentDiscount = studentDiscount;
	}

	public boolean isStudentDiscount() {
		return studentDiscount;
	}

	public void setStudentDiscount(boolean studentDiscount) 
	{
		this.studentDiscount = studentDiscount;
	}
	
	public void displayDetails()
	{
		System.out.println("Student Ticket");
		System.out.println("Event name : "+super.getEventName());
		System.out.println("Seat number : "+super.getSeatNumber());
		System.out.println("Ticket price : "+super.getPrice());
		System.out.println("Student discount: "+isStudentDiscount());
	}
	
}
/*
 * Create another class StudentTicket and inherit Ticket class here.
-------------------------------------------------------------------

Instance variable:-

boolean studentDiscount,private

Create a parameterized constructor for Instance variable to initialize the variable.

//Use super keyword to initialize Ticket class constructor attributes.

Generate Getters and setters for Instance variable to get values and set values.


*/
