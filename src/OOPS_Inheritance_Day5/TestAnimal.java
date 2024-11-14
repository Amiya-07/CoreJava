package OOPS_Inheritance_Day5;

public class TestAnimal {

	public static void main(String[] args) 
	{
		Dog d = new Dog("Vishwajeet",true,"Labrador");
		d.displayDetails();
		System.out.println();
		Dog d1 = new Dog("Buddy",true,"Golden Retriever");
		d1.displayDetails();
	}

}
/*
Create the Main Class
Requirements:
Create an instance of the Dog class.
Display details of the Dog object to demonstrate inheritance.
*/