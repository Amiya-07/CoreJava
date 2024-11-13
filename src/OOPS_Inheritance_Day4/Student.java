package OOPS_Inheritance_Day4;

public class Student 
{
	protected String name ;
	protected int rollNumber;
	public Student(String name, int rollNumber) 
	{
		super();
		this.name = name;
		this.rollNumber = rollNumber;
	}
	
	public void displayDetails()
	{
		System.out.println("the student name is : "+this.name);
		System.out.println("The student roll number is : "+this.rollNumber);
		
	}
	
	public double calculatePercentage()
	{
		
		return 0 ;
	}
}
/*
Define the base class Student
------------------------------
Attributes: protected Sreing name and protected int rollNumber.

Costructor:  A constructor to initialize these attributes

Methods: 1) public void displayDetails() a method to display student details.
         2) public double calculatePercentage() a method wich will calculate and return percentage.
*/