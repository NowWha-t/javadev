package documentHeritage;

import java.util.ArrayList;

	public class Library 
	{
		ArrayList<Document> listDoc;
	   
	   public  Library () 
	   {
		   listDoc = new ArrayList<Document>();
	   }
	   
	   
	   public ArrayList<Document> getListDoc() {
		return listDoc;
	}
	
	
	public void setListDoc(ArrayList<Document> listDoc) {
		this.listDoc = listDoc;
	}
	public void addDocument(Document document) 
	{
		listDoc.add(document);
	}
	
	public void displayDocument() 
	{
		   System.out.println("List of the document");
		   
		   for (Document document: listDoc) 
		   {
			   System.out.println(document.getTitle());
		   }
		   
	}
	public void searchDucument(Document document ) 
	{
		for( int j = 0; j<listDoc.size() ; j++) 
		{
			if (document==listDoc.get(j)) 
			{
				System.out.println("\n");
				System.out.println("The document '" + document.getTitle() + "'" + " is the " +j+ "th of the list.");
		    }
		}
		
	}
	public boolean deleteDocument(Document document) 
	{
		 if (document.getTitle().equals(document.getTitle())) return true;
		 else return false;
	}
	
}
