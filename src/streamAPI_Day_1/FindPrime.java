package streamAPI_Day_1;

import java.util.stream.*;
import java.util.Arrays;

public class FindPrime {

	public static void main(String[] args) 
	{
		Integer [] a = {1,2,3,4,5,6,7,8};
		Stream<Integer> st  = Arrays.stream(a);
		st.filter(q ->
		{
			int c=0;
			for(int i=1;i<=q/2;i++)
			{
				if(q%i==0)
				{
					c++;
				}
			}
			if (c==1)
			{
				return true;
			}
			return false;
		}).forEach(System.out::println);
	}

}
