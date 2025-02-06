package collection_Day_2;

import java.util.ArrayList;
import java.util.List;

public class ItineraryPlanner 
{
	
	 private List<Destination> destinations;

	    public ItineraryPlanner() {
	        destinations = new ArrayList<>();
	    }

	    public void addDestination(Destination destination) {
	        destinations.add(destination);
	    }

	    public List<Destination> getDestinations() {
	        return destinations;
	    }
}
