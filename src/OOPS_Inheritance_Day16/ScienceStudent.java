package OOPS_Inheritance_Day16;

public class ScienceStudent extends Student
{
	private int physicsMarks;
	private int chemistryMarks;
	private int mathsMarks;
	
	public ScienceStudent(String studentName, String studentClass, int physicsMarks, int chemistryMarks, int mathsMarks)
	{
		super(studentName, studentClass);
		this.physicsMarks = physicsMarks;
		this.chemistryMarks = chemistryMarks;
		this.mathsMarks = mathsMarks;
		Student.totalNoOfStudents++;
		
	}
	
	@Override
	public int getPercentage()
	{
		int percentage = (this.chemistryMarks+this.chemistryMarks+this.physicsMarks)/3;
		return percentage;
	}
	
}
/*
Create a class ScienceStudent that inherits from Student. 
Add the following attributes
Instance variables:
physicsMarks: private int
chemistryMarks: private int
mathsMarks: private int
Methods:
Override, getPercentage() method to compute and return the percentage of marks(Max marks for a subject :100)
*/