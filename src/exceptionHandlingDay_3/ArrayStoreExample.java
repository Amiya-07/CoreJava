package exceptionHandlingDay_3;

public class ArrayStoreExample {

	public static void main(String[] args)
	{
			storeObjects();
	}

	public static void storeObjects() 
	{
		Object a[] = new Object[4];
		
		 a[0]="Amiya";
		 a[1]=123;
		 a[2]=true;
         a[3]="World";
		try {
			for(Object object:a) {
				if(!(object instanceof String)) {
					throw new ArrayStoreException("Not a string type object");
				}
			}
			System.out.println("Object stored successfully");
		} catch(ArrayStoreException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
	     
	}
}
/*
Create a class named ArrayStoreExample:
3
Implement a static method storeObjects that:

method name : storeObjects
Access Modifiers : public
Non-Access Modifier : static
return type : void

Initializes an Object array of type String[] with a size of 5.
Attempts to store objects of different types (String, Integer, etc.) into the array using array indexing.
Throws an ArrayStoreException if an attempt is made to store an object that is not compatible with String.

Implement the main method:
Inside the main method, call the storeObjects method with different objects, including objects of incompatible types.
Use a try-catch block to catch and handle any ArrayStoreException thrown by storeObjects.
Print an appropriate error message when an incompatible object type is attempted to be stored in the array.
Test the program:
*/