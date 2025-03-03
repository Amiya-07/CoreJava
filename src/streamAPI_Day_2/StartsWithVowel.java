package streamAPI_Day_2;

import java.util.*;
import java.util.stream.Stream;

public class StartsWithVowel {

	public static void main(String[] args) 
	{
		List<String> l = new ArrayList<>();
		l.add("Amiya");
		l.add("Viswajeet");
		l.add("Gaurav");
		
		Stream<String> stream = l.stream();
		
		stream.filter(q -> (q.toLowerCase().startsWith("a") ||q.toLowerCase().startsWith("e")||q.toLowerCase().startsWith("i")||q.toLowerCase().startsWith("o")||q.toLowerCase().startsWith("u")) && q.length()>3).forEach(System.out::println);
			
	}

}
