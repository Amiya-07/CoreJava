package collection_Day_11;

import java.io.*;
import java.util.ArrayList;

public class RetrieveStudentObject {

	public static void main(String[] args) throws IOException, ClassNotFoundException 
	{
		var fin = new FileInputStream("D:\\new\\Student.txt");
		var ois = new ObjectInputStream(fin);
		
		try
		{
			 ArrayList<Student> al = null;
			 
			 while((al = (ArrayList)ois.readObject()) !=null)
			 {
				 for(Student s : al)
				 {
					 System.out.println(s);
				 }
			 }	
		}
		catch(java.io.EOFException e)
		{
			System.err.println("End of file is reached.........");
			
		}
	}

}
