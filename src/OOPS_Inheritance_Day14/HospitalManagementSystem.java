package OOPS_Inheritance_Day14;

public class HospitalManagementSystem {

	public static void main(String[] args) 
	{
		HospitalStaff staff1 = new Doctor("Amiya",24,"Doctor","Cardiology");
		
		staff1.work();
		
		HospitalStaff staff2 = new Nurse("Chandini",24,"Nurse",3);
		staff2.work();
	}

}
