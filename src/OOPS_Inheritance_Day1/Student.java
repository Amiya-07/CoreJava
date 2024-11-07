package OOPS_Inheritance_Day1;

public class Student 
{
	int studentId;
	String name;
	long mobile;
	
	public Student(int studentId, String name, long mobile) 
	{
		super();
		this.studentId = studentId;
		this.name = name;
		this.mobile = mobile;
	}
	
	public void display()
	{
		System.out.println("Student Id "+ studentId);
		System.out.println("Student name "+ name);
		System.out.println("Student mobile number  "+ mobile);
	}
	

}

class JobGuaranteeStudent extends Student
{
	
	boolean placementGuarantee;
	 
	 JobGuaranteeStudent (int studentId, String name, long mobile ,boolean placementGuarantee)
	{
		 super(studentId,name,mobile);
		this.placementGuarantee =placementGuarantee;
	}
	
	 public void displayStudentInfo()
	 {
		 display();
		 System.out.println("Is student in placement Guarantee batch : "+ placementGuarantee);
	 }
}

