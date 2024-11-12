package OOPS_Inheritance_Day2;

public class SportMotorCycle extends Motorcycle
{
	boolean raceMode;
	public SportMotorCycle(String name, int manufacturingYear, int engineCapacity, boolean raceMode)
	{
	super(name, manufacturingYear, engineCapacity);
	this.raceMode = raceMode;
	}
	
	public void activateRaceMode()
	{
		if(raceMode)
		{
			System.out.println(" race mode is now on");
		}
		else
		{
			System.out.println(" race mode is now off");
		}
	}
	
	public void displaySportMotorcycleDetails()
	{
		super.startEngine();
		activateRaceMode();
		super.displayVehicleDetails();
		
    }
}
/*

SportMotorcycle Class (Child Class)

Create a class named SportMotorcycle that inherits from Motorcycle.
Additional attribute:
raceMode (boolean): Indicates if race mode is activated for the sport motorcycle.
Constructor:
SportMotorcycle(String brand, int year, int engineCapacity, boolean raceMode): Initializes the brand, year, engine capacity,
 and race mode status of the sport motorcycle.
Methods:
void activateRaceMode(): Activates race mode and displays a message confirming that race mode is now on.
void displaySportMotorcycleDetails(): Displays the full details of the sport motorcycle, including brand, year, engine capacity,
and the status of race mode.



*/