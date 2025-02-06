package collection_Day_2;

import java.util.ArrayList;
import java.util.Scanner;

public class Directory 
{
	ArrayList<Employee> al = new ArrayList<>();
	
	public void addEmployee(Employee e)
	{
		al.add(e);
	}
	
	public void displayAllEmployees() 
	{
		for(Employee e : al)
		{
			System.out.println(e.toString());
		}
	}
	
	public void updateEmployee(Employee e)
	{
		Scanner sc = new Scanner(System.in);
		boolean flag =false;
		for(Employee s : al)
		{
			if(s.equals(e))
			{
				flag=true;
			}
		}
		
		while (true)
		{
			if(flag)
			{
				System.out.println("******MENU******\n1.Update Name\n2.Update Desg\n3.Update Salary\n4.Exit");
				int choice = sc.nextInt();
				switch(choice)
				{
					case 1:
						System.out.println("Enter New name");
						String name = sc.next();
						sc.nextLine();
						e.setName(name);
						System.out.println("Name updated successfully");
						break;
						
					case 2:
						System.out.println("Enter New Designation");
						String desg = sc.next();
						e.setDesg(desg);
						System.out.println("Designation updated successfully");
						break;
						
					case 3:
						System.out.println("Enter new Salary");
						double salary = sc.nextDouble();
						e.setSalary(salary);
						System.out.println("salary updated successfully");
						break;
						
					default: 
						displayAllEmployees();
						System.out.println("*********Thank you*********");
						return ;
				}
			}
			else
			{
				System.err.println("Sorry : the Employee is no longer part of this directory");
			}
		}
	}
	
	public void deleteEmployee(Employee e)
	{
		al.remove(e);
	}
	
}
