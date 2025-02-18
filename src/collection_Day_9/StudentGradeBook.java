package collection_Day_9;

import java.util.*;
import java.util.Map.Entry;

public class StudentGradeBook {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("*******USER MENU*******");
		HashMap<String,String> hs = new HashMap<>();
		while(true)
		{
			System.out.println("1.Add Student Grade\n2.Remove Student Grade\n3.Exit");
			int choice = sc.nextInt();
			
			
			switch(choice)
			{
				case 1:
					System.out.println("Enter Student Name");String name = sc.nextLine();name = sc.next();
					System.out.println("Enter Student Grade"); String grade = sc.next();
					String v = hs.put(name, grade);
					
					if(v==null)
					{
						System.out.println("Studentr Grade Stored successfully");
					}
					else
					{
						System.out.println("Student Grade Updated");
					}
					
					break;
				case 2:
					System.out.println("Enter Student Name");String name1 = sc.nextLine();name1 = sc.next();
					String v1 = hs.remove(name1);
					if(v1!=null)
					{
						System.out.println("Student Record Removed successfully");
						System.out.println("Current Stored records are");
						System.out.println(hs);
					}
					else
					{
						System.out.println("Student Record not found");
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
