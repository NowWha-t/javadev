package sn.niit.chap5.facture;

public class TestCommande {

	public static void main(String[] args) 
	{
		Produit prod1= new Produit();
		prod1.setId(12);
		prod1.setNom("Telehone portable");
		prod1.setPrix(250000);
		prod1.setDescription(" Ecran tactile,mémoire 250 GO,état batterie 100%");
		prod1.setStock(10);
		
		
		Client client1= new Client( 10, "Faye", "Yacine", "Sicap Foire","Dakar","78 442 85 69","13158","fayeyacine@gmail.com");
		
		System.out.println(prod1);
		System.out.println(client1);
		
		
	}

}
