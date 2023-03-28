package com.muhammetkarakurt;

import java.util.HashMap;

public class Main {

	public static void main(String[] args) {
		
		Ogrenci ogrenci1 = new Ogrenci("Ali", "Kaya", 87 , 75, 83);
		Ogrenci ogrenci2 = new Ogrenci("Fatma", "Can", 58 , 71, 75);
		Ogrenci ogrenci3 = new Ogrenci("Zeynep", "Ozkara", 68 , 81, 95);
		Ogrenci ogrenci4 = new Ogrenci("Zeki", "Ozkan", 88, 91, 95);

		
		HashMap<Integer, Ogrenci> hashMap = new HashMap<>();
		
		hashMap.put(1145557, ogrenci1);
		hashMap.put(2222222, ogrenci2);
		hashMap.put(1234567, ogrenci3);
		hashMap.put(7654321, ogrenci4);
		
		Ogrenci sonuc = hashMap.get(1145557);
		System.out.println(sonuc);
		sonuc = hashMap.get(7654321);
		System.out.println(sonuc);
	}

}
