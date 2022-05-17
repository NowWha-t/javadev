package heritage;

public class Dancer extends Personne 
{
  private String groupName;
  
  public Dancer() 
  {
	  super();
	 
	  
  }
  public Dancer(String firstName, String lastName, String profession,String  groupName) 
  {
	  super( firstName,  lastName, profession);
	  this.groupName =groupName;
  }
	@Override
	public void eat()
	{
		System.out.println("I am a dancer and I can eat");
	}
	
	@Override
	public void walk()
	{
		System.out.println("I am a dancer and I can walk");
	}
	
	@Override
	public void learn()
	{
		System.out.println("I am a dancer and I can learn");
	}
	
	
	public String getGroupName() {
		return groupName;
	}
	public void setGroupName(String groupName) {
		this.groupName = groupName;
	}

  @Override public String toString() { return super.toString() + "G " +
  groupName + "."; }
  
  }
 
