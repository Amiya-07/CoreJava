package collection_Day_11;

import java.util.*;
public class ListTester {

	public static void main(String[] args) 
	{
		DuplicatesInList d = new DuplicatesInList();
		List<Integer> l = new ArrayList<>(); 
		l.add(33);
		l.add(45);
		l.add(67);
		l.add(89);
		l.add(33);
		l.add(47);
		l.add(21);
		l.add(47);
		d.setList(l);
		
		List<Integer> list = d.getDuplicatesList();
		if(list!=null)
		{
			list.forEach(System.out::println);
		}
		else
		{
			System.out.println("null");
		}
	}

}
