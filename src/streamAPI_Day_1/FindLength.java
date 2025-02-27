package streamAPI_Day_1;

import java.util.Arrays;
import java.util.stream.Stream;

public class FindLength {

	public static void main(String[] args) 
	{
		String [] s = {"Amiya","Viswa","Gaurav","Abhisek","Pratyush","Ritik","Ann"};
		Stream<String> st = Arrays.stream(s);
				
		st.filter(a -> a.length()>3).forEach(System.out::println);
	}

}
