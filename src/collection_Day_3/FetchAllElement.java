package collection_Day_3;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.ListIterator;

public class FetchAllElement {

	public static void main(String[] args) 
	{
		ArrayList<Integer> al = new ArrayList<>();
		
		for(int i=0;i<=10;i++)
		{
			al.add(i);
		}
		
		ListIterator<Integer> i = al.listIterator();
		
		while(i.hasNext())
		{
			System.out.print(i.next()+" ");
		}
		System.out.println("\n");
		
		while(i.hasPrevious())
		{
			System.out.print(i.previous()+" ");
		}
		
		
	}

}
