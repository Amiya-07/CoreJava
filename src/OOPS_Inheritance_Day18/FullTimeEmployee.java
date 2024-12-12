package OOPS_Inheritance_Day18;

public class FullTimeEmployee implements Employee
{
	private int employeeId;
	private String employeeName;
	private double employeeSalary;
	private double benefits;
	
	
	public FullTimeEmployee(int employeeId, String employeeName, double employeeSalary, double benefits) {
		super();
		if(employeeSalary<0)
		{
			System.err.println("Salary Can not be Negative");
			System.exit(0);
		}
		
		if(employeeName=="")
		{
			System.err.println("Employee Naame Can not be Empty");
			System.exit(0);
		}
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.employeeSalary = employeeSalary;
		this.benefits = benefits;
	}

	@Override
    public double calculateSalary()
    {
    	this.employeeSalary = this.employeeSalary+this.benefits;
    	return this.employeeSalary;
    }
	
	@Override
	public void generatePayroll()
	{
		System.out.println("Base salary : "+this.employeeSalary);
		System.out.println("Benefits : "+this.benefits);
	}
}
/*
FullTimeEmployee Class :

Implement a class named FullTimeEmployee that implements the Employee interface.

Include Attributes :
employeeId     	:(int)
employeeName   	:(String)
monthlySalary 	:(double) 
benefits 			:(double)

Acess modifier :private(for all the varriable )

Provide a constructor that initializes the employee details.

Implement the calculateSalary() method to calculate the salary for a full-time employee, including benefits.

Implement the generatePayroll() method to print the payroll information for a full-time employee.

*/