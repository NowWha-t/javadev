package documentHeritage;

import java.util.ArrayList;

public class TestDocument {

	public static void main(String[] args) 
			{
				Library library  = new Library();
				
				//creation des documents
				Roman roman = new Roman();
				roman.setNumber(01);
				roman.setTitle("Vie de Boy");
				roman.setAuthor("Ferdina Oyono");
				roman.setPagesNbr(230);
				roman.setLittPrice("");
				
				Roman roman1= new Roman (02,"Central Park","Guillaume Musso",396,"");
				Roman roman2 = new Roman (03,"How to win friends and Influence People","Dale Carnegie", 320,"");
				
				Manuel manuel = new Manuel();
				manuel.setNumber(04);
				manuel.setTitle("Java book");
				manuel.setAuthor("Mr Ba");
				manuel.setPagesNbr(459);
				manuel.setLevel(3);
				
				Manuel manuel1 = new Manuel(05,"Anglais ETLV ","Mike Smith",346,3);
				Manuel manuel2 = new Manuel(06,"Histoire du monde ","Alan Duchet",346,2);
				
				Dictionnary dictionnary = new Dictionnary(07,"Le Robert","frensh");
				Dictionnary dictionnary1 = new Dictionnary(10,"larousse","frensh");
				Dictionnary dictionnary2 = new Dictionnary(11,"Oxford","English");
				
				Revue revue = new Revue(17,"BI",9,2022);
				Revue revue1 = new Revue(18,"Comment finissent les dictateurs",11,2002);
				Revue revue2 = new Revue(18,"Revue Scientifique",05,1998);
				
			   
				//	Ajout de document a la liste
				
				library.addDocument(roman);
				library.addDocument(roman1);
				library.addDocument(roman1);
				library.addDocument(manuel);
				library.addDocument(manuel1);
				library.addDocument(manuel2);
				library.addDocument(dictionnary);
				library.addDocument(dictionnary1);
				library.addDocument(dictionnary2);
				library.addDocument(revue);
				library.addDocument(revue1);
				library.addDocument(revue2);
				
				//afficher les document
				  library.displayDocument();
				  
				  //rechercher un document
				  library.searchDucument(revue);
				  
				 //supprimer un document
				  library.deleteDocument(revue2);
				
				
				
			
		}
	}
