package sn.niit.chap5;

public class Personne 
{
    private static int nombreObjetsCrees = 0;
	private String prenom;
	private String nom;
	private String adresse;
	private String telephone;
	private String email;
	
	// Constructeur explicite sans parapetre
	public Personne() 
	{
		Personne.nombreObjetsCrees++;
	}
		
	// Constructeur explicite avec 2 parapetre
	public Personne(String prenom,String nom) 
	{
		this();
		this.prenom = prenom;
		this.nom = nom;
		
	}
	public Personne(String prenom,String nom, String adresse) 
	{
		this(prenom,nom); //appelle du constructeur avec 3 parametre
		
		this.adresse = adresse;
	}
	public Personne(String prenom,String nom, String adresse, String telephone, String email) 
	{
		this(prenom,nom,adresse);// appelle du constructeur avec 3 parametre
		
		this.telephone = telephone;
		this.email = email;
	}
	
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom; 
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getAdresse() 
	{
		return adresse;
	}
	public void setAdresse(String adaresse) 
	{
		this.adresse = adaresse;
	}
	
	public String getTelephone() 
	{
		return telephone;
	}
	public void setTelephone(String  telephone) {
		this.telephone = telephone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public static int getNombreObjetsCrees() 
	{
		return Personne.nombreObjetsCrees;
	}
	@Override
	public String toString() {
		return "Personne: " + prenom + "\nNom: " + nom + "\nadresse: " + adresse + "\nTelephone: " + telephone
				+ "\nemail: " + email ;
	}
	
	
}

