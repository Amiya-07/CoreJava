package collection_Day_11;

import java.io.Serializable;
import java.sql.Date;
import java.util.*;
public class Student implements Serializable 
{
	private Integer studentId;
	private String studentName;
	private Double studentFees;
	private Date dateOfAdmission;
	
	public Student(Integer studentId, String studentName, Double studentFees, Date dateOfAdmission) 
	{
		super();
		this.studentId = studentId;
		this.studentName = studentName;
		this.studentFees = studentFees;
		this.dateOfAdmission = dateOfAdmission;
	}
	
	public static Student getStudentRecord()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Student id ");
		Integer id = Integer.parseInt(sc.nextLine());
		System.out.println("Enter Student Name ");
		String name = sc.nextLine();
		System.out.println("Enter Student fees");
		Double fees = sc.nextDouble();
		System.out.println("Enter Student date of Admission(yyyy-mm-dd)\n");
		sc.nextLine();
		String date = sc.nextLine();
		Date d = Date.valueOf(date);
		return new Student(id,name,fees,d);
	}

	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", studentName=" + studentName + ", studentFees=" + studentFees
				+ ", dateOfAdmission=" + dateOfAdmission + "]";
	}
	
	
}
