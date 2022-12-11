package Soru2;

import java.util.Scanner;

class FaktöriyelHesaplama {

	public static void main(String[] args) {
	
	Scanner giris = new Scanner (System.in);
	
	System.out.print("Bir sayi giriniz: ");
	 int sayi = giris.nextInt();
	 int faktoriyel = 1 ;
	 
	 for(int i = 1; i <= sayi ; i++ )
	 faktoriyel = faktoriyel * i ;
	 
	 System.out.println("Sonuç : " + faktoriyel );
	 
	 }

}
