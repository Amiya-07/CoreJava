package OOPS_Inheritance_Day9;

public class ClassDetails extends Teacher
{
	String className;
	int numberOfStudents;
	
	public ClassDetails()
	{
		super();
		this.className="Not Assigned";
		this.numberOfStudents=0;
	}
	
	public ClassDetails(String name, int id, String specialization,String className, int numberOfStudents) {
		super(name,id,specialization);
		this.className = className;
		this.numberOfStudents = numberOfStudents;
	}
	
	public void displayClassDetails()
	{
		super.displayDetails();
		System.out.println("Class : "+this.className);
		System.out.println("number Of Students :"+this.numberOfStudents);
	}
}
/*
ClassDetails
Inherits the Teacher class and includes:

Additional private fields:
className (String): The name of the class handled by the teacher.
numberOfStudents (int): The number of students in the class.

A default constructor to initialize:

className = "Not Assigned", numberOfStudents = 0.

A parameterized constructor to initialize the teacher's details along with the class-specific details.

A method displayClassDetails() to display the teacher's information and class details.
*/