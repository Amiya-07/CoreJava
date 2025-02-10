package collection_Day_4;

public class AirlineBookingServiceTester 
{
	public static void main(String[] args) {
		AirlineBookingService abs = new AirlineBookingService();
		
		AirlineCustomer ac1 = new AirlineCustomer(1,"Amiya Nayak","nayak@gmail.com","0987654321");
		AirlineCustomer ac2 = new AirlineCustomer(1,"Arup Nayak","nayak123@gmail.com","1234567890");
		AirlineCustomer ac3 = new AirlineCustomer(1,"Amiya Nayak","nayak@gmail.com","0987654321");
		
		abs.printBookingDetails(ac1);
		abs.printBookingDetails(ac2);
		abs.printBookingDetails(ac3);
		
	}
}
