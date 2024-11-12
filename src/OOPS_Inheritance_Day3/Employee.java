package OOPS_Inheritance_Day3;

public class Employee extends Person
{
	String empId;

	public Employee(String name, int age, String empId) 
	{
		super(name, age);
		this.empId = empId;
	}
	
	public void displayEmployeeInfo()
	{
		displayInfo();
		System.out.println("Employee id : "+this.empId);
	}

}
/*
Employee (Intermediate Class, inherits from Person):

Additional Attribute:
employeeId (String): Unique ID for each employee.
Additional Method:
displayEmployeeInfo(): This method should call displayInfo() from the Person class and then print the employee ID.
*/
