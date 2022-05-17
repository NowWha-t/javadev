package documentHeritage;

public class Roman extends Book
{
   private String littPrice;
   
   public Roman() 
   {
	   super();
   }
   public Roman(int number, String title, String author, int pagesNbr ,String littPrice) 
   {
	   super( number,  title,  author, pagesNbr);
	   this.littPrice = littPrice;
   }
   
  
public String getLittPrice() {
	return littPrice;
}
public void setLittPrice(String littPrice) {
	this.littPrice = littPrice;
}
@Override
public String toString() {
	 return super.toString() + "  Roman  " + littPrice ;
}
   
}
