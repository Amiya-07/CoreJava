package streamAPI_Day_2;

import java.util.*;

public class ConvertingStreamIntoList {

	public static void main(String[] args) 
	{
		List<Employee> l = Arrays.asList(new Employee(1, Arrays.asList("Amiya","Vishwajeet")), new Employee(2,Arrays.asList("Gaurav","Abhisek")));
		
		List<String> l2 = l.stream().flatMap(p -> p.getL().stream()).toList();
		
		System.out.println(l2);
	}

}

class Employee
{
	Integer eId;
	List<String> l;
	
	public Employee(Integer i, List<String> l)
	{
		super();
		this.eId = i;
		this.l = l;
	}

	public Integer geteId() {
		return eId;
	}

	public void seteId(Integer eId) {
		this.eId = eId;
	}

	public List<String> getL() {
		return l;
	}

	public void setL(List<String> l) {
		this.l = l;
	}

	@Override
	public String toString() {
		return "Employee [Employee Id=" + eId + ", list of Employee =" + l + "]";
	}
	
	
	
}
