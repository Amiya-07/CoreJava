package OOPS_Inheritance_Day1;

public class Employee
{
	String name;
	double salary;
	
	public Employee(String name, double salary) 
	{
		super();
		this.name = name;
		this.salary = salary;
	}
	
	public void work()
	{
		System.out.println(name+" is working");
	}
}
class Manager extends Employee
{
	String department ;
	
	public Manager(String name, double salary,String department)
	{
		super(name,salary);
		this.department =  department;
	}
	
	public void manage()
	{
		work();
		System.out.println(name+" is managing "+ department +" Department");
	}

}
