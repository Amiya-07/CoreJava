package OOPS_Day2;
import java.util.Scanner;
public class Employee_Demo {

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		Employee emp = new Employee();
		System.out.print("Enter Employee id ");
		int id = sc.nextInt();
		System.out.print("Enter Employee Name ");
		String name = sc.next();
		System.out.print("Enter Employee Salary ");
		Double sal = sc.nextDouble();
		emp.setEmployeeData(id,name,sal);
		emp.getEmployeeData();
	}

}
