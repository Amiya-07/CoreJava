package collection_Day_11;

import java.io.*;
import java.util.*;

public class StoreObject {

	public static void main(String[] args) throws IOException 
	{
		Scanner sc = new Scanner(System.in);
		try
		{
			ArrayList<Student> al = new ArrayList<>();
			while(true)
			{
				System.out.println("*********MENU*********");
				System.out.println("1.Add student Object\n2.Store in file\n3.Exit");
				int choice = sc.nextInt();
				switch(choice)
				{
					case 1: 
						al.add(Student.getStudentRecord());
						System.out.println("Student Record inserted to ArrayList\n");
						break;
					case 2:
						var fout = new FileOutputStream("D:\\new\\Student.txt");
						var oos = new ObjectOutputStream(fout);
						oos.writeObject(al);
						System.out.println("Object Stored Successfully\n");
						break;
					case 3:
						System.out.println("You are exiting Now");
						System.exit(0);
					default :
						System.err.println("Invalid Input");
				}
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}


/*
 	Using Properties File
	String filePath = "D:\\new\\data.properties";		
		var writer = new FileWriter(filePath);
		var properties = new Properties();
		
		try(writer)
		{
			String object = Student.getStudentRecord().toString();
			properties.setProperty("1", object);
			properties.store(writer, "Student Object zset");
			System.out.println("Student record Successfully stored");
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
*/