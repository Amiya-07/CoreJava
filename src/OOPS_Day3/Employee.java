package OOPS_Day3;

public class Employee 
{
	String firstName;
	String lastName;
	int employeeId;
	double salary;
	int noOfProject;
	public void setEmployeeData(String fName, String lName, int eId, double sal, int nProject )
	{
		firstName = fName;
		lastName = lName;
		employeeId = eId;
		noOfProject = nProject;
		salary = sal;
	}
	public void calculateSalary()
	{
		if (noOfProject>5 && noOfProject<10)
		{
			salary = salary+5000;
		}
		else if (noOfProject>10 && noOfProject<20)
		{
			salary = salary+10000;
		}
		else if (noOfProject>20 )
		{
			salary = salary+15000;
		}
	}
	public void displayDetails()
	{
		System.out.println("Employee id is is "+employeeId);
		System.out.println("Employee name is "+firstName+" "+lastName);
		System.out.println("Employee salary is "+salary);
		
	}
}

/*
 * Create a BLC class Employee class with properties 

private String firstName
private String lastName
private int employeeId
private double salary
private int noOfProject


Create a setEmployeeData() method with 5 parameters to initialize all the instance variables.

Implement calculateSalary() method that will add extra ammount in salary based on NoOfProject by using following criteria.

NoOfProject is more than 5 and less that 10 then add 5000.
NoOfProject is more than 10 and less that 20 then add 10000.
NoOfProject is more than 20 then add 15000. 	

 Take a method called displayDetails() to display the salary.
*/
