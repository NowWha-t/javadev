package heritage;

public class Programmer  extends Personne
{
   private String companyName;
   
   public Programmer() 
   {
	   super();
	   
   }
   
   public Programmer(String firstName, String lastName, String profession,String companyName) 
   {
	   super(firstName,  lastName,  profession);
	   this.companyName = companyName;
   }

public String getCompanyName() {
	return companyName;
}

public void setCompanyName(String companyName) {
	this.companyName = companyName;
}


  @Override public String toString() { return super.toString() +
  ",company Name= " + companyName + "."; }
 
   
   
}

