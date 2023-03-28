package com.muhammetkarakurt;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main {

	
	
	private static void printArrayList(List<Kisi> list) {
		System.out.println("\n- - - - - - - -\n");
		for (Kisi kisi : list) {
			System.out.println(kisi);
		}		
	}
	
	
	public static void printList(List<String> list) {
		System.out.println();
		for (String name : list) {
			System.out.println(name);
		}
	}
	
	
	private static List<String> listeOlustur() {
//		List<String> lst = new ArrayList<>();
//		lst.add("Ali");
//		lst.add("Veli");		
//		return lst;
		
		List<String> lst = new LinkedList<>();
		lst.add("Ali");
		lst.add("Veli");
		return lst;	
	}

	
	
	public static void main(String[] args) {
		
		
		ArrayList<String> cars = new ArrayList<String>();
		cars.add("Volvo");
		cars.add("BMW");
		cars.add("Ford");
		cars.add("Mazda");
		
		for(int i=0;i<cars.size();i++) {
			System.out.println(cars.get(i));
		}
		
		System.out.println(cars);
		
		for(String car : cars) {
			System.out.println(car);
		}
		
		// ------------------------------------
		// ArrayList içine primitive veri tipleir yazılmaz bunlaırn yerine onların WRAPPER suınıfları yazılır
		// Ör.
		// int => Integer
		// float => Float ...vb. gibi
		ArrayList<Integer> arrList = new ArrayList<>();
		arrList.add(3);
		arrList.add(7);
		arrList.add(10);
		arrList.add(3);	
		System.out.println(arrList);
		arrList.remove(new Integer(3));
		System.out.println(arrList);
		arrList.remove(new Integer(3));
		System.out.println(arrList);
		
		
		// ArrayList'ler içinde kendi Nesnelerimizi Kullanımı:
		System.out.println();
		Kisi k1 = new Kisi("John", "Smith");
		Kisi k2 = new Kisi();
		k2.setAd("Robert");
		k2.setSoyad("Donavan");
		Kisi k3 = new Kisi("Ali", "Kaya");
		
		ArrayList<Kisi> list = new ArrayList<>();
		list.add(k1);
		list.add(k2);
		list.add(k3);
		Main.printArrayList(list);
		
		// Remove : 2 remove yöntemi vardır, 1:si nesne referansini gponderirsiniz ve onu cikarir, 2. si cikarmak istedğiniz elemanın indexinin gonderirsiniz.	
		// list.remove(k2);
		list.remove(1);
		Main.printArrayList(list);
		
		//
		List<Kisi> list2 = new ArrayList<Kisi>();
		list2.add(new Kisi("Ahmet", "Emre"));
		Main.printArrayList(list2);
				
		
		System.out.println();
		
		// ArrayList'lerde araya eleman ekleme:
		//
		List<String> l = Main.listeOlustur();
		for (String s : l) {
			System.out.println(s);
		}
		l.add(1, "Ayşe");
		System.out.println();
		for (String s : l) {
			System.out.println(s);
		}
		
		
		
		// LINKED LIST
		// 
		// ArrayList hızlı random(rastgele) erişimi sağlar, dizinin içindeki herhangi bir elemanı sabit sürede getirir.
		// Ancak, arraylistte yapılan aradan eleman ekleme veya çıkarma gibi işlemler çok uzun vakit alır.
		
		// LinkedList'lerde ise araya eleman ekleme veya silme ArrayList'lere göre çok daha hızlı olur.
		// Ancak LinkedList belirli bir index'teki elemana erişim hızında ArrayList'e göre çok yavaş kalır.
		System.out.println(l.get(1));
		
		System.out.println("\n-------------------\n");
		
		List<String> linkedList = new LinkedList<>();
		linkedList.add("John");
		linkedList.add("Barbara");
		//System.out.println(linkedList);
		
		Main.printList(linkedList);
		Main.printList(cars);
		
		linkedList.remove("John");
		Main.printList(linkedList);
		
		System.out.println(linkedList.get(0));
		
		// Araya eleman ekleme
		linkedList.add(1, "Robert");
		Main.printList(linkedList);
		
		
		
		
	}



	

}
