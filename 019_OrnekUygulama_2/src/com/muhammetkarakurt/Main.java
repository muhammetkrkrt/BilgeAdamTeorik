package com.muhammetkarakurt;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		
		
		Ogrenci ogrenci1 = new Ogrenci("Ahmet", "Emre", 450, 0);
		Ogrenci ogrenci2 = new Ogrenci("Ali", "Tas", 451, 0);
		Ogrenci ogrenci3 = new Ogrenci("Zeynep", "Emre", 452, 0);
		Ogrenci ogrenci4 = new Ogrenci("Fatma", "Celikci", 453, 0);
		
		Sinif sinif1 = new Sinif("3A", "3.kat 103 nolu salon", new ArrayList<>());
		
		sinif1.sinifaOgrenciEkle(ogrenci1);
		sinif1.sinifaOgrenciEkle(ogrenci2);
		sinif1.sinifaOgrenciEkle(ogrenci3);
		sinif1.sinifaOgrenciEkle(ogrenci4);
		
		Sinif sinif2 = new Sinif("1B", "B blok 102");
		Ogrenci ogrenci5 =  new Ogrenci("Kaan", "Kaya", 500, 0);
		sinif2.sinifaOgrenciEkle(ogrenci5);
		
		
		Ogrenci ogrenci6 = new Ogrenci("Ahmet", "Emre", 450, 0);
		Ogrenci ogrenci7 = new Ogrenci("Ali", "Tas", 451, 0);
		Ogrenci ogrenci8 = new Ogrenci("Zeynep", "Emre", 452, 0);
		Ogrenci ogrenci9= new Ogrenci("Fatma", "Celikci", 453, 0);
		
		Sinif sinif3 = new Sinif("3A", "3.kat 103 nolu salon", new ArrayList<>());
		
		sinif3.sinifaOgrenciEkle(ogrenci6);
		sinif3.sinifaOgrenciEkle(ogrenci7);
		sinif3.sinifaOgrenciEkle(ogrenci8);
		sinif3.sinifaOgrenciEkle(ogrenci9);
		
		Okul okul1= new Okul("KKAOL", "Sarikamis Kars");
		
		okul1.sinifEkle(sinif1);
		okul1.sinifEkle(sinif2);
		okul1.sinifEkle(sinif3);
		
		
		okul1.siniflariYazdir();
		
		

		

	}

}
