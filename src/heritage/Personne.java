package heritage;

public class Personne 
{
  private String firstName; 
  private String lastName;
  private String profession;
  
  public Personne() {}
  
  public Personne(String firstName, String lastName, String profession) 
  {
	  this.firstName = firstName;
	  this.lastName =lastName;
	  this.profession = profession;
  }

public String getFirstName() 
{
	return firstName;
}

public void setFirstName(String firstName) 
{
	this.firstName = firstName;
}

public String getLastName() 
{
	return lastName;
}

public void setLastName(String lastName) 
{
	this.lastName = lastName;
}

public String getProfession() 
{
	return profession;
}

public void setProfession(String profession) 
{
	this.profession = profession;
}
  public void learn() 
  {
	  System.out.println("I can learn");
  }
  public void walk() 
  {
	  System.out.println("I can walk");
  }
  public void eat() 
  {
	  System.out.println("I can eat");
  }

@Override
public String toString() {
	return " firstName = " + firstName + ", lastName= " + lastName + ", profession= " + profession ;
}
  
  
}

