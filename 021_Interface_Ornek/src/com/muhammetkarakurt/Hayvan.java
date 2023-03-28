package com.muhammetkarakurt;


// Abstract sınıflar ise soyut sınıflardır. 
// Abstract bir sınıftan new ile nesne (object) oluşturamazsınız.
public abstract class Hayvan {
	
	private String ad;
	private int kilosu;
	private int uzunlugu;
	
	
	
	public Hayvan() {
		
	}
	
	public Hayvan(String ad, int kilosu, int uzunlugu) {
		super();
		this.ad = ad;
		this.kilosu = kilosu;
		this.uzunlugu = uzunlugu;
	}


	// Abstract Metodlar implementasyon içermez. Sadece metod tanımı yazılır.
	//
	// Abstract yapılan metodlar mutlaka alt sınıflarda implement edilmelidir (yani kodlanmalıdır) / override edilmelidir.
	// Bilgi : Abstract metodlar yalnızca abstract sınıflarda yazılabilir.
	public abstract void sesCikar();
	
	public abstract void yemekYe(); 
	
	
	public String getAd() {
		return ad;
	}
	
	public void setAd(String ad) {
		this.ad = ad;
	}
	
	public int getKilosu() {
		return kilosu;
	}
	
	public void setKilosu(int kilosu) {
		this.kilosu = kilosu;
	}
	
	public int getUzunlugu() {
		return uzunlugu;
	}
	
	public void setUzunlugu(int uzunlugu) {
		this.uzunlugu = uzunlugu;
	}


	@Override
	public String toString() {
		return "Hayvan [ad=" + ad + ", kilosu=" + kilosu + ", uzunlugu=" + uzunlugu + "]";
	}
	
	
	
	

}
