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
		

	}

}
