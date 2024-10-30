package Day_3;

public class Salary {

	public static void main(String[] args)
	{
		double b = Integer.parseInt(args[0]);
		double hra = 0.15;
		double con = 0.15;
		double bea = 0.1;
		double ts = b+(b*hra)+(b*con)+(b*bea);
		System.out.println("Total salary is "+ts);
	}

}
