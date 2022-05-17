package sn.niit.chap5;

public class TestPersonne {

	public static void main(String[] args) 
	{
		Personne personne = new Personne();
		personne.setPrenom("Amy");
		personne.setNom("Ndiaye");
		personne.setAdresse("HLM5");
		personne.setTelephone("78 442 85 69");
		personne.setEmail("AmyNdiaye@gmail.com");
		
		
		
		System.out.println(personne);
		
		// Appelle d'un constructeur avec 2 parametres
		Personne personne2 = new Personne("Jean", "Faye");
		
		
		// Appelle d'un constructeur avec 3 parametres
		Personne personne3 = new Personne("Yacine", "Faye" ,"Sicap foire");
		
		// Appelle d'un constructeur avec 5 parametres
		Personne personne4 = new Personne("Amy", "Diop" ,"Liberte 6", "78 442 8569 ","Fayeyacinee@gmail.com");
				
		
		//Affissage des donnees
		System.out.println(personne2);
		System.out.println("=============================================");
		System.out.println(personne3);
		System.out.println("=============================================");
		System.out.println(personne4);		
		System.out.println("Nombre d'objet cree " + Personne.getNombreObjetsCrees());

		
    }

}
