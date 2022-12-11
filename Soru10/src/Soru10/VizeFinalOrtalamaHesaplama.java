package Soru10;

import java.util.Scanner;

public class VizeFinalOrtalamaHesaplama {

	public static void main(String[] args) {
		
		 Scanner giris = new Scanner(System.in);
	        int vizeNot,finalNot;
	        double ortalama;
	        String durum="";
	       
	        System.out.print("Vize Notunuzu Girin : ");
	        vizeNot = giris.nextInt();
	        System.out.print("Final Notunuzu Girin : ");
	        finalNot = giris.nextInt();
	       
	        ortalama = vizeNot*0.4+finalNot*0.6;
	       
	        if( ortalama >= 50 && finalNot >= 50 )
	            durum="Geçti";
	        
	        else
	            durum="Kaldı";
	        
	        System.out.println("Ortalama : " + ortalama);
	        
	        System.out.println("Durumunuz: " + durum);
		

	}

}
