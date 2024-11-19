package OOPS_Inheritance_Day6;

public class Elephant extends Animal
{
	private int tuskLength;

	public Elephant(String name, int age, int tuskLength) 
	{
		super(name, age);
		if(tuskLength<0)
		{
			System.out.println("Invalid input");
			System.exit(0);
		}
		else
		{
		this.tuskLength = tuskLength;
		}
	}
	
	public void makeSound()
	{
		System.out.println("The elephant trumpets");
	}
	
	public void displayTuskLength()
	{
		System.out.println("Tusk Length is :"+this.tuskLength);
	}
}
/*Create another subclass named Elephant:
---------------------------------------
Extend the Animal class.
Add a private instance variable tuskLength (float).
Implement a constructor that takes name, age, and tuskLength as parameters and initializes the superclass constructor.
Define a method  the makeSound() method to print "The elephant trumpets."
Define a method displayTuskLength() that prints the tuskLength.
*/