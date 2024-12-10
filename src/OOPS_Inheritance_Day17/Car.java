package OOPS_Inheritance_Day17;

public abstract class Car 
{
	String brand;
	String model;
	int milage;
	int top_Speed;
	int yearOfManufacturing;
	
	public Car() {
		super();
	}
	

	public Car(String brand, String model, int milage, int top_Speed, int yearOfManufacturing) {
		super();
		this.brand = brand;
		this.model = model;
		this.milage = milage;
		this.top_Speed = top_Speed;
		this.yearOfManufacturing = yearOfManufacturing;
	}


	public String carBrand() 
	{
		return this.brand;
	}
	
	public String carModel()
	{
		return this.model;
	}
	
	public int carMilage()
	{
		return this.milage;
	}
	
	public int carTopSpeed()
	{
		return this.top_Speed;
	}
	
	public int carYear()
	{
		return this.yearOfManufacturing;
	}
	
	public abstract void display();
}
/*
For abstract class Car 
Instance Variables:
brand : String default
model : String default
mileage : int default
top_speed : int default
yearOfManufacturing : int default
Methods:
No Argument Constructor
carBrand() : String : It return brand of the car by using brand variable so initialize brand variable and return it.

carModel() : String : It return model of the car by using model variable so initialize model variable and return it.

carMileage() : int : It return mileage of the car by using mileage variable so initialize mileage variable and return it 

carTopSpeed() : int : It return topspeed of the car by using top_speed variable so initialize top-speed variable and return it 

carYear() : int : It return year of manufacturing of the car by using yearOfManufacturing variable so initialize yearOfManufacturing variable and return it
display() : void : abstract : This is abstract method to implement in 

*/