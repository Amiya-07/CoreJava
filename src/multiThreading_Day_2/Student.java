package multiThreading_Day_2;

public class Student extends Thread
{
	String studentName;
	EducationInstitute institute;
	
	public Student(String studentName, EducationInstitute institute)
	{
		super();
		this.studentName = studentName;
		this.institute = institute;
	}
	
	
	public  void  viewCoursesAndFees()
	{
		System.out.println("=============COURSES=============");
		Course []courses = institute.getCourses();
		for(Course c1 : courses)
		{
			System.out.println(c1.toString());
		}
		
	}
	
	public  void viewOffers()
	{
		System.out.println("Offers : ");
		Offer []offers = institute.getOffers();
		for(Offer o : offers)
		{
			System.out.println(o.toString());
		}
		
	}
	
	public void enrollInCourse(int courseId)
	{
		institute.enrollStudentInCourse(courseId, studentName);
	}
}
