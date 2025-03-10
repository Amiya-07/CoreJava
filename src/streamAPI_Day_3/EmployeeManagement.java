package streamAPI_Day_3;

import java.util.*;
import java.util.stream.Collectors;
public class EmployeeManagement {

	private static List<Employee> l = new ArrayList<>() ;
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) 
	{
		
		while(true)
		{
			System.out.println("********** USER MENU **********");
			System.out.println("1.Add Employee\n2.Update Employee\n3.Remove Employee\n4.Sort Employees\n5.Find Highest salary By Department\n6.Catagorize and Increase Salary\n7.Exit\nEnter Your Choice");
			int choice = Integer.parseInt(sc.nextLine());
			switch(choice)
			{
				case 1:
					addEmployee();
					break;
				case 2:
					System.out.println("Enter Employee Index You want to Update");
					int index1 = Integer.parseInt(sc.nextLine());
					updateEmployee(index1);
					break;
				case 3:
					System.out.println("Enter Employee Index You want to Update");
					int index2 = Integer.parseInt(sc.nextLine());
					removeEmployee(index2);
					break;
				case 4:
					sortEmployeesByName();
					break;
				case 5:
					findHighestSalaryByDepartment();
					break;
					
				case 6:
					categorizeAndIncreaseSalary();
					break;
				case 7:
					System.err.println("YOU ARE EXITING NOW");
					for(Employee e : l)
					{
						System.out.println(e);
					}
					System.exit(0);
					break; 
				default : 
					System.err.println("Invalid Choice");
			}
		}
		
	}

	
	
	
	
	
	public static void addEmployee()
	{
		try
		{
			System.out.println("Enter Employee name");
			String name = sc.nextLine();
			System.out.println("Enter Employee gender");
			String gen = sc.nextLine();
			System.out.println("Enter Employee Department");
			String dept = sc.nextLine();
			System.out.println("Enter Employee Salary");
			double salary = Double.parseDouble(sc.nextLine());
			System.out.println("Enter Employee Years of Experience");
			int yoe = Integer.parseInt(sc.nextLine());
			
		
			if(salary<0)
			{
				throw new NullPointerException("Salary Can't be Negative");
			}
			boolean flag = l.add(new Employee(name,gen,dept,salary,yoe));
			if(flag)
			{
				System.out.println("Employee Details Stored Successfully");
			}
			else
			{
				System.err.println("Employee Details Stored Already"
						+ "");
			}
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
	}
	
	public static void updateEmployee(int index)
	{
		try
		{
			Employee e1 = l.remove(index);
			System.out.println("************* Update Menu *************");
			System.out.println("1.Update Name\n2.Update Gender\n3.Update Department\n4.Update Salary\n5.Update Year Of Experience\nEnter Your Choice :-");
			int choice = Integer.parseInt(sc.nextLine());
			
			switch(choice)
			{
				case 1:
					System.out.println("Enter Employee New Name ");
					String name = sc.nextLine();
					e1.setName(name);
					l.add(e1);
					System.out.println("Employee Name Updated Successfully");
				case 2:
					System.out.println("Enter Employee Gender ");
					String gen = sc.nextLine();
					e1.setGender(gen);
					l.add(e1);
					System.out.println("Employee Gender Updated Successfully");
				case 3:
					System.out.println("Enter Employee Department ");
					String dept = sc.nextLine();
					e1.setDepartment(dept);
					l.add(e1);
					System.out.println("Employee Department Updated Successfully");
				case 4:
					System.out.println("Enter Employee new  Salary ");
					Double salary = Double.parseDouble(sc.nextLine());
					e1.setSalary(salary);
					l.add(e1);
					System.out.println("Employee Salary Updated Successfully");
				case 5:
					System.out.println("Enter Employee new  year of experience ");
					int yoe = Integer.parseInt(sc.nextLine());
					e1.setYears_of_experience(yoe);
					l.add(e1);
					System.out.println("Employee Year Of Experience Updated Successfully");
					break;
				default :
					System.err.println("Invalid Choice");
					
					
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	public static void removeEmployee(int index)
	{
		Employee e =  l.remove(index);
		if(e.equals(null))
		{
			throw new NullPointerException("Employee Details Not found");
		}
		else
		{
			System.out.println("Employee Details Removed Successfully");
		}
	}
	
	
	public static void sortEmployeesByName()
	{
		l = l.stream().sorted((p1, p2)-> p1.getName().compareTo(p2.getName())).toList();
		for(Employee e : l)
		{
			System.out.println(e);
		}
	}
	
	public static void findHighestSalaryByDepartment()
	{
		
		Map<String, Optional<Employee>> collect = l.stream().collect(Collectors.groupingBy(Employee::getDepartment,Collectors.maxBy(Comparator.comparingDouble(Employee::getSalary))));
		collect.forEach((x,y)->System.out.println(x+ " "+y.get()));
	}
	
	
	public static void categorizeAndIncreaseSalary()
	{
		 Map<String, Map<String, Employee>> hsgd = l.stream()
		            .collect(Collectors.groupingBy(
		                Employee::getGender,Collectors.groupingBy(Employee::getDepartment,Collectors.collectingAndThen(Collectors.maxBy(Comparator.comparingDouble(Employee::getSalary)),Optional::get))));
		        hsgd.forEach((g, d) -> {
		            System.out.println("Gender: " + g);
		            d.forEach((dept, emp) -> {
		                System.out.print("  Department: " + dept);
		                System.out.print("    Highest Salary Employee: " + emp+"\n");
		            });
		        });

		/*
		 * Map<String, Optional<Employee>> l3 = l.stream().collect(Collectors.groupingBy(Employee::getGender, Collectors.maxBy(Comparator.comparingDouble(Employee::getSalary))));
		
		l3.forEach((x,y)-> System.out.println(x+"  "+y.get()));
		 */
	}
	
	
	
	
}
