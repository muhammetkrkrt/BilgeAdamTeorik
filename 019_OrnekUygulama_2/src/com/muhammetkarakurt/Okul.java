package com.muhammetkarakurt;

import java.util.LinkedList;
import java.util.List;

public class Okul {

	private String okulAdi;
	private String okulAdresi;
	private List<Sinif> siniflarList;
	
	

	public void sinifEkle(Sinif sinif) {
		this.siniflarList.add(sinif);
	}
	
	public void siniflariYazdir() {
		System.out.println("\n* * * " + this.okulAdi + "Okulundaki Siniflar * * * \n");
		for (Sinif sinif : siniflarList) {
			System.out.println("Sinif adi: " + sinif.getSinifAdi() + "Lokasyon:  " + sinif.getLokasyon() );
		}
	}
	
	
	public Okul(String okulAdi, String okulAdresi) {
		super();
		this.okulAdi = okulAdi;
		this.okulAdresi = okulAdresi;
		this.siniflarList = new LinkedList<>();
	}

	public String getOkulAdi() {
		return okulAdi;
	}

	public void setOkulAdi(String okulAdi) {
		this.okulAdi = okulAdi;
	}

	public String getOkulAdresi() {
		return okulAdresi;
	}

	public void setOkulAdresi(String okulAdresi) {
		this.okulAdresi = okulAdresi;
	}

	public List<Sinif> getSiniflarList() {
		return siniflarList;
	}

	public void setSiniflarList(List<Sinif> siniflarList) {
		this.siniflarList = siniflarList;
	}
	

}
