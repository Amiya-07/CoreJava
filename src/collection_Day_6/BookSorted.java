package collection_Day_6;

import java.util.Iterator;
import java.util.TreeSet;

public class BookSorted {

	public static void main(String[] args) 
	{
		TreeSet<Book> ts = new TreeSet<>((p1,p2)-> p1.name().compareTo(p2.name()));
		ts.add(new Book("Atomic Habit","Charles"));
		ts.add(new Book("Mathmetics","R.D Sharma"));
		ts.add(new Book("Physics","H. C. Verma"));
		ts.add(new Book("Chemestry","Kalyani"));
		System.out.println("After Sorting the Record By Name in Ascending Order");
		ts.forEach(i -> System.out.println(i));
		
		System.out.println("\nAfter Sorting the Record By Name in Descending Order");
		Iterator<Book> itr = ts.descendingIterator();
		itr.forEachRemaining(i-> System.out.println(i));
		
	}

}
