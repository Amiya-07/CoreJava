package multiThreading_Day_2;

public class EducationInstitute 
{
	Course []courses;
	Offer []offers;
	
	public EducationInstitute(Course[] courses, Offer[] offers) 
	{
		super();
		this.courses = courses;
		this.offers = offers;
	}

	public Course[] getCourses()
	
	{
		return courses;
	}

	public Offer[] getOffers() {
		return offers;
	}
	
	public synchronized void  enrollStudentInCourse(int courseId, String studentName)
	{
		boolean found =false;
		for(Course c : courses)
		{
			if(c.getCourseId()==courseId)
			{
				System.out.println(studentName+" is successfully enroll to Course : "+courseId);
				found=true;
			}
			
		}
		if(!(found))
		{
			System.out.println("request course not found");
		}
		
		
		
	}
	
}
