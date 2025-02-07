package collection_Day_3;

import java.util.ArrayList;
import java.util.Collection;

public class MergeCollection {

	public static void main(String[] args) 
	{
		Collection<String> fruit1 = new ArrayList<>();
		
		fruit1.add("Apple");
		fruit1.add("Orange");
		fruit1.add("Banana");
		
		Collection<String> fruit2 = new ArrayList<>();
		fruit2.add("Kiwi");
		fruit2.add("Dragon-Fruit");
		fruit2.add("Avacado");
		
		fruit1.addAll(fruit2);
		System.out.println(fruit1);
		
		
	}

}
