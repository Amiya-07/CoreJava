package Day_4;

public class CalculateYear {

	public static void main(String[] args) 
	{
		int t=Integer.parseInt(args[0]);
		int year= t/365;
		int  month= (t%365)/30;
		int day = (t%365)%30;
		System.out.println(year+"Year(s) "+month+"month(s) "+day+"day(s) ");
	}

}
