package OOPS_Inheritance_Day9;

public class Employee 
{
	private String name;
	private int id ;
	private double salary;
	public Employee()
	{
		super();
		this.id=0;
		this.name=null;
		this.salary=0.0;
	}
	public Employee(String name, int id, double salary) 
	{
		super();
		this.name = name;
		this.id = id;
		this.salary = salary;
	}
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public double calculateSalary()
	{
		return salary;
	}
	
}
/*
Employee Class:

Include private variables: String name, int id, and double salary.
Implement a default constructor and a parameterized constructor to initialize these variables.
Create a method called calculateSalary() that returns the salary of a generic employee.
*/