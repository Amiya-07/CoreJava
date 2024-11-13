package OOPS_Inheritance_Day4;

public class TestVehicle {

	public static void main(String[] args) 
	{
		Car c = new Car("BMW","M5 Compitition",2023,4);
		System.out.println("\nCar Details:");
		c.displayDetails();
		Bike b = new Bike("BMW","S1000RR",-2024,"Super Sports");
		System.out.println("\nBike Details:");
		b.displayDetails();
		
	}

}
/*Create Test class
-----------------
-> create main method
-> in main method create Car object and Bick object.
-> Print the details of Car class and Bick class by calling displayDetails() methods of both class.*/