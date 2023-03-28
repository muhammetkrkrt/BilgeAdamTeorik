package com.muhammetkarakurt;

public class Serce extends Hayvan implements IUcabilir {

	
	
	
	
	public Serce(String ad, int kilosu, int uzunlugu) {
		super(ad, kilosu, uzunlugu);
	}

	@Override
	public void sesCikar() {
		System.out.println("cik cik cik...");

	}

	@Override
	public void yemekYe() {
		System.out.println("Serce " + this.getAd() + "  yem yiyor....");

	}

	@Override
	public void kanatCirp() {
		System.out.println(this.getAd() + "  adlı serçe saniyede 10 kez kanat çirpıyor");
		
	}

	@Override
	public void kanatlariTemizle() {
		System.out.println(this.getAd() + " adlı serçe kanatlarını temizliyor");
		
	}

	@Override
	public void gagala(String nesne) {
		System.out.println(this.getAd() + "  adlı serçe küçük gagasıyla " + nesne + " gagalıyor");		
	}

}
