package OOPS_Inheritance_Day5;

public class Mammal extends Animal
{
	private boolean hasFur;

	public Mammal(String name, boolean hasFur) 
	{
		super(name);
	    this.hasFur = hasFur;
		
	}

	public void setHasFur(boolean hasFur) 
	{
		
		this.hasFur = hasFur;
	}
	
	public boolean getHasFur() 
	{
		return hasFur;
	}

	public void displayDetails()
	{
		System.out.println("Name : "+super.getName());
		System.out.println("Has Fur : "+this.hasFur);
	}
	
	
}
/*
Create the Mammal Class
Requirements:
Extend the Animal class.
Add a private boolean attribute named hasFur.
Implement a parameterized constructor to initialize name (from Animal) and hasFur.
Implement getter and setter methods for hasFur.
Override the displayDetails method to include information about fur.
*/