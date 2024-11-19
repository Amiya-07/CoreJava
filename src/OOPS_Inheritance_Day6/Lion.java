package OOPS_Inheritance_Day6;

public class Lion extends Animal
{
	private int menelength;

	public Lion(String name, int age, int menelength) 
	{
		super(name, age);
		if(menelength<0)
		{
			System.out.println("Invalid input");
			System.exit(0);
		}
		else
		{
		this.menelength = menelength;
		}
	}
	
	public void makeSound()
	{
		System.out.println("The lion roars loudly");
	}
	
	public void displayManeLength()
	{
		System.out.println("mean length : "+this.menelength);
	}
	
}
/*
Create a subclass named Lion:
-----------------------------
Extend the Animal class.
Add a private instance variable maneLength (int).
Implement a constructor that takes name, age, and maneLength as parameters and initializes the superclass constructor.
Define a method makeSound() method to print "The lion roars loudly."
Define a method displayManeLength() that prints the maneLength.
*/