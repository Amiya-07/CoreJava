package OOPS_Inheritance_Day12;

public class TestEmployee {

	public static void main(String[] args)
	{
		Address address = new Address("Tihidi","Bhadrak","Odisha");
		
		Employee employee = new Employee(121,"Amiya",address);
		
		System.out.println(employee);
	}

}
