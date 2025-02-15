package collection_Day_7;

import java.util.*;

public class FruitInventoryManagement 
{
	public static void main(String[] args) 
	{
		HashMap<String,Integer> fruits = new HashMap<>();
		
		fruits.put("Apple",50);
		fruits.put("Banana",30);
		fruits.put("Orange",20);
		
		System.out.println("Is This hashMap Empty : "+fruits.isEmpty());
		System.out.println("Total Number of element in HashMap are : "+fruits.size());
		Integer s = fruits.get("Apple");
		System.out.println("Quantity for Apple : "+s);
		
		Integer q1 = fruits.get("Banana");
		System.out.println("Quantity for Banana : "+q1);
		
		System.out.println("Orange is Present ? "+fruits.containsKey("Orange"));
		System.out.println("Orange is Present ? "+fruits.containsKey("Mango"));
		
		System.out.println("20 is present as value ?"+fruits.containsValue(20));
		System.out.println("40 is present as value ?"+fruits.containsValue(40));
		
		HashMap<String,Integer> exoticFruits = new HashMap<>();
		exoticFruits.put("Avacado",230);
		exoticFruits.put("Dragon fruit",180);
		exoticFruits.put("Kiwi",140);
		
		fruits.putAll(exoticFruits);
		System.out.println(fruits);
		
	}
}
