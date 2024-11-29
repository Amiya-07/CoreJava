package OOPS_Inheritance_Day13;
import java.util.Scanner;

public class TestShape {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		ShapeCalculator sp = new ShapeCalculator();
		
		while(true)
		{
			System.out.println("1.Square\n2.Rectangle\n3.Circle\n4.Exit");
			int choice = sc.nextInt();
			
			if(choice==1)
			{
				System.out.println("Enter side of Square");
				int side = sc.nextInt();
				System.out.println("Area of Square : "+sp.calculateArea(side));
			}
			else if(choice==2)
			{
				System.out.println("Enter length of Rectangle");
				int length = sc.nextInt();
				System.out.println("Enter width of Rectangle");
				int width = sc.nextInt();
				System.out.println("Area of Rectangle : "+sp.calculateArea(length,width));
			}
			else if (choice==3)
			{
				System.out.println("Enter radius of Circle");
				double radius = sc.nextDouble();
				System.out.println("Area of Circle : "+sp.calculateArea(radius));
			}
			
			else if(choice==3)
			{
				System.exit(0);
			}
			else
			{
				System.err.println("Invalid choice");
			}
		}
		
		
	}

}
