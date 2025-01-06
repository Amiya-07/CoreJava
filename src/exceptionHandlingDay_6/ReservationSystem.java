package exceptionHandlingDay_6;

public class ReservationSystem
{
	private int availableSeat;

	public ReservationSystem(int availableSeat)
	{
		super();
		this.availableSeat = availableSeat;
	}
	
	public void reserveSeat(int numberOfSeat) throws SeatUnavailableException
	{
		if(numberOfSeat>this.availableSeat)
		{
			throw new SeatUnavailableException("Seat Is not Available");
		} 
		else if(numberOfSeat<=0)
		{
			System.err.println("Invalid Input: requested seat number(s) is invalid");
		}
		else
		{
			this.availableSeat=this.availableSeat-numberOfSeat;
			System.out.println(numberOfSeat+" Ticket(s) Booked Successfully");
		}
	}
	
	public void reserveSeatUnchecked(int numberOfSeat) throws SeatUnavailableException
	{
		if(numberOfSeat>this.availableSeat)
		{
			throw new SeatUnavailableException("Seat Is not Available");
		} 
		if(this.availableSeat==0)
		{
			throw new InvalidReservationException("Insufficient Seats");
		}
		else if(numberOfSeat<=0)
		{
			System.err.println("Invalid Input: requested seat number(s) is invalid");
		}
		else
		{
			this.availableSeat=this.availableSeat-numberOfSeat;
			System.out.println(numberOfSeat+" Ticket(s) Booked Successfully");
		}
	}
}
/*

* ReservationSystem Class:

-> The class should have a private instance variable availableSeats representing the number of available seats.
-> Implement a constructor to initialize the initial number of available seats.
-> Implement a method reserveSeat(int numberOfSeats) that reserves seats, throwing SeatUnavailableException for unavailability
or insufficient seats.
-> Implement a method reserveSeatUnchecked(int numberOfSeats) that simulates reserving seats, throwing
 InvalidReservationException for no available seats and handling SeatUnavailableException for insufficient seats.

*/