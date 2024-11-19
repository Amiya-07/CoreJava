package OOPS_Inheritance_Day6;

public class Animal 
{
	private String  name ;
	private int age;
	public Animal(String name, int age) 
	{
		super();
		if(age<0)
		{
			System.out.println("Invalid input");
			System.exit(0);
		}
		this.name = name;
		this.age = age;
	}
	
	public void makeSound()
	{
		System.out.println("The animal makes a generic sound");
	}
	public void displayInfo()
	{
		System.out.println("Name : "+this.name);
		System.out.println("Age : "+this.age);
	}
}
/*
Create a class named Animal:
-----------------------------
It should have private instance variables name (String) and age (int).
Implement a constructor that initializes the name and age.
Define a method makeSound() that prints "The animal makes a generic sound."
Define a method displayInfo() that prints the name and age.
*/