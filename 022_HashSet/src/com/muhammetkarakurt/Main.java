package com.muhammetkarakurt;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		// HashSet ler javada elemanlara random olarak cok hizli bir sekilde erismek icin kullanilan veri yapilardir
		//hizli olmasinin nedeni elemanlara erisilirken hash kodlarinin kullanilmasidir
		// hash code sayesinde herhangi bir input elemani unique olarak tanimlanir
		
		
		
		HashSet<String> hashSet = new HashSet<>();
		
		hashSet.add("Kus");
		hashSet.add("kedi");
		hashSet.add("Kopek");
		hashSet.add("Kus");
		System.out.println("HashSet: ");
		
		for (String string : hashSet) {
			System.out.println(string);
		}	
		
		List<String> arrayList = new ArrayList<>();
		
		arrayList.add("Kus");
		arrayList.add("kedi");
		arrayList.add("Kopek");
		arrayList.add("Kus");
		System.out.println("ArrayList: ");
		
		for (String string : arrayList) {
			System.out.println(string);
		}
		
		//milyonlarca kayit olan arraylist de yaparsak hashset e gore cok uzun sure alabilir
		//hashset de ise cok kisa surede aradiginiz degere ulasabilirsiniz.
		
		
     HashSet<String> hashSet2 = new HashSet<>();
		
		hashSet.add("Kaplan");
		hashSet.add("kedi");
		hashSet.add("Aslan");
	
		
		HashSet<String> fark = new HashSet<>(hashSet2);
		
		fark.removeAll(hashSet); //fark isimli hasset ten ilk hashset imin ayni olan elemanlarini cikardim  geriye farkli olanlar kaldi.
		
		
		
		

	}

}
