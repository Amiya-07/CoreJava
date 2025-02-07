package collection_Day_3;

import java.util.ArrayList;

public class RemoveElementArrayFromList {

	public static void main(String[] args) 
	{
		ArrayList<Integer> al = new ArrayList<>();
		
		for(int i=10;i<=20;i++)
		{
			al.add(i);
		}
		
		al.remove(6);
		al.remove(Integer.valueOf(13));
		
		System.out.println(al);

	}

}
