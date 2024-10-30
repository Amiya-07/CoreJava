package OOPS_Day3;

public class Student_Demo {

	public static void main(String[] args)
	{
		Student t = new Student();
		t.setStudentData();
		t.calculateGrade();
		System.out.println(t.displayDetails());
	}

}
