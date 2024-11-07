package OOPS_Inheritance_Day1;
import java.util.Scanner;

public class Test_Student {

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter student id");
		int id = sc.nextInt();
		System.out.println("Enter student name");
		String name = sc.next();
		System.out.println("Enter student mobile number");
		long mobile = sc.nextLong();
		System.out.println("Enter student placement batch or not");
		boolean batch = sc.nextBoolean();
		JobGuaranteeStudent j = new JobGuaranteeStudent(id,name,mobile,batch);
		j.displayStudentInfo();
	}

}
