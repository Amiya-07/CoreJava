package OOPS_Inheritance_Day5;

public class TestStudent {

	public static void main(String[] args)
	{
		Student s = new Student(12,"Amiya",25000.0);
		System.out.println(s.displayDetails());
		s.payFee(20000);
		System.out.println();
		DayScholar d = new DayScholar(11,"Brian Lara",20000,5000);
		System.out.println(d.displayDetails());
		d.payFee(20000);
		System.out.println();
		Hosteller h = new Hosteller(11,"Brian Lara",20000,5000);
		System.out.println(h.displayDetails());
		h.payFee(20000);
		
	}

}
