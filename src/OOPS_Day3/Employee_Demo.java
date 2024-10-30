package OOPS_Day3;
import java.util.Scanner;

public class Employee_Demo {

	public static void main(String[] args)
	{
		Employee e = new Employee();
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter employee first name ");
		String fName = sc.next();
		System.out.print("Enter employee last name ");
		String lName = sc.next();
		System.out.print("Enter employee id ");
		int eId = sc.nextInt();
		System.out.print("Enter employee sal ");
		double sal = sc.nextDouble();
		System.out.print("Enter no of projects done by this employee ");
		int nProject = sc.nextInt();
		
		e.setEmployeeData(fName, lName, eId, sal, nProject);
		e.calculateSalary();
		e.displayDetails();
	}

}
