package streamAPI_Day_1;

import java.util.Arrays;
import java.util.stream.Stream;

public class FindUnique {

	public static void main(String[] args) 
	{
		Integer [] a = {1,2,3,3,2,1,8};
		Stream<Integer> st  = Arrays.stream(a);
		st.distinct().forEach(p -> System.out.print(p+" "));
	}

}
