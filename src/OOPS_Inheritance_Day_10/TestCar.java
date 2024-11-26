package OOPS_Inheritance_Day_10;

public class TestCar {

	public static void main(String[] args) 
	{
		Engine e = new Engine("Turbo Twin");
		
		Car c = new Car("Toyata","Supra",e);
		
		System.out.println(c);
	}

}
/*
Create TestCar class
---------------------
-> Create main method 
-> Create an engine object.
-> Create a car object that includes the engine.
-> Display the car's information.
*/