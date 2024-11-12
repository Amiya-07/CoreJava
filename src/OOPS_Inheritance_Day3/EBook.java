package OOPS_Inheritance_Day3;

public class EBook extends Book 
{
	String fileFormat;

	public EBook(String title, String author, String fileFormat) {
		super(title, author);
		this.fileFormat = fileFormat;
	}
	
	public void displayEbookInfo()
	{
		displayBookInfo();
		System.out.println("The file format is : "+this.fileFormat);
	}
}
/*
 * Ebook (Derived Class, inherits from Book):

Additional Attribute:
fileFormat (String): File format of the ebook (e.g., PDF, EPUB).
Additional Method:
displayEbookInfo(): This method should call displayBookInfo() from the Book class to print the title and author, and then print the file format.
*/
