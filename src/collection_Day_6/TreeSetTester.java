package collection_Day_6;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetTester {

	public static void main(String[] args) 
	{
		
		TreeSet<Product> ts = new TreeSet<>((p1,p2)-> p1.pid().compareTo(p2.pid()));
		ts.add(new Product(1,"Camera"));
		ts.add(new Product(2,"Television"));
		ts.add(new Product(3,"PlayStation"));
		ts.add(new Product(0,"Mobile"));
		
		
		System.out.println("Sorting by ID in Ascending Order");
		  for(Product st : ts)
	       {
	    	   System.out.println(st);
	       }
		  
		 System.out.println("\nSorting by ID in Descending Order");
		 Iterator<Product> itr = ts.descendingIterator();
		 itr.forEachRemaining(i-> System.out.println(i));
		 
		  System.out.println("\nSorting By Name In Ascending Order");
		  TreeSet<Product> ts1 = new TreeSet<>((p1,p2)-> p1.pName().compareTo(p2.pName()));
			ts1.add(new Product(1,"Camera"));
			ts1.add(new Product(2,"Television"));
			ts1.add(new Product(3,"PlayStation"));
			ts1.add(new Product(8,"Mobile"));
			
		  for(Product st : ts1)
	       {
	    	   System.out.println(st);
	       }
		  
		  System.out.println("\nSorting by Name in Descending Order");
		  System.out.println("Sorting by ID in Descending Order");
		 Iterator<Product> itr2 = ts1.descendingIterator();
		 itr2.forEachRemaining(i-> System.out.println(i));
	}

}
