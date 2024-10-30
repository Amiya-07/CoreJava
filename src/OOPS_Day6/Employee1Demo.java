package OOPS_Day6;

import java.util.Scanner;

public class Employee1Demo {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Employee name ");
		String name = sc.nextLine();
		System.out.println("Enter Employee id ");
		int id = sc.nextInt();
		System.out.println("Enter Employee salary ");
		double salary = sc.nextDouble();
		
		Employee1 e = new Employee1(id, name, salary);
		
		if(e.salary>=60000)
		{
			System.out.println("Employee is a Developer");
		}
		else if(e.salary>=40000)
		{
			System.out.println("Employee is a Designer");
		}
		else if(e.salary<40000)
		{
			System.out.println("Employee is a Tester");
		}
		sc.close();
	}

}
