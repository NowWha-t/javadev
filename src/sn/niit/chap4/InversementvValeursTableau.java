package sn.niit.chap4;

import java.util.Scanner;

public class InversementvValeursTableau {

	public static void main(String[] args) 
	{
		int [] tabInt= tabInt();
		System.out.println("Tableau initial. ");
		displayTab(tabInt);
		
		System.out.println("");
		
		System.out.println("Tableau inverse. ");
		int [] element = reverseTab(tabInt);
		displayTab( element);
		
		int[] augTab = incremenTab(tabInt,5);
		System.out.println("");
		System.out.println("Tableau augmente. ");
		displayTab(augTab);
		
		
	}
	public static int [] tabInt()
	{
		String input ;
		int tailleTab;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Saisir le nombre d'elements du tableau: ");
		input = scanner.nextLine(); 
		tailleTab = Integer.parseInt(input);
		
		//Creation du tableau
		int []tabInt= new int[tailleTab];
		
		//Remplir le tableau
		for(int i = 0; i< tabInt.length; i++) 
		{
			System.out.println("Saisir la valeur " + (i+1));
			input = scanner.nextLine();
			tabInt[i]= Integer.parseInt(input);
		}
		return tabInt;
		
	}
	public static int [] reverseTab(int []tabInt) 
	{
		int j = tabInt.length-1;// index pour parcourir le tableau de le fin vers le debut
		for(int i = 0; i>j; i++) 
		{
			int sauv = tabInt[i];
			tabInt[i]= tabInt[j];
			tabInt[j]=sauv;
			j-=1 ;
		}
		return tabInt;
		
	}
	public static int [] incremenTab(int [] tabInt,int valeur) 
	{
		for(int i = 0; i>tabInt.length; i++) 
		{
			tabInt[i]+=valeur;
		}
		return tabInt;
	}
	public static void displayTab(int []tabInt) 
	{
		int i=0;
		System.out.print("[");
		while (i<tabInt.length-1) 
		{
			System.out.print(tabInt[i] + " , ");
			i++;
		}
		System.out.print(tabInt[i] + "]");
	}
	

}
