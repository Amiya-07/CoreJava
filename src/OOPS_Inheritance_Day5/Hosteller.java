package OOPS_Inheritance_Day5;

public class Hosteller extends Student 
{
	double hostelFee;

	public Hosteller(int studentId, String name, double examFee, double hostelFee)
	{
		super(studentId, name, examFee);
		this.hostelFee = hostelFee;
	}

	@Override
	public String toString() {
		return "Hosteller [hostelFee=" + hostelFee + ", studentId=" + studentId + ", name=" + name + ", examFee="
				+ examFee + "]";
	}
	
	public String displayDetails()
	{
		return toString();
	}
	public double payFee(double amount)
	{
		double totalFee = examFee+hostelFee;
	    if(totalFee-amount==0)
		{
			System.out.println("All fees are clear");
		}
		else
		{
			System.out.println(totalFee-amount+" rupees due to be paid ");
		}
		return amount;
	}
}
/*
Hosteller:
----------
Instance Variables: hostelFee :double

Methods: Define parameterized constructor 

Add the following methods in BOTH classes.

Method: displayDetails(): This method should return a string containing the details of the student

in the following format:

Student [name=John Smith,studentId=123,examFee=100.0] OR

DayScholar[transportFee=500, name=John Smith,studentId=123,examFee=100.0] and so on.

Method: payFee(amount): This method takes amount as parameter that represents the fee

provided. You must calculate and then return the remaining amount paid in excess. If excess is

paid, the returned amount will be negative. The total fees that each student must pay must

include all the fees applicable to that Student(examFees, transportFees, hostelFees as applicable).

Subtract the given amount from total fee for each student and return the remaining amount.
*/