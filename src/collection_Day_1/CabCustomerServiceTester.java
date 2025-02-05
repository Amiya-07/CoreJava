package collection_Day_1;

public class CabCustomerServiceTester 
{
	public static void main(String[] args) {
		
		CabCustomerService cs1 = new CabCustomerService();
		CabCustomer c1 = new CabCustomer(1,"Amiya","Ameerpet","Hi-Tech",8,"6371141732");
		CabCustomer c2 = new CabCustomer(2,"viswajeet","Ameerpet","Hi-Tech",8,"123456788");
		CabCustomer c3 = new CabCustomer(3,"Abhisek","Ameerpet","Hi-Tech",8,"1123456789");
		
		CabCustomer c4 = new CabCustomer(1,"Amiya","Ameerpet","Hi-Tech",8,"6371141732");
		
		
		
		System.out.println(c1.getCustomerName()+" Is Existing Costumer ? "+cs1.isFirstCustomer(c1));
		
		System.out.println(c1.toString());
		cs1.printBill(c1);
		System.out.println("\n===========================================================================");
		
		System.out.println(c2.getCustomerName()+" Is Existing Costumer ? "+cs1.isFirstCustomer(c2));
		
		System.out.println(c2.toString());
		cs1.printBill(c2);
		System.out.println("\n===========================================================================");
		
		System.out.println(c4.getCustomerName()+" Is Existing Costumer ? "+cs1.isFirstCustomer(c4));
		
		System.out.println(c4.toString());
		cs1.printBill(c4);
		System.out.println("\n===========================================================================");
	}
}
