package OOPS_Inheritance_Day2;
import java.util.Scanner;

public class MotorcycleInheritanceExample {

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Vehicle brand");
		String name = sc.next();
		System.out.println("Enter the manufacturing year");
		int year = sc.nextInt();
		System.out.println("Enter the engine capacity in cc");
		int engineCapacity = sc.nextInt();
		System.out.println("Enter the race mode is on or not");
		boolean raceMode = sc.nextBoolean();
		
		SportMotorCycle s = new SportMotorCycle(name, year, engineCapacity, raceMode);
		s.displaySportMotorcycleDetails();
	}

}
