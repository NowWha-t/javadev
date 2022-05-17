package exoLivreHeritage;

public class Bd extends Livre
{
   private boolean encouleur;
   
   public Bd(String t,String a,double p, int nb,boolean c) 
   {
	   super(t,a,p,nb);
	   encouleur= c;
   }
}
