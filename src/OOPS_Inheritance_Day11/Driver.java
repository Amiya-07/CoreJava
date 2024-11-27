package OOPS_Inheritance_Day11;

public class Driver 
{
	private String name;
	private int age;
	
	public Driver(String name, int age) 
	{
		super();
		if(age<0)
		{
			System.err.println("Invalid input");
			System.exit(0);
		}
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	
	
}
/*
Create a Driver class and the class should have following attributes:
private String name and
private int age 
Implement a parameterised constructor to initialise all the instance variable of Driver.
Take a pair of setter and getter method for all the instance variables.
*/