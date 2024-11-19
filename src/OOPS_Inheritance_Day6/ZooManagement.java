package OOPS_Inheritance_Day6;

public class ZooManagement {

	public static void main(String[] args) 
	{
		Lion lion = new Lion("Don", 2, 121);
		System.out.println("Lion Details ");
		lion.displayInfo();
		lion.makeSound();
		lion.displayManeLength();
		
		System.out.println();
		Elephant elephant = new Elephant("Joker", 9, 11);
		System.out.println("Elephant Details ");
		elephant.displayInfo();
		elephant.makeSound();
		elephant.displayTuskLength();
				
	}

}
/*
Create a class named ZooManagement (as provided in the code):
-------------------------------------------------------------
In the main method, create instances of both Lion and Elephant with appropriate values.
Print information about the lion and the elephant, including their specific attributes and the sounds they make.
*/