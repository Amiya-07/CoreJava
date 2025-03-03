package streamAPI_Day_2;

import java.util.*;
public class ConvertIntoList {

	public static void main(String[] args) 
	{
		List<String> l1 = new ArrayList<>();
		l1.add("Amiya");
		l1.add("Viswajeeet");
		l1.add("Gaurav");
		
		List<String> l2 = new ArrayList<>();
		l2.add("Abhisek");
		l2.add("Pratyush");
		
		
		List<List<String>> s = Arrays.asList(l1,l2);
		System.out.println(s);
		
		List<String> l = s.stream().flatMap(p -> p.stream()).toList();
		
		System.out.println(l);
		
	}

}
