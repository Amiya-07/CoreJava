package collection_Day_8;

import java.util.*;

public class HospitalService 
{
	static int hospitalcode=101;
	ArrayList<Hospital> al = new ArrayList<>();
	HashMap<Integer, Hospital> hs = new HashMap<>();
	public int addHospital(Hospital h)
	{
		h.setHospitalCode(HospitalService.hospitalcode++);
		al.add(h);
		getHospitals(h);
		return h.getHospitalCode();
	}
	
	public void getHospitals(Hospital h)
	{
		hs.put(h.getHospitalCode(), h);
	}
	
	public void  getHospitalDetails(int code)
	{
		Hospital h = hs.get(code);
		 System.out.println(h.toString());
	}
}

