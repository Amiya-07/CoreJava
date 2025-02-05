package collection_Day_1;

public class CabCustomer 
{
	private int custId ;
	private String customerName;
	private String pickUpLocation;
	private String dropLocation;
	private int distance;
	private String phonenumber;
	
	public CabCustomer()
	{
		super();
	}
	
	
	public CabCustomer(int custId, String customerName, String pickUpLocation, String dropLocation, int distance,
			String phonenumber) {
		super();
		this.custId = custId;
		this.customerName = customerName;
		this.pickUpLocation = pickUpLocation;
		this.dropLocation = dropLocation;
		this.distance = distance;
		this.phonenumber = phonenumber;
	}


	public int getCustId() {
		return custId;
	}
	public void setCustId(int custId) {
		this.custId = custId;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public String getPickUpLocation() {
		return pickUpLocation;
	}
	public void setPickUpLocation(String pickUpLocation) {
		this.pickUpLocation = pickUpLocation;
	}
	public String getDropLocation() {
		return dropLocation;
	}
	public void setDropLocation(String dropLocation) {
		this.dropLocation = dropLocation;
	}
	public int getDistance() {
		return distance;
	}
	public void setDistance(int distance) {
		this.distance = distance;
	}
	public String getPhonenumber() {
		return phonenumber;
	}
	public void setPhonenumber(String phonenumber) {
		this.phonenumber = phonenumber;
	}


	@Override
	public String toString() {
		return "CabCustomer [custId=" + custId + ", customerName=" + customerName + ", pickUpLocation=" + pickUpLocation
				+ ", dropLocation=" + dropLocation + ", distance=" + distance + ", phonenumber=" + phonenumber + "]";
	}
	
	
	
	
}
