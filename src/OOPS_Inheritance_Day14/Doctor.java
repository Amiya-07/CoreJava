package OOPS_Inheritance_Day14;

public class Doctor extends HospitalStaff
{
	private String specialization;

	public Doctor(String name, int age, String role, String specialization) 
	{
		super(name, age, role);
		this.specialization = specialization;
	}
	
	public void work()
	{
		System.out.println("Role : "+super.getRole()+" [ Name : "+super.getName()+" , Specialization : "+this.specialization+" ]");	
	}
	
	
}
/*
*create second class Doctor which will inherited with HospitalStaff

declare variable:
private String specialization;

 take one parameterized Constructor and initialize values

// Overriding work() method for doctors
it will print Roll and Name with this massage" with specialization in " + specialization + " is treating patient
s."
*/