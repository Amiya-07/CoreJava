package collection_Day_2;

import java.util.ArrayList;
import java.util.List;

public class Destination 
{
	private String name;
	private List<Activity> activities ;
	
	 public Destination(String name)
	 {
        this.name = name;
        this.activities = new ArrayList<>();
	 }
	 
	 
	 public void addActivity(Activity activity)
	 {
	        activities.add(activity);
	 }

	 public List<Activity> getActivities() 
	 {
	        return activities;
	 }



	@Override
	public String toString()
	{
		StringBuilder sb = new StringBuilder(name + "\n");
        for (Activity activity : activities) 
        {
            sb.append(" - ").append(activity).append("\n");
        }
       return sb.toString();
       
	}
		
		
	
}
