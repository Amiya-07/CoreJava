package collection_Day_4;

public class FoodOrderServiceTester {

	public static void main(String[] args) 
	{
		FoodOrderService fos = new FoodOrderService();
		
		FoodCustomer fc1 = new FoodCustomer(1,"Amiya","Ameerpet","1234567890");
		FoodCustomer fc2 = new FoodCustomer(2,"rahul","S R Nagar","0987654321");
		FoodCustomer fc3 = new FoodCustomer(1,"Amiya","Ameerpet","1234567890");
		
		
		fos.printBill(fc1);
		fos.printBill(fc2);
		fos.printBill(fc3);
	}

}
