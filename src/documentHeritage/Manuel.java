package documentHeritage;

public class Manuel extends Book
{
  private int level;
  
  public Manuel() 
  {
	  super();
  }
  
  public Manuel( int number, String title, String author, int pagesNbr,int level) 
  {
	  super(number,  title,  author, pagesNbr);
	  this.level = level;
  }
	
	public int getLevel() {
		return level;
	}
	
	public void setLevel(int level) {
		this.level = level;
	}
	
	@Override
	public String toString() {
		return super.toString() + " , Manuel = " + level ;
	}
  
}
