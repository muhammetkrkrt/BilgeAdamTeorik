package com.muhammetkarakurt;

public class Utility {
	
	
	public void heaplamaYap() {
		
		
		System.out.println("Toplam Alan : "+( Singleton.getrAlanHesaplayici().diktorgenAlanHesapla(3, 7) + Singleton.getrAlanHesaplayici().kareAlanHesapla(15)));
		
		
	}

}
