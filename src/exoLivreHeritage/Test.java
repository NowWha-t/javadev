package exoLivreHeritage;

public class Test {

	public static void main(String[] args) 
	{
		Livre l1 = new Livre("Le petit prince","St Exupéry",10.40, 50) ; 
				 Livre l2 = new Livre("Contes","Grimm",14.40,254) ; 
				 l1.afficher() ; 
				 l1.Acheter("moi") ; 
				 l1.afficher() ; 
				 l1.prix = 0.0 ; 
				 l2.Acheter("lui") ; 
				 l2.afficher(); 
				 
				 Bd b1 = new Bd("Lucky Luke","Morris",10.40, 45, true); 
				 Bd b2 = new Bd("Tintin","Herge",200.40, 45, false) ; 
				 b1.Acheter("moi"); 
				 b1.afficher() ; 
				 b2.afficher() ; 
				 
				 Album a1 = new Album("Dora","Dora", 300, 3.5) ; 
				 a1.afficher() ; 
				 a1.Colorie(23) ; 
				 a1.Acheter("moi"); 
				 a1.Colorie(23) ;

	}

}
