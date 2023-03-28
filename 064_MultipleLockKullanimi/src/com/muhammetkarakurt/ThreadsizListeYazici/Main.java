package com.muhammetkarakurt.ThreadsizListeYazici;

public class Main {

	
	public static void main(String[] args) {
		ThreadsizListeYazici listeYazici = new ThreadsizListeYazici();
		
		long baslangic = System.currentTimeMillis();
		listeYazici.listtelereDegerEkle();
		long bitis = System.currentTimeMillis();
		
		System.out.println("Toplam gecen sure : " + (bitis-baslangic));
	}
}
