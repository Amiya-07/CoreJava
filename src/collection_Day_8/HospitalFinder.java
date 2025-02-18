package collection_Day_8;

import java.util.*;

public class HospitalFinder {

	public static void main(String[] args) 
	{
		HospitalService hs = new HospitalService();
		List<String> l1 = new ArrayList<>();
		l1.add("Orthopedic");
		l1.add("Cardiology");
		l1.add("Neurology");
		
		Hospital jims1 =  new Hospital("JIMS", l1, "Viswajeet", "1234567890", "Pune");
		Hospital jims2 = new Hospital("JIMS",l1,"Gaurav","0987654321","Nasik");
		hs.addHospital(jims1);
		hs.getHospitalDetails(jims1.getHospitalCode());
		System.out.println("\n\n\n");
		hs.addHospital(jims2);
		hs.getHospitalDetails(jims2.getHospitalCode());
		
		
	}

}
