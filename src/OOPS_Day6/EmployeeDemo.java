package OOPS_Day6;
import java.util.Scanner;

public class EmployeeDemo {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Employee first name ");
		String fName = sc.next();
		System.out.println("Enter Employee last name ");
		String lName = sc.next();
		System.out.println("Enter Employee id ");
		int id= sc.nextInt();
		System.out.println("Enter Employee salary ");
		double salary = sc.nextDouble();
		System.out.println("Enter Employee no of projects ");
		int projects= sc.nextInt();
		
		Employee e = new Employee(fName, lName, id, salary, projects);
		e.CalculateSalary();
		e.GetDetails();
		
		
	}

}
