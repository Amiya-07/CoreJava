package OOPS_Day6;

public class Employee1 
{
	public int employeeNumber;
	public String employeeName;
	public double salary;

	public Employee1(int employeeNumber, String employeeName, double salary)
	{
		super();
		if(employeeNumber<=0)
		{
			System.err.println("id must be always positive integer");
			return;
		}
		if(employeeName==null)
		{
			System.err.println("name must initialize with any default name");
			return ;
		}
		if(salary<=0)
		{
			System.err.println("salary cannot be negative");
			return;
		}
		
		this.employeeNumber = employeeNumber;
		this.employeeName = employeeName;
		this.salary = salary;
	}

}
/*
 * Create a class Employee (Business Logic Class)

 Instance Variables:

Names		 Type
---------	 ----------------
 employeeNumber : int

 employeeName 	: String

 employeeSalary	: double

 Access Modifier  :public (for all variables)

 Create a parameterized constructor to initialilize all the fields.
 
 Create another class Tester (ELC class)

 which contains main method  which will receive all the instance variable value from BLC class.


 In this ELC class print the following details

 a) If salary is >=60000, Print Employee is a Developer

 b) If salary is >=40000 and <60000 , Print Employee is a Designer

 c) If Salary is <40000 , Print Employee is a Tester


Input:

232, "Naresh Kumar", 43000


Output:

Employee is a Designer
*/
