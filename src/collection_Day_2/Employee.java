package collection_Day_2;
import java.sql.*;

public class Employee 
{
	private String name;
	private String desg;
	private double salary;
	public Employee(String name, String desg, double salary) {
		super();
		this.name = name;
		this.desg = desg;
		this.salary = salary;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDesg() {
		return desg;
	}
	public void setDesg(String desg) {
		this.desg = desg;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Employee [name=" + name + ", desg=" + desg + ", salary=" + salary + "]";
	}
	
	
	
	
}
