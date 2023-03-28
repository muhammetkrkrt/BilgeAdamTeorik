package com.muhammetkarakurt;

public class AnkaraKedisi extends Hayvan {

	
	
	
	public AnkaraKedisi(String ad, int kilosu, int uzunlugu) {
		super(ad, kilosu, uzunlugu); 
	}
	

	@Override
	public void sesCikar() {
		System.out.println("Miyawwww");
		
	}

	@Override
	public void yemekYe() {
		System.out.println("Kedi " + this.getAd() + " süt içiyor.");
		
	}

}
