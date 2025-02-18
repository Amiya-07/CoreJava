package collection_Day_9;

import java.util.*;
public class AddressBook {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		HashMap<String,String> hs = new HashMap<>();
		while(true)
		{
			System.out.println("**********USER MENU**********");
			System.out.println("1.Add Contact\n2.Remove Contact\n3.Exit");
			int choice = sc.nextInt();
			
			
			switch(choice)
			{
				case 1:
					System.out.println("Enter Contact Name");String name = sc.nextLine();name = sc.next();
					System.out.println("Enter Contact Number"); String number = sc.next();
					String v = hs.put(name, number);
					
					if(v==null)
					{
						System.out.println("Contact Details Stored successfully");
					}
					else
					{
						System.out.println("Contact Details Updated");
					}
					
					break;
				case 2:
					System.out.println("Enter Contact Name");String name1 = sc.nextLine();name1 = sc.next();
					String v1 = hs.remove(name1);
					if(v1!=null)
					{
						System.out.println("Contact Removed successfully");
						System.out.println("Current Stored records are");
						System.out.println(hs);
					}
					else
					{
						System.out.println("Contact Details not found");
					}
					break;
				case 3:
					System.out.println("Now you are Exiting");
					System.exit(0);
					break;
				default: 
					System.err.println("Invalid Input");
			}
		}
	}

}