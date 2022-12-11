package Soru9;

import java.util.Scanner;

 public class TekÇiftBulma {

	public static void main(String[] args) {
		
		 Scanner giris = new Scanner(System.in);
	    
		 System.out.print("Bir tane Tam Sayı Girin :");
	     
	     int sayi=giris.nextInt();
	         
	        if (sayi %2==0) 
	         System.out.println(sayi+" Sayısı Çift Sayıdır");
	             
	        else 
	         System.out.println(sayi+" Sayısı Tek Sayıdır");
	

	}

}
