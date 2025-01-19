package multiThreading_Day_2;

public class Main {

	public static void main(String[] args) throws InterruptedException
	{
		Course []courses = {new Course(1,"Mathematic",1200),new Course(2,"Science",800),new Course(3,"English",600)};
		Offer []offer = {new Offer("Special discount: Get 20% off on all courses!"),new Offer("Limited time offer: Enroll in any two courses and get one course free!")};
		EducationInstitute ei = new EducationInstitute(courses,offer);
		
		Student Dhoni = new Student("Dhoni",ei);
		Thread t1 = new Thread(()->
				{
						Dhoni.viewCoursesAndFees();
						Dhoni.viewOffers();
						Dhoni.enrollInCourse(1);
				});
		
		Student Virat = new Student("Virat",ei);
		Thread t2 = new Thread(()->
			{
					Virat.viewCoursesAndFees();
					Virat.viewOffers();
					Virat.enrollInCourse(1);
				
			});
		
		t1.start();
		t1.join();
		System.out.println("==============Second student=============");
		t2.start();

	}

}
