package com.muhammetkarakurt;

import java.util.HashMap;

public class Soru1 {

	
	
	
	public static void harfSayisiniBul(String metin) {
		// İpucu : HashMap kullanabilirsiniz.
		// İpucu => Key : Karakter    ->     Value : Karaketrin tekrar sayısını (count) tutabilirsiniz.
		HashMap<Character, Integer> hashMap = new HashMap<>();
		
		for (int i=0;i<metin.length();i++) 
		{
			char ch = metin.charAt(i);
			
			if (hashMap.containsKey(ch))   // Karakter hasMap'te mevcut ise bu kod bloğuna girer.
			{
				hashMap.put(ch, hashMap.get(ch)+1);
			} 
			else  // Karakter hashMap'te mevcut dğeilse bu kod bloğuna girer
			{
				hashMap.put(ch, 1);				
			}
		}
				
		System.out.println(hashMap);
	}
	
	
	
	public static void enCokTekrarEdenHarfiBul(String metin) {
		// İpucu : HashMap kullanabilirsiniz.
		// İpucu => Key : Karakter    ->     Value : Karaketrin tekrar sayısını (count) tutabilirsiniz.
		HashMap<Character, Integer> hashMap = new HashMap<>();
		char encokTekrarEdenKarakter = 0;
		int max = 0;
		
		for (int i=0;i<metin.length();i++) 
		{
			char ch = metin.charAt(i);
			
			if (hashMap.containsKey(ch))   // Karakter hasMap'te mevcut ise bu kod bloğuna girer.
			{
				int tekrarSayisi = hashMap.get(ch)+1;
				
				if (tekrarSayisi > max) 
				{
					encokTekrarEdenKarakter = ch;
					max = tekrarSayisi;
				}
				
				hashMap.put(ch, hashMap.get(ch)+1);
			} 
			else  // Karakter hashMap'te mevcut dğeilse bu kod bloğuna girer
			{
				hashMap.put(ch, 1);				
			}
		}
		
		System.out.println(hashMap);
		System.out.println("En cok tekrar eden karakter : " + encokTekrarEdenKarakter + "  tekrar sayısı: " + max);
	}
	
	
	public static void main(String[] args) {

		// Static bir metod yazın.
		// Bir String içindeki karakterlerin sayısını bulan ve erkana yazdıran bir metod yazınız.
		String metin = "Hello";  // "Hello";  // H:1 e:1 l:2 o:1
//		Soru1.harfSayisiniBul(metin);
		
		
		// En çok tekrar edern harfi bulunuz ve tekrar sayısını yazdıırnız. 
		Soru1.enCokTekrarEdenHarfiBul(metin);
	}

}
