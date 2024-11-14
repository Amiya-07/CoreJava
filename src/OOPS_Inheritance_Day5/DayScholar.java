package OOPS_Inheritance_Day5;

public class DayScholar extends Student
{
	double transportFee;

	public DayScholar(int studentId, String name, double examFee, double transportFee) 
	{
		super(studentId, name, examFee);
		this.transportFee = transportFee;
	}

	@Override
	public String toString() {
		return "DayScholar [transportFee=" + transportFee + " Student [studentId=" + studentId + ", name=" + name + ", examFee=" + examFee + "]";
	}
	public double payFee(double amount)
	{
		double totalFee = examFee+transportFee;
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
DayScholar:
-----------

Instance Variables : transportFee:double ,

Methods: Define parameterized constructor 
*/
