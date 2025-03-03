package streamAPI_Day_2;

import java.util.*;
import java.util.stream.Stream;

public class SortingStream {

	public static void main(String[] args) 
	{
		List<String> l = new ArrayList<>();
		l.add("Amiya");
		l.add("Viswajeet");
		l.add("Mohan");
		l.add("Gaurav");
		
		Stream<String> stream = l.stream();
		
		System.out.println("*****************LexicoGraphical Comparision*****************");
		stream.distinct().sorted((p1,p2)-> p1.compareTo(p2)).forEach(System.out::println);
		
		System.out.println("*****************Length Comparision (Descending Order)*****************");
		stream.distinct().sorted((p1,p2)-> Integer.compare(p2.length(),p1.length())).forEach(System.out::println);
		
	}

}
