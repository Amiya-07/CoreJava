package OOPS_Inheritance_Day9;

public class Teacher 
{
	String name;
	int id ;
	String specialization;
	
	public Teacher ()
	{
		super();
		this.name="Unknown";
		this.id = 0;
		this.specialization="General";
	}
	public Teacher(String name, int id, String specialization)
	{
		super();
		this.name = name;
		this.id = id;
		this.specialization = specialization;
	}
	
	public void displayDetails()
	{
		System.out.println("----------------Teacher Details----------------");
		System.out.println("ID : "+this.id);
		System.out.println("Name : "+this.name);
		System.out.println("Specialization : "+this.specialization);
	}
	
}
/*
Base Class: Teacher

 private fields:

name (String): Name of the teacher.
id (int): Unique identifier for the teacher.
specialization (String): The area of expertise of the teacher.

Includes:

A default constructor to initialize the fields with default values:
name = "Unknown", id = 0, specialization = "General".

A parameterized constructor to initialize these fields with specific values.

A method displayDetails() to print the teacher's details.
*/
