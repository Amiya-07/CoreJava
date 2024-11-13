package OOPS_Inheritance_Day4;

public class ScienceStudent extends Student
{
	private int physicsMarks;
	private int chemistryMarks;
	private int mathMarks;
	public ScienceStudent(String name, int rollNumber, int physicsMarks, int chemistryMarks, int mathMarks) 
	{
		super(name, rollNumber);
		if(physicsMarks<0 || chemistryMarks<0||mathMarks<0)
		{
			System.err.print("ERROR Invalid input");
			System.exit(0);
		}
		this.physicsMarks = physicsMarks;
		this.chemistryMarks = chemistryMarks;
		this.mathMarks = mathMarks;
	}
	
	public void displayDetails()
	{
		System.out.println("Name : "+super.name);
		System.out.println("Roll number : "+super.rollNumber);
		System.out.println("physics mark : "+this.physicsMarks);
		System.out.println("Chemistry mark : "+this.chemistryMarks);
		System.out.println("Mathematics mark : "+this.mathMarks);
	}
	public double calculatePercentage()
	{
		double percentage = (this.chemistryMarks+this.physicsMarks+this.mathMarks)/3;
		return percentage;
	}
}
/*
Define class SceinceStudent extends from Student class
---------------------------------------------------------------
Attributes: private int physicsMarks, private int chemistryMarks, private int mathMarks
Costructor:  A constructor to initialize current class attributes and super class attributes.

Methods: Override displayDetails() a method to display parent class details as well current class details.
         Override calculatePercentage() a method wich will calculate and return percentage.
*/