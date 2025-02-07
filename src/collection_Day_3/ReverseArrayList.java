package collection_Day_3;

import java.util.ArrayList;

public class ReverseArrayList
{
	public static void main(String[] args) 
	{
		ArrayList<Integer> al = new ArrayList<>();
		
		for(int i=0;i<=10;i++)
		{
			al.add(i);
		}
		
		System.out.println(al.reversed());
	}
}
