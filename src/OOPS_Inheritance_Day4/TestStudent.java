package OOPS_Inheritance_Day4;

public class TestStudent {

	public static void main(String[] args) 
	{
		
		ScienceStudent s = new ScienceStudent("Trishna",121,89,87,97);
		System.out.println("Science student details \n");
		s.displayDetails();
		System.out.println("The Science student percentage is : "+s.calculatePercentage());
		ArtsStudent a = new ArtsStudent("Sakhsi",122,76,53,91);
		System.out.println("\nArts student details \n");
		a.displayDetails();
		System.out.println("The Science student percentage is : "+a.calculatePercentage());
		
	}

}
/*
 * Create Test class
-----------------
-> create main method
-> in main method create ScienceStudent object and  ArtsStudent object.
-> print the details of both class by calling displayDetails() method.
-> print the percentage of ScienceStudent & ArtsStudent by calling calculatePercentage() methods.
*/
