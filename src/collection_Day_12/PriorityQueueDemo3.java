package collection_Day_12;


import java.util.*;
public class PriorityQueueDemo3 
{
	public static void main(String[] args) {
		PriorityQueue<String> ele1 = new PriorityQueue<>();
		ele1.add("1");
		ele1.add("2");
		ele1.add("6");
		ele1.add("3");
		
		PriorityQueue<String> ele2 = new PriorityQueue<>();
		ele2.add("1");
		ele2.add("4");
		ele2.add("5");
		ele2.add("6");
		
		for(String s : ele1)
		{
			if(ele2.contains(s))
				System.out.println("Yes");
			else
				System.out.println("No");
		}
		
	}
}
