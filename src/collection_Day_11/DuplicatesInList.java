package collection_Day_11;

import java.util.*;
import java.lang.*;

public class DuplicatesInList {

	private List<Integer> list ;

	public DuplicatesInList()
	{
		super();
	}
	
	public DuplicatesInList(List<Integer> l)
	{
		super();
		this.list = l;
	}
	
	public List<Integer> getList() {
		return list;
	}

	public void setList(List<Integer> l) {
		this.list = l;
	}
	
	public List<Integer> getDuplicatesList()
	{
		Iterator<Integer> list2 = list.iterator();
 		
		 List<Integer> list1 = new ArrayList<>();
		 Set<Integer> seen = new HashSet<>();
	        while (list2.hasNext()) 
	        {
	            int num = list2.next();
	            if (!seen.add(num)) 
	            {
	            	list1.add(num);
	            }
	        }
 		
	   
		if(list1.size()>0)
		{
			return list1;
		}
		return null;
	}
	
}