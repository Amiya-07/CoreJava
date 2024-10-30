package OOPS_Day2;
import java.util.Scanner;
public class Product 
{
	String productName ;
	double productPrice ;
	int productId;
	public void setProductData()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter product id ");
		productId = sc.nextInt();
		System.out.println("Enter product Name ");
		productName = sc.next();
		System.out.println("Enter product Price ");
		productPrice = sc.nextDouble();
	}
	
	public void getProductInfo() 
	{
		System.out.println("Product id is "+productId);
		System.out.println("Product Name is "+productName);
		System.out.println("Product Price is "+productPrice);
	}
}
/*
Write a Program on OOPs to define Product class properties and behaviour.

properties :
productId : int
productName : String
productPrice : double

Initialize these properties with the help of Methods using Scanner class not by using Object reference.

behavior:
setProductData() : public void
getProductInfo() : public void
*/