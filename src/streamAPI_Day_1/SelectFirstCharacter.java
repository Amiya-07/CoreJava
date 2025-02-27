package streamAPI_Day_1;

import java.util.Arrays;
import java.util.stream.*;
public class SelectFirstCharacter 
{

	public static void main(String[] args) 
	{
		String [] s = {"Amiya","Viswa","Gaurav","Abhisek","Pratyush","Ritik"};
		Stream<String> st = Arrays.stream(s);
				
		st.filter(a -> a.contains("a") || a.contains("A")).forEach(System.out::println);
	}

}
