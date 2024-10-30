package OOPS_Day2;
import java.util.Scanner;

public class Patient_demo {

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		Patient p = new Patient();
		System.out.print("Enter patient name ");
		String name = sc.next();
		System.out.print("Enter patient Disease ");
		String Disease = sc.next();
		System.out.print("Enter patient total bill ");
		double bill = sc.nextDouble();
		p.getPatientDetails(name, Disease, bill);
		p.showPatientDetails();
		
	}

}
