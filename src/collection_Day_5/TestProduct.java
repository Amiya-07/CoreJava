package collection_Day_5;

import java.util.ArrayList;
import java.util.Collections;

public class TestProduct {

	public static void main(String[] args) 
	{
		ArrayList<Product> al = new ArrayList<>();
		al.add(new Product(12,"Camera",12000.00d));
		al.add(new Product(13,"Television",29000.00d));
		al.add(new Product(14,"SmartPhone",61000.00d));
		al.add(new Product(15,"Camera",120000.00d));
		
		Collections.sort(al);
		
		al.forEach(System.out::println);

	}

}
