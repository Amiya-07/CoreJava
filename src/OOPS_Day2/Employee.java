package OOPS_Day2;

public class Employee
{
	int empId;
	String empName;
	double empSal;
	public void setEmployeeData(int id , String name , double sal )
	{
		empId = id ;
		empName = name ;
		empSal = sal;
	}
	public void getEmployeeData() 
	{
		System.out.println("Employee Id is : "+empId);
		System.out.println("Employee Name is : "+empName);
		System.out.println("Employee Salary is : "+empSal);
	}
}
/*
Write a Program on OOPs to define Employee class properties and behaviour.

properties :
employeeId : int
employeeName : String
employeeSalary : double

Initialize these properties with the help of Methods using Scanner class not by using Object reference.

behavior:
setEmployeeData() : public void
getEmployeeData() : public void
*/