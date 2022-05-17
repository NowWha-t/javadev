package sn.niit.chap5.facture;

public class Client 
{
	private long id;
	private String nom;
	private String prenom;
	private String adresse;
	private String ville;
	private String telephone ;
	private String codePostal; 
	private String email;
	
	
	public Client() 
	{
		
		this.id= id;
		this.prenom = prenom;
		this.nom= nom;
		this.adresse = adresse; 
		this.email= email;
		this.ville = ville;
		this.codePostal = codePostal;
		this.telephone= telephone;
		
	}
	
	public Client( long id, String nom,String prenom, String adresse, String ville, String telephone, String codePostal,String email) 
	{
		this.id= id;
		this.nom= nom;
		this.prenom = prenom;
		this.adresse = adresse; 
		this.ville = ville;
		this.telephone= telephone;
		this.codePostal = codePostal;
		this.email= email;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public String getAdresse() {
		return adresse;
	}

	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}

	public String getVille() {
		return ville;
	}

	public void setVille(String ville) {
		this.ville = ville;
	}


	public String getTelephone() {
		return telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	public String getCodePostal() {
		return codePostal;
	}

	public void setCodePostal(String codePostal) {
		this.codePostal = codePostal;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "Client numero : "  + id + " \nPrenom " + prenom  + " \nNom: " + prenom + " \nAdresse: " + adresse + " \nVille: " + ville
				+ " \nTelephone: " + telephone + " \nCodePostal= " + codePostal + " \nEmail: " + email ;
	}

	 
	
	
	

}
