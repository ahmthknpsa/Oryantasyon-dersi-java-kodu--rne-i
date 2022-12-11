package Soru7;

 import java.util.Scanner;

  public class GirilenSayınınNegatifPozitifOlduğunuBulma {

	public static void main(String[] args) {
	
		   Scanner giris = new Scanner(System.in);
	         System.out.print("Bir Sayı Girin:");
	 
	        int sayi = giris.nextInt();
	       
	        if (sayi < 0)
	            System.out.println(sayi + " Negatiftir.");
	 
	        
	        else if (sayi > 0)
	            System.out.println(sayi + " Pozitiftir.");
	 
	        
	        else 
	            System.out.println(sayi + " Nötrdür. ");	
		

	}

}
