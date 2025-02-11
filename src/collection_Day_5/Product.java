package collection_Day_5;

public class Product implements Comparable<Product>
{
	
	private Integer productId;
	private String productName;
	private  Double productPrice;
	
	
	public Product(Integer productId, String productName, Double productPrice) {
		super();
		this.productId = productId;
		this.productName = productName;
		this.productPrice = productPrice;
	}


	@Override
	public int compareTo(Product p) 
	{
		
		return this.productName.compareTo(p.productName) ;
	}


	@Override
	public String toString() {
		return "Product [productId=" + productId + ", productName=" + productName + ", productPrice=" + productPrice
				+ "]";
	}
	
	
}
