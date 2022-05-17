
package sn.niit.chap5.facture;

import java.util.Date;

public class Facture 
{
  private long id ;
  private String numero;
  private Date date;
  private double montantHorsTax;
  private double remise;
  private double montantTotalHorsTax;
  private double montantTva;
  private double montantTotalTtc;
  private static int  numeroFcture = 0;
  
  public Facture() 
  {   
	  Facture.numeroFcture++;
	  this.id = numeroFcture;
	  this.numero = numero;
	  this.date= date;
	  this.montantHorsTax = montantHorsTax;
	  this.remise= remise;
	  this.montantTotalHorsTax= montantTotalHorsTax;
	  this.montantTva = montantTva;
	 this.montantTotalTtc= montantTotalTtc;
  }
  
  public static double CalculMontantHorstax(double montantTva, int taux) 
  {
	  double result = montantTva*100/taux;
	  
	  return result;
  }
   
  public static double CalculMonatantTTC(double tva, double montantHorsTax  ) 
  { 
	 double result2 = tva + montantHorsTax;
	  return result2;
  }
  

public long getId() {
	return id;
}

public void setId(long id) {
	this.id = id;
}

public String getNumero() {
	return numero;
}

public void setNumero(String numero) {
	this.numero = numero;
}

public Date getDate() {
	return date;
}

public void setDate(Date date) {
	this.date = date;
}

public double getMontantHorsTax() {
	return montantHorsTax;
}

public void setMontantHorsTax(double montantHorsTax) {
	this.montantHorsTax = montantHorsTax;
}

public double getRemise() {
	return remise;
}

public void setRemise(double remise) {
	this.remise = remise;
}

public double getMontantTotalHorstax() {
	return montantTotalHorsTax;
}

public void setMontantTotalHoraTva(double montantTotalHoraTva) {
	this.montantTotalHorsTax = montantTotalHoraTva;
}

public double getMontantTva() {
	return montantTva;
}

public void setMontantTva(double montantTva) {
	this.montantTva = montantTva;
}

public double getMontantTotalTtc() {
	return montantTotalTtc;
}

public void setMontantTotalTtc(double montantTotalTtc) {
	this.montantTotalTtc = montantTotalTtc;
}

@Override
public String toString() {
	return "Facture [id=" + id + ", numero=" + numero + ", date=" + date + ", montantHorsTax=" + montantHorsTax
			+ ", remise=" + remise + ", montantTotalHoraTva=" + montantTotalHorsTax + ", montantTva=" + montantTva
			+ ", montantTotalTtc=" + montantTotalTtc + "]";
}
  
  
  
}
 
