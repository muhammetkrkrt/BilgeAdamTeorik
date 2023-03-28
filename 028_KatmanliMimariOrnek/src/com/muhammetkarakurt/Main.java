package com.muhammetkarakurt;

import java.util.Scanner;

import com.muhammetkarakurt.controler.OgrenciController;
import com.muhammetkarakurt.controler.OgretmenController;

public class Main {

	public static void main(String[] args) {
		
		OgretmenController ogretmenConroller = new OgretmenController();
		OgrenciController ogrenciController = new OgrenciController();
		int secim = 0;
		do {
			System.out.println("\n***** OKUL BILGI SISTEMINE HOSGELDINIZ ******\n");
			System.out.println("1 - Ogrenci Ekleme");
			System.out.println("2 - Ogrenci Silme");
			System.out.println("3 - Ogrenci Bilgilerini Guncelleme");
			System.out.println("4 - Ogrenci Arama");
			System.out.println("5 - Ogrenci Listesini Goruntuleme");
			
			System.out.println("6 - Ogretmen Ekleme");
			System.out.println("7 - Ogretmen Silme");
			System.out.println("8 - Ogretmen Bilgilerini Guncelleme");
			System.out.println("9 - Ogretmen Arama");
			System.out.println("10 - Ogretmen Listesini Goruntuleme");
			System.out.println("11 - Cikis");
			Scanner scanner = new Scanner(System.in);
			
			System.out.println("Seciminizi giriniz: ");
			secim = scanner.nextInt();

			switch (secim) {
			case 1:
				ogrenciController.ogrenciEkleme();
				break;
			case 2:
				ogrenciController.ogrenciSil();
				break;
			case 3:
				ogrenciController.ogrenciGuncelle();
				break;
			case 4:
				ogrenciController.ogrenciBul();
				break;
			case 5:
				ogrenciController.ogrenciListesiniGoster();
				break;
			case 6:
				ogretmenConroller.ogretmenEkleme();
				break;
			case 7:

				break;
			case 8:

				break;
			case 9:

				break;
			case 10:

				break;
			default:
				break;
			}

		} while (secim != 11);

	}

}
