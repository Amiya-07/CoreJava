package OOPS_Day2;

public class Patient
{
	String patientName;
	String patientDisease;
	double patientBill;
	public void getPatientDetails(String name , String Disease , double bill)
	{
		patientName= name ;
		patientDisease= Disease;
		patientBill = bill;
	}
	public void showPatientDetails()
	{
		System.out.println("Patient name : "+patientName);
		System.out.println("Patient Disease : "+patientDisease);
		System.out.println("Patient total bill is : "+patientBill);
		
	}
}
