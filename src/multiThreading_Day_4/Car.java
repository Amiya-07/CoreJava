package multiThreading_Day_4;

public class Car implements Runnable  
{
	String name;
	PetrolPump petrolPump;
	
	public Car(String name, PetrolPump petrolPump)
	{
		super();
		this.name = name;
		this.petrolPump = petrolPump;
	}

	@Override
	public void run() 
	{
		petrolPump.reFillCar(name);
		
	}
}
