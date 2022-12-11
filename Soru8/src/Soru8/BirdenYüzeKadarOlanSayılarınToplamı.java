package Soru8;

 public class BirdenYüzeKadarOlanSayılarınToplamı {

	public static void main(String[] args) {
		
		int sayi = 100;
        int toplam = 0;
 
        for(int i = 1; i <= sayi; ++i)
        {
            toplam = toplam + (i+1) ;
        }
 
        System.out.println("1-100 arasındaki sayıların toplamı = " + toplam);
	}

}
