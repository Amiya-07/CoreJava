package collection_Day_6;

public record Product(Integer pid, String pName) 
{
	public Product
	{
		if(pid<=0)
		{
			throw new IllegalArgumentException();
		}
	}
}
