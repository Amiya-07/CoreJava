package collection_Day_12;

import java.util.*;
public class PriorityQueueDemo2 {

	public static void main(String[] args) 
	{
		PriorityQueue<String> colors1 = new PriorityQueue<>();
		colors1.add("Red");
		colors1.add("Green");
		colors1.add("Orange");
		
		System.out.println("Queue 1 : "+colors1);
		PriorityQueue<String> colors2 = new PriorityQueue<>();
		colors2.add("Pink");
		colors2.add("White");
		colors2.add("Black");
		System.out.println("Queue 2 : "+colors2);
		
		colors1.addAll(colors2);
		
		
		
		System.out.println("Merged Queue1 "+colors1);
	}

}
