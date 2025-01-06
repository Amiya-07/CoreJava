package exceptionHandlingDay_6;
import java.util.Scanner;

public class SeatMain {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		ReservationSystem shyamoli = new ReservationSystem(80);
		try(sc)
		{
			System.out.println("How many seat you want to reserve");
			int n = sc.nextInt();
			shyamoli.reserveSeat(n);
			shyamoli.reserveSeatUnchecked(n);
		}
		catch(InvalidReservationException e)
		{
			System.err.println(e.getMessage());
		}
		catch(SeatUnavailableException e)
		{
			System.err.println(e.getMessage());
		}
	}

}
/*
* Main Class (ReservationSystemScenario):

-> In the main method, create an instance of ReservationSystem with an initial number of available seats (e.g., 30).
-> Demonstrate the use of reserveSeat for valid and invalid seat reservations, handling the SeatUnavailableException.
-> Demonstrate the use of reserveSeatUnchecked for valid and invalid seat reservations, handling both InvalidReservationException and SeatUnavailableException.
-> Ensure that the program provides clear error messages and handles exceptions appropriately.

*/