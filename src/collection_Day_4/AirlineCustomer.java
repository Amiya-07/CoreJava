package collection_Day_4;

public class AirlineCustomer 
{
	private int costumerid;
	private String fullName;
	private String email;
	private String phoneNumber;
	
	public AirlineCustomer() {
		super();
		
	}
	
	public AirlineCustomer(int costumerid, String fullName, String email, String phoneNumber) {
		super();
		this.costumerid = costumerid;
		this.fullName = fullName;
		this.email = email;
		this.phoneNumber = phoneNumber;
	}

	public int getCostumerid() {
		return costumerid;
	}

	public void setCostumerid(int costumerid) {
		this.costumerid = costumerid;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	
	
	
	
}
