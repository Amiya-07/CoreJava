package multiThreading_Day_4;

public class PetrolPumpSimulation {

	public static void main(String[] args) throws InterruptedException 
	{
		PetrolPump p = new PetrolPump();
		
		Car porshe = new Car("Porshe",p);
		Car BMW = new Car("BMW",p);
		Car Tata = new Car("Tata",p);
		Car c[] = {porshe,BMW,Tata};
		
		Thread t[] = {new Thread(porshe),new Thread(BMW), new Thread(Tata)};
		for(Thread t1 : t)
		{
			Thread.sleep(1000);
			t1.start();
			t1.join();
		}

	}

}
