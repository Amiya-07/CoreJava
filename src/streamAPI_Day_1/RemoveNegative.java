package streamAPI_Day_1;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class RemoveNegative {

	public static void main(String[] args) 
	{
		Integer [] a = {1,2,3,4,5,-2,-1,-2};
		Stream<Integer> st = Arrays.stream(a);
		
		st.filter(q -> q>0).forEach(System.out::println);

	}

}
