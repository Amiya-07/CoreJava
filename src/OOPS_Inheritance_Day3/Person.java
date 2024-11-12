package OOPS_Inheritance_Day3;

public class Person 
{
	String name ;
	int age;
	public Person(String name, int age) 
	{
		super();
		this.name = name;
		this.age = age;
	}
	public void displayInfo()
	{
		System.out.println("The name is : "+this.name);
		System.out.println("age is : "+this.age);
	}
	
}
/*
Attributes:
name (String): Name of the person.
age (int): Age of the person.
Methods:
displayInfo(): This method should print the name and age of the person.

*/
