package streamAPI_Day_2;

import java.util.stream.IntStream;
import java.util.stream.Stream;

public class FirstNNumberOfOddSquare {

	public static void main(String[] args) 
	{
		IntStream.generate(() -> (int)(Math.random()*100)).filter(x->x*x%2!=0).distinct().limit(10).forEach(System.out::println);
	}

}
