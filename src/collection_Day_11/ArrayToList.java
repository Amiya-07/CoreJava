package collection_Day_11;

import java.util.*;

public class ArrayToList {

	public static void main(String[] args) 
	{
		String [] s = {"Amiya","Vishwajeet","Gaurav"};
		List<String> atl = ArrayToList.arrayToList(s);
		
		atl.forEach(System.out::println);
	}
	
	public static List<String> arrayToList(String [] s)
	{
		List<String> l = Arrays.asList(s);
		
		return l;		
	}

}
