package com.muhammetkarakurt;

public class GoldenRetriever extends Hayvan {

	
	
	
	public GoldenRetriever(String ad, int kilosu, int uzunlugu) {
		super(ad, kilosu, uzunlugu);
	}
	

	@Override
	public void sesCikar() {
		System.out.println("Haw haw haw...");
		
	}

	@Override
	public void yemekYe() {
		System.out.println("Köpek " + this.getAd() + "  kemik yiyor...");
		
	}

}
