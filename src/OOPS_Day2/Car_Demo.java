package OOPS_Day2;
import java.util.Scanner;

public class Car_Demo {

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		Car c = new Car();
		System.out.print("Enter car company name ");
		String cname = sc.next();
		System.out.println("Enter car model name ");
		String mname = sc.next();
		System.out.print("Enter car price");
		double price = sc.nextDouble();
		c.getDetails(cname,mname,price);
		c.showDetails();
	}

}
