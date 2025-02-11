package collection_Day_5;

import java.util.Comparator;

public class Customer implements Comparator<Customer>
{
	private Integer customerNumber;
	private String customerName;
	private Double customerBill;
	
	public Customer(Integer customerNumber, String customerName, Double customerBill) 
	{
		super();
		this.customerNumber = customerNumber;
		this.customerName = customerName;
		this.customerBill = customerBill;
	}

	@Override
	public int compare(Customer o1, Customer o2) {
		// TODO Auto-generated method stub
		return 0;
	}

	public Integer getCustomerNumber() {
		return customerNumber;
	}

	public String getCustomerName() {
		return customerName;
	}

	public Double getCustomerBill() {
		return customerBill;
	}

	@Override
	public String toString() {
		return "Customer [customerNumber=" + customerNumber + ", customerName=" + customerName + ", customerBill="
				+ customerBill + "]";
	}

	
	
}
