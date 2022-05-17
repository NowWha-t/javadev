package documentHeritage;

public class Dictionnary extends Document
{
   private String language;
   
   public Dictionnary() 
   {
	   super();
   }
   public Dictionnary( int number, String title,String language) 
   {
	   super(number, title);
	   this.language = language;
   }
	public String getLanguage() {
		return language;
	}
	public void setLanguage(String language) {
		this.language = language;
	}
	@Override
	public String toString() {
		return super.toString() + " ,Dictionnary = " + language ;
	}
	
   
}
