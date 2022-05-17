package heritage;

public class TestPersonne {

	public static void main(String[] args) 
	{
		Dancer dancer = new Dancer();
		dancer.setFirstName("Modou");
		dancer.setLastName("Sall");
		dancer.setProfession("Dancer");
		dancer.setGroupName("The Rock");
		
		
		Programmer  programmer = new Programmer("Yacine", "Faye" ,"programmer","Sonatel");
		
		Teacher teacher = new Teacher("Mamadou", "Ba", "NIIT","Teacher");
		
		System.out.println(dancer);
		
		System.out.println("-----------------------------------------------------------------");
		System.out.println(programmer);
		dancer.eat();
		dancer.learn();
		dancer.walk();
		System.out.println("-----------------------------------------------------------------");
		System.out.println(teacher);
		dancer.eat();
		dancer.learn();
		dancer.walk();

}
}
