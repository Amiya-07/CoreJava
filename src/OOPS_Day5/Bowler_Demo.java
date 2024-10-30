package OOPS_Day5;
import java.util.Scanner;
public class Bowler_Demo {

	public static void main(String[] args) 
	{
		Bowler b = new Bowler();
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter bowler name ");
		String name = sc.nextLine();
		System.out.println("Enter match played by bowler ");
		int match= sc.nextInt();
		System.out.println("Enter no of wickets taken by bowler ");
		int wicket = sc.nextInt();
		System.out.println("Enter ball bowled by bowler ");
		int bb = sc.nextInt();
		System.out.println("Enter run conceded by bowler ");
		int rc = sc.nextInt();
		b.bowlerDetails(name, wicket, match, bb,rc );
		while(true)
		{
			System.out.println("Enter choice\n1.bowler statistics\n2.Bowling Average\n3.strike rate\n4.Exit");
			int c =sc.nextInt();
			switch(c)
			{
			case 1:
				b.showStatistics();break;
			case 2:
				b.computeBowlingAverage();break;
			case 3:
				b.computeStrikeRate();break;
			case 4:
				System.exit(0);
			}
		}
		
		
	}

}
