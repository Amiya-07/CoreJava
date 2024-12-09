package OOPS_Inheritance_Day15;

public class Mamal extends Animal
{
	boolean hasFur;

	public Mamal(String species, boolean hasFur) 
	{
		super(species);
		this.hasFur = hasFur;
	}
	
	@Override
	public void makeSound()
	{
		System.out.println("Mamal Making sound");
	}

	@Override
	public String toString() {
		System.out.println(super.toString());
		return "Mamal [hasFur=" + hasFur + "]";
	}
	
	@Override
	public Mamal reproduce()
	{
		System.out.println("Mammals give birth to live young");
		return new Mamal(this.getSpecies(),this.hasFur);
		
	}
	
	public void nurseYoung()
	{
		System.out.println("Mammals nursing their young");
	}
	
}
/*
Create a subclass named Mammal that extends the Animal class.
Add an additional attribute:
hasFur (boolean): Indicates whether the mammal has fur.
Implement a parameterized constructor to initialize the attributes of both the Animal class and the Mammal class.

Override the makeSound() and toString() methods in the Mammal class.
@Override reproduce(): 
In the Mammal subclass, the reproduce() prints the message "Mammals give birth to live young." and 
returns a new Mammal object with the same species and fur attribute as the parent mammal.  

Implement an additional method:
nurseYoung(): Prints a message about mammals nursing their young.
*/