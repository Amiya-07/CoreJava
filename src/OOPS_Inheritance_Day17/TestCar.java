package OOPS_Inheritance_Day17;

public class TestCar extends Car
{
	public TestCar(String brand, String model, int milage, int top_Speed, int yearOfManufacturing) 
	{
		super(brand, model, milage, top_Speed, yearOfManufacturing);
	}
	
	public static void main(String[] args)
	{
		TestCar tc = new TestCar("Porsche","911 GTR",3,350,2024);
		tc.display();
	}
	
	@Override
	
	public void display()
	{
		
		System.out.println("Car Brand : "+super.brand);
		System.out.println("Car Model : "+super.model);
		System.out.println("Milage : "+super.milage);
		System.out.println("Car top speed : "+super.top_Speed);
		System.out.println("Car Year of Manufacturing :"+super.yearOfManufacturing);
	}

}
