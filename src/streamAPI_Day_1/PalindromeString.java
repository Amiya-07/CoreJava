package streamAPI_Day_1;

import java.util.Arrays;
import java.util.stream.*;
public class PalindromeString 
{
	public static void main(String[] args) 
	{
		String [] s = {"Amiya","Viswa","Gaurav","Abhisek","Pratyush","Ritik","ama"};
		Stream<String> st = Arrays.stream(s);
		st.filter(q ->
		{
			StringBuffer sb = new StringBuffer();
			sb.append(q);
			if(sb.reverse().equals(q))
			{
				return true;
			}
			return false;
		}).forEach(System.out::println);
	}
}
