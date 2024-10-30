package OOPS_Day6;

public class Employee
{
	private String firstName;
	private String lastName;
	private int employeeId;
	private double salary;
	private int noOfProjects;
	public Employee(String firstName, String lastName, int employeeId, double salary, int noOfProjects)
	{
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.employeeId = employeeId;
		this.salary = salary;
		this.noOfProjects = noOfProjects;
	}

	public void  CalculateSalary()
	{
		if(this.noOfProjects>=20)
		{
			this.salary=this.salary+15000;
		}
		else if(this.noOfProjects>=10)
		{
			this.salary=this.salary+10000;
		}
		else if(this.noOfProjects>5 )
		{
			this.salary=this.salary+5000;
		}
	
	}
	public void GetDetails()
	{
		System.out.println("Employee first name "+firstName);
		System.out.println("Employee last name "+lastName);
		System.out.println("Employee id "+employeeId);
		System.out.println("Employee salary "+this.salary);
		
	}
	
	
}
/*
Question-1
--------------
Create an Employee class (BLC Class)

Attributes :

names		Return Type
--------		---------------		
 firstName   	:String   
 lastName      	:String  
 employeeId 	:int  
 salary  		:double  
 NoOfProject 	:int 

Access Modifier : private (for all varriables)  

Implement constructors to initialize these properties.

implement calculateSalary() method that will add extra ammount in salary based on NoOfProject.

Return Type       : void
Access modifier :public

NoOfProject is more than 5 and less that 10 then add 5000
NoOfProject is more than 10 and less that 20 then add 10000
NoOfProject is more than 20 then add 15000

Take another class Tester (ELC Class) which is having main method and instantiate the Employee object and execute the methods.


Test Case 1: 
----------------
Valid Input with Projects Between 6 and 10
Input:

firstName: John
lastName: Doe
employeeId: 101
salary: 50000.00
NoOfProject: 7

Expected Output:

After executing calculateSalary(), the salary should be updated to 55000.00.
Print output showing the updated salary: 55000.00.

Test Case 2:
---------------
 Invalid Number of Projects (Negative Value)
Sample Input:

firstName: Michael
lastName: Johnson
employeeId: 105
salary: 45000.00
NoOfProject: -5

Expected Output:

Print an error message indicating invalid number of projects (e.g., "Number of projects cannot be negative").
Salary remains 45000.00.
*/