package OOPS_Inheritance_Day5;

public class Dog extends Mammal
{
	private String breed;

	public Dog(String name, boolean hasFur, String breed)
	{
		super(name, hasFur);
		this.breed = breed;
	}

	public String getBreed() 
	{
		return breed;
	}

	public void setBreed(String breed)
	{
		this.breed = breed;
	}
	
	public void displayDetails()
	{
		System.out.println("Name : "+super.getName());
		if(super.getHasFur() == true)
		{
		System.out.println("Has Fur : Yes");
		}
		else
		{
			System.out.println("Has Fur : No");
		}
		System.out.println("Breed  : "+this.breed);
	}
	
	
	
}
/*
Create the Dog Class
Requirements:
Extend the Mammal class.
Add a private String attribute named breed.
Implement a parameterized constructor to initialize name, hasFur (from Mammal), and breed.
Implement getter and setter methods for breed.
Override the displayDetails method to include information about the breed.
*/