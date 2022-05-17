package documentHeritage;

public class Book extends Document
{
   private String author ;
   private int pagesNbr;
   
   public Book() 
   {
	   super();
   }
   
   public Book( int number, String title, String author, int pagesNbr)
   {
	   super(number, title);
	   this.author = author;
	   this.pagesNbr=  pagesNbr;
   }

	public String getAuthor() {
		return author;
	}
	
	public void setAuthor(String author) {
		this.author = author;
	}
	
	public int getPagesNbr() {
		return pagesNbr;
	}
	
	public void setPagesNbr(int pagesNbr) {
		this.pagesNbr = pagesNbr;
}

	@Override
	public String toString() {
		return super.toString() + " Book = " + author + ", pagesNbr = " + pagesNbr + "," ;
	}
   
}
