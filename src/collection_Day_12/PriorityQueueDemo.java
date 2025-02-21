package collection_Day_12;

import java.util.Iterator;
import java.util.PriorityQueue;

public class PriorityQueueDemo 
{
	public static void main(String[] args) {
		PriorityQueue<String> colors = new PriorityQueue<>();
		colors.add("Red");
		colors.add("Green");
		colors.add("Orange");
		colors.add("White");
		colors.add("Black");
		
		//Direct Printing 
		System.out.println(colors);
		
		//Using For-Each
		System.out.println("\n\nUsing For-Each Loop");
		for(String s : colors)
		{
			System.out.print(s+" ");
		}
		
		// Using ForEach()
		System.out.println("\n\nUsing ForEach()");
		colors.forEach(a-> System.out.print(a+" "));
		
		//Using Iterator
		System.out.println("\n\nUsing Iterator");
		Iterator<String> itr = colors.iterator();
		while(itr.hasNext())
		{
			System.out.print(itr.next()+" ");
		}
		
		
	}
}
