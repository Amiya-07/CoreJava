package OOPS_Inheritance_Day19;
import java.util.Scanner;

public class testSim 
{

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		MobilePhone m = new MobilePhone();
		
		
		
		while(true)
		{
			System.out.println("Which sim you want :\n1.Jio\n2.Airtel\n3.BSNL");
			int choice = sc.nextInt();
			
			switch(choice)
			{
				case 1 : 
					SIMcardInterface s = new Jio();
					m.inserting(s);
					System.out.println("mobile number is : "+s.getPhoneNumber());
					System.out.println("Network Provider : "+s.getNetworkProvider());
					s.getSimStatus();
					m.makingCalls(s);
					m.sendingText(s);
					
					
					System.out.println("\nFor removing sim press 1 ");
					int choice2 = sc.nextInt();
					if(choice2==1)
					{
						m.removingSimcard(s);
					}
					
				case 2 : 
					SIMcardInterface s1 = new Airtel();
					System.out.println(s1.getNetworkProvider()+" sim card is inserting now");
					System.out.println("mobile number is : "+s1.getPhoneNumber());
					System.out.println("Network Provider : "+s1.getNetworkProvider());
					s1.getSimStatus();
					
					m.makingCalls(s1);
					m.sendingText(s1);
					
					
					
					System.out.println("\nFor removing sim press 1 ");
					int choice3 = sc.nextInt();
					if(choice3==1)
					{
						m.removingSimcard(s1);
					}
					
				case 3 : 
					SIMcardInterface s2 = new BSNL();
					System.out.println(s2.getNetworkProvider()+" sim card is inserting now");
					System.out.println("mobile number is : "+s2.getPhoneNumber());
					System.out.println("Network Provider : "+s2.getNetworkProvider());
					s2.getSimStatus();
					
					m.makingCalls(s2);
					m.sendingText(s2);
					
					
					
					System.out.println("\nFor removing sim press 1 ");
					int choice4 = sc.nextInt();
					if(choice4==1)
					{
						m.removingSimcard(s2);
					}
			}
		}
		
	}

}
