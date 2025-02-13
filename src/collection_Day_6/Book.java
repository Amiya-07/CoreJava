package collection_Day_6;

public record Book(String name, String author) implements Comparable<Book>
{
	@Override
	public int compareTo(Book b) 
	{
		return this.name().compareTo(b.name());
	}

	@Override
	public String toString() {
		return "Book [name=" + name + ", author=" + author + "]";
	}

}
