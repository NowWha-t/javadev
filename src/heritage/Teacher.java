package heritage;

public class Teacher extends Personne
{
  private String schoolName;
  
  public Teacher() 
  {
	  super();
   }
  public Teacher(String firstName, String lastName, String profession,String  schoolName) 
  {
	  super( firstName, lastName, profession);
	  this.schoolName = schoolName;
  }
public String getSchoolName() {
	return schoolName;
}
public void setSchoolName(String schoolName) {
	this.schoolName = schoolName;
}
@Override
public String toString() {
	return super.toString()+ ",School Name " + schoolName + ".";
}
  
}
