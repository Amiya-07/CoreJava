package collection_Day_2;

public class TestEmployee {

	public static void main(String[] args) 
	{
		Employee e1 = new Employee("Alice","Manager",50000.0d);
		Employee e2 = new Employee("Bob","Developer",60000.0d);
		
		Directory d1 = new Directory();
		
		d1.addEmployee(e1);
		d1.addEmployee(e2);
		
		d1.displayAllEmployees();
		
		d1.updateEmployee(e2);
		
		d1.deleteEmployee(e1);
		d1.displayAllEmployees();
	}

}
