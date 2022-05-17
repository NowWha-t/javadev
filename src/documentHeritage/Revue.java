package documentHeritage;

public class Revue extends Document
{
   private int month;
   private int year;
   
  public Revue() 
  {
	  super();
  }
  public Revue(int number, String title, int month,int year) 
  {
	  super(number,title);
	  this.month = month;
	  this.year = year;
  }
	public int getMonth() {
		return month;
	}
	public void setMonth(int month) {
		this.month = month;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	@Override
	public String toString() {
		return super.toString()+ " ,Revue = " + month + ", year = " + year ;
	}
	
  
}
