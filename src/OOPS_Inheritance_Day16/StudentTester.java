package OOPS_Inheritance_Day16;

public class StudentTester 
{

	public static void main(String[] args) 
	{
		Student.totalNoOfStudents=0;
		ScienceStudent amit = new ScienceStudent("Amit Sahoo","XII",90,89,98);
		System.out.println("Total Student : "+ScienceStudent.getTotalNoStudents());
		System.out.println("Science Student Percentage : "+amit.getPercentage()+"%");
		
		System.out.println("===============================================");
		HistoryStudent amiya = new HistoryStudent("Amiya Sahoo","XII",89,98);
		System.out.println("Total Student : "+HistoryStudent.getTotalNoStudents());
		System.out.println("History Student Percentage : "+amiya.getPercentage()+"%");

	}

}
