package sn.niit.chap5.facture;

public class LigneFacture 
{
  private int id;
  private Produit produit;
  private int quantite;
  private double prixTotal;
  
  public LigneFacture() 
  {
	  this.id= id;
	  this.produit= produit;
	  this.quantite= quantite;
	  this.prixTotal=prixTotal;
	  
  }

public int getId() {
	return id;
}

public void setId(int id) {
	this.id = id;
}

public Produit getProduit() {
	return produit;
}

public void setProduit(Produit produit) {
	this.produit = produit;
}

public int getQuantite() {
	return quantite;
}

public void setQuantite(int quantite) {
	this.quantite = quantite;
}

public double getpTotal() {
	return prixTotal;
}

public void setpTotal(double pTotal) {
	this.prixTotal = pTotal;
}

@Override
public String toString() {
	return "LigneFacture [id=" + id + ", produit=" + produit + ", quantite=" + quantite + ", pTotal=" + prixTotal + "]";
}
  
  
}
