package exoLivreHeritage;

public class Album extends Livre
{
	boolean page_coloriee[]; 
	
	public Album(String t,String a, int nb,double p)
	{ 
		 super(t,a,p,nb) ; 
		 page_coloriee = new boolean[nb]; 
		 
		 for (int i=0 ; i<100 ; i++) 
		 page_coloriee[i] = false ; 
	 } 
	
	public void Colorie(int num_page)
	{ 
		 if((page_coloriee[num_page] == false) && !Est_neuf())
		 { 
		   page_coloriee[num_page] = true ; 
	     }    
		 else 
	     { 
		    System.out.println("page deja coloriee" ) ; 
	     } 
	 } 
}
