package collection_Day_5;

import java.util.ArrayList;
import java.util.Collections;

public class TestCustomer {

	public static void main(String[] args) 
	{
		ArrayList<Customer> al = new ArrayList<>();
		al.add(new Customer(12,"Amiya",12000.00d));
		al.add(new Customer(13,"Viswajeet",29000.00d));
		al.add(new Customer(14,"Gaurav",61000.00d));
		al.add(new Customer(15,"Mohan",120000.00d));
		
		
		System.out.println("Sorting By Names");
		Collections.sort(al,(p1,p2)-> p1.getCustomerName().compareTo(p2.getCustomerName()));
		al.forEach(System.out::println);
		
		System.out.println("Sorting By Id");
		Collections.sort(al,(p1,p2)-> p1.getCustomerNumber().compareTo(p2.getCustomerNumber()));
		al.forEach(System.out::println);
		
		System.out.println("Sorting By Bill");
		Collections.sort(al,(p1,p2)-> p1.getCustomerBill().compareTo(p2.getCustomerBill()));
		al.forEach(System.out::println);

	}

}
