package collection_Day_10;

import java.util.*;
public class IndentityHashMapDemo {

	public static void main(String[] args) 
	{
		HashMap<String,String> hm = new HashMap<>();
		hm.put("NIT", "Ameerpet");
		hm.put(new String("NIT"), "Hyderabad");
		System.out.println(hm.size());
		System.out.println(hm);
		
		System.out.println("======================");
		
		IdentityHashMap<String,String> ihm = new IdentityHashMap<>();
		ihm.put("NIT", "Bhadrak");
		ihm.put(new String("NIT"), "Odisha");
		System.out.println(ihm.size());
		System.out.println(ihm);
	}

}
