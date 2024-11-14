package OOPS_Inheritance_Day5;

public class Student 
{
	
	int studentId;
	String name;
	double examFee;
	public Student(int studentId, String name, double examFee) 
	{
		super();
		this.studentId = studentId;
		this.name = name;
		this.examFee = examFee;
	}
	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", name=" + name + ", examFee=" + examFee + "]";
	}
	
	public String displayDetails()
	{
		return toString();
	}
	
	public double payFee(double amount)
	{
		System.out.println("All fees are cleared");
		return amount;
	}
	
	
}
/*
Create BLC class as Student  
---------------------------
It contains the following implementation.

Instance Variables: studentId : int , name :String , examFee:double

Methods: displayDetails(): String , payFee() :double

Define parameterized constructor and a toString method.

Create two BLC sub classes of Student called DayScholar and Hosteller. 
Add the following implementations to each class.
*/
