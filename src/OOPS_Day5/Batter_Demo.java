package OOPS_Day5;

import java.util.Scanner;

public class Batter_Demo {

	public static void main(String[] args)
	{
		Batter b = new Batter();
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter batter name ");
		String name = sc.nextLine();
		System.out.println("Enter match played by batter ");
		int match= sc.nextInt();
		System.out.println("Enter run scored by batter ");
		int run = sc.nextInt();
		b.batterDetails(name,run,match );
		while(true)
		{
			System.out.println("Enter choice\n1.batter statistics\n2.batter Average\n3.Exit");
			int choice =sc.nextInt();
			switch(choice)
			{
			case 1:
				b.getStatistics();break;
			case 2:
				b.computeBattingAverage();break;
			case 3:
				System.exit(0);
			default:
				System.out.println("Invalid choice");
			}
		}
		
		
	}

}
