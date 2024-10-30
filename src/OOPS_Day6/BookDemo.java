package OOPS_Day6;

import java.util.Scanner;

public class BookDemo {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter book title ");
		String title = sc.next();
		System.out.println("Enter book author name");
		String author = sc.next();
		System.out.println("Enter book price ");
		double price= sc.nextDouble();
		System.out.println("Enter discount percentage");
		double discount = sc.nextDouble();
		
		Book b = new Book(title, author, price);
		b.ApplyDiscount(discount);
		b.DisplayDetails();
		
		

	}

}
