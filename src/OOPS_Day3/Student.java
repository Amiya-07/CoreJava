package OOPS_Day3;

public class Student 
{
	int studentId;
	String studentName;
	int studentMarks;
	char studentGrade;
	public void setStudentData()
	{
		studentId=123;
		studentName = "John Smith";
		studentMarks= 95;
	}
	public void calculateGrade()
	{
		if (studentMarks>90)
		{
			studentGrade = 'A';
		}
		else if (studentMarks<=90 && studentMarks >80)
		{
			studentGrade = 'B';
		}
		else if (studentMarks<=80 && studentMarks >70)
		{
			studentGrade = 'C';
		}
		else if (studentMarks<=70 && studentMarks >60)
		{
			studentGrade = 'D';
		}
		else 
		{
			studentGrade = 'E';
		}
	}
	public String displayDetails()
	{
		String student = "name="+studentName+", studentId= "+studentId+", marks= "+studentMarks+", grade= "+studentGrade;
		return student;
	}
}
/*
BLC (Business Logic Class) called Student is given to you.
Instance Variables: 
studentId :private-int
studentName : private-String
marks: private-int
grade: private-char

method : calculateGrade():public:void

Create a method public void setStudentData() with the parameters: studentId, studentName, marks.

Note that grade is not set through method because it is a calculated value.

Methods :
displayDetails(): This method should return a String with  the details of the student in the following format:
Student [name=John Smith, studentId=123, marks=95, grade=A] 

calculateGrade(): This is a public method that calculates the grade based on the marks that is set. 
If marks is above 90, grade is set to A. 
If marks is between 81 and 90, grade is set to B, 
if marks is between 71 and 80, grade is set to C, 
if marks is between 61 and 70, grade is set to D, 
if marks is less than 61, grade is set to E.
Use this method when you need to set or reset grade.
*/