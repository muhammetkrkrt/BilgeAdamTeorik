package com.muhammetkarakurt;

public class Guvercin extends Hayvan implements IUcabilir {

	
	
	
	
	public Guvercin(String ad, int kilosu, int uzunlugu) {
		super(ad, kilosu, uzunlugu);
	}

	@Override
	public void sesCikar() {
		System.out.println("guguk ..");

	}

	@Override
	public void yemekYe() {
		System.out.println("Güvercin " + this.getAd() + "  yem yiyor..");

	}

	@Override
	public void kanatCirp() {
		System.out.println(this.getAd() + "  adlı güvercin saniyede 5 kez kanat çirpıyor");
		
	}

	@Override
	public void kanatlariTemizle() {
		System.out.println(this.getAd() + "  adlı güvercin kanatlarını yavaşça temziliyor");
		
	}

	@Override
	public void gagala(String nesne) {
		System.out.println(this.getAd() + "  adlı güvercin uzun gagasıyla " + nesne + " gagalıyor");
		
	}

}
