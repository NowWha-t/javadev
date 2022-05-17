package exoLivreHeritage;

public class Livre 
{
   protected String titre;
   protected String auteur;
   protected String proprietaire;
   protected int nombre_pages;
   double prix;
   
   public Livre(String t,String a,double p, int nb) 
   {
	   titre = t ;
	   auteur = a;
	   prix = p;
	   nombre_pages = nb;
	   proprietaire= "";
	   
	   
   }
   public void afficher() 
   {
	   System.out.println("Titre : " + titre) ; 
	   System.out.println("Auteur : " + auteur) ; 
	   System.out.println("Prix : " + prix) ; 
	   System.out.println("Nombre de pages : " +  nombre_pages);
	   
	   if ( this.Est_neuf() ) { 
		   System.out.println("Aucune proprietaire" ) ; 
		   } else { 
		   System.out.println("Proprietaire : "+proprietaire); 
		   } 
		   System.out.println() ; 
   }
   public boolean Est_neuf() 
   { 
	   if ( proprietaire =="" ) return true ; 
	   else return false ; 
   } 
   public void Acheter(String nom) 
   { 
	   proprietaire = nom ; 
   } 
   
}
