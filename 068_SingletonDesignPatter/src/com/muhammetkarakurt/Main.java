package com.muhammetkarakurt;

public class Main {

	public static void main(String[] args) {
		
//		AlanHesaplayici alanHesaplayici = new AlanHesaplayici();
//		
//		System.out.println(alanHesaplayici.diktorgenAlanHesapla(15, 20));
		
		
		System.out.println("Alan: " + Singleton.getrAlanHesaplayici().diktorgenAlanHesapla(4, 10));
	

	}

}
