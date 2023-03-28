package com.muhammetkarakurt;

public class Main {

	public static void main(String[] args) {
		
		SporMerkeziUye kaan = new SporMerkeziUye(1, "Kaan Kaya", 71);
		
		kaan.sporYap("kosu", 10 );
		kaan.sporYap("mekik", 2);
		kaan.sporYap("ipatlama", 30);
		kaan.sporYap("kosu", 30 );
		
		
		System.out.println("Toplam : "+ kaan.getAdSoyad() + "in harcadigi kalori: " + kaan.getToplamHarcananKalori());
		
      SporMerkeziUye zeynep = new SporMerkeziUye(1, "Zeynep Kaya", 50);
		
		zeynep.sporYap("kosu", 15 );
		zeynep.sporYap("mekik", 10);
		zeynep.sporYap("ipatlama", 30);
		zeynep.sporYap("kosu", 15 );
		
		
		System.out.println("Toplam : "+ zeynep.getAdSoyad() + "in harcadigi kalori: " + zeynep.getToplamHarcananKalori());
		
		
		kaan.tumSporKayitlariniGoster();
	}
	

}
