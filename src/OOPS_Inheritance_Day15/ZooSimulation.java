package OOPS_Inheritance_Day15;

public class ZooSimulation 
{

	public static void main(String[] args) 
	{
		System.out.println("================= Mamal Details ================");
		Mamal lion = new Mamal("Lion",true);
		System.out.println(lion.toString());
		lion.makeSound();
		lion.reproduce();
		lion.nurseYoung();
		
		System.out.println("\n\n================= Bird Details ================");
		Bird Pegon = new Bird("Pegon",true);
		System.out.println(Pegon.getSpecies());
		Pegon.canFly();
		Pegon.makeSound();
		Pegon.reproduce();
		Pegon.buildNest();

	}

}
/*
ELC  - ZooSimulation:

Create an ELC named ZooSimulation that:

Instantiates a Mammal object (e.g., lion) with sample data.
Invokes methods on the Mammal object to demonstrate mammal-specific behaviors.
Instantiates a Bird object (e.g., eagle) with sample data.
Invokes methods on the Bird object to demonstrate bird-specific behaviors.
*/