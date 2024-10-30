package OOPS_Day7;
import java.util.Scanner;
public class EmployeeDemo {

	public static void main(String[] args) 
	{
		int count=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter total employee");
		int quantity=sc.nextInt();
		while(quantity>count)
		{
			System.out.print("Enter employee name ");
			String name = sc.nextLine();
			name = sc.nextLine();
			System.out.print("Enter employee age ");
			int age = sc.nextInt();
			System.out.print("Enter employee department ");
			String department = sc.next();
			System.out.print("Enter employee salary ");
			double salary = sc.nextDouble();
			System.out.print("Enter employee performance ");
			String performance= sc.next();
			
			
			Employee e = new Employee(name,age,department,salary,performance);
			e.getDetails();
			System.out.println("Employee salary "+e.updateSalary());
			count++;
		}
	}

}
