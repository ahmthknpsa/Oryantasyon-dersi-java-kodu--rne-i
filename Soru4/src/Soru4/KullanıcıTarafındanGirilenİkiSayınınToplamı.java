package Soru4;

import java.util.Scanner;

class KullanıcıTarafındanGirilenİkiSayınınToplamı {

	public static void main(String[] args) {
	
		 Scanner giris = new Scanner(System.in);
	       
	        System.out.print("Birinci Sayıyı Girin: ");         
	        int sayi1 = giris.nextInt();
	        System.out.print("İkinci Sayıyı Girin: ");   
	        int sayi2 = giris.nextInt();
	 
	        int toplam = sayi1 + sayi2;
	 
	        System.out.println("Sayıların Toplamı: " + toplam);	
	

	}

}
