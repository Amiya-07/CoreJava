package streamAPI_Day_2;

import java.util.*;
import java.util.stream.*;

public class UniqueInSetence {

	public static void main(String[] args) 
	{
		List<String> sentences = List.of("I am a good Boy","You are a girl","My name is Amiya");
		
		 Set<String> uniqueWords = sentences.stream()
		            .flatMap(sentence -> Arrays.stream(sentence.toLowerCase().split("\\s+")))
		            .collect(Collectors.toSet());
		 
		 System.out.println(uniqueWords);
		 
	}

}
