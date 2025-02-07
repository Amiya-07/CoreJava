package collection_Day_3;

import java.util.ArrayList;
import java.util.LinkedList;

public class ArrayListToLinkedList {

	public static void main(String[] args) 
	{
		ArrayList<Integer> al = new ArrayList<>();
		
		for(int i=0;i<=10;i++)
		{
			al.add(i);
		}
		
		LinkedList<Integer> l = new LinkedList<>(al);
		System.out.println(l);
		
		
	}

}
