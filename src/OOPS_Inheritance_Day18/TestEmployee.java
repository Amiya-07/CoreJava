package OOPS_Inheritance_Day18;

public class TestEmployee {

	public static void main(String[] args) 
	{
		FullTimeEmployee f = new FullTimeEmployee(12,"Vishwajeet",10000.00,3000.00);
		f.generatePayroll();
		System.out.println("In-hand Salary of Employee : "+f.calculateSalary());
		
	}

}
