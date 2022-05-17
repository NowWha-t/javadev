package documentHeritage;

public class Document 
{
	private int number ;
	private String title;
	
	public Document() 
	{
		
	}
	public Document( int number , String title) 
	{
		this.number = number;
		this.title = title;
	}
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	@Override
	public String toString() {
		return " Document = " + number + ", title = " + title + "," ;
	}
	
	

}
