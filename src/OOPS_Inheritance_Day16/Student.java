package OOPS_Inheritance_Day16;

public abstract class Student 
{
	String studentName;
	String studentClass;
	protected static int totalNoOfStudents;

	public Student() {
		super();
	}
	
	public Student(String studentName, String studentClass) {
		this();
		this.studentName = studentName;
		this.studentClass = studentClass;
	}

	public abstract int getPercentage();
	
	public static int getTotalNoStudents( )
	{
		return totalNoOfStudents;
	}
	
}
/*
Create an abstract class Student with the following attributes.
Instance Variables: 
studentName: protected String
studentClass: protected String
totalNoOfStudents : protected static int
Instance Methods:
abstract public : getPercentage( ) with return type int 
static Method :
public static int getTotalNoStudents( )
Constructors:
No Argument constructor is a MUST.
Parameter constructor must initialize name and class and it also increase totalNoOfStudents.
*/