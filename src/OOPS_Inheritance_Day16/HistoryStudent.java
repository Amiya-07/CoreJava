package OOPS_Inheritance_Day16;

public class HistoryStudent extends Student
{
	private int historyMarks;
	private int civicsMarks;
	
	public HistoryStudent(String studentName, String studentClass, int historyMarks, int civicsMarks)
	{
		super(studentName, studentClass);
		this.civicsMarks = civicsMarks;
		this.historyMarks = historyMarks;
		Student.totalNoOfStudents++;
	}
	
	@Override
	public int getPercentage()
	{
		int percentage = (this.civicsMarks+this.historyMarks)/2;
		return percentage;
	}
}
/*
Create a class HistoryStudent that inherits from Student. 
Add the following attributes.
Instance variables: 
historyMarks: private int
civicsMarks: private int (Max Marks for a subject : 100)
Method:
Override getPercentage() method to computed and return the percentage of marks(Max marks for a subject :100)
*/
