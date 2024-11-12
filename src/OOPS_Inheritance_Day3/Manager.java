package OOPS_Inheritance_Day3;

public class Manager extends Employee
{
	String departmentName;

	public Manager(String name, int age, String empId, String departmentName)
	{
		super(name, age, empId);
		this.departmentName = departmentName;
	}

	public void displayManagerInfo() 
	{
		displayEmployeeInfo();
		System.out.println("department name is : "+this.departmentName);
	}
	
	

}
/*
 * department (String): Department name of the manager.
 

Additional Method:
displayManagerInfo(): This method should call displayEmployeeInfo() from the Employee class and then print the department name.
*/

