package com.muhammetkarakurt;

import java.util.Scanner;

public class StaticVariables {
	// Java'da global değişkenler yoktur. (C'de vardır.)
	// Bunun yerine sınıfların static değişkenlerini public yapıp kullanırsanız,
	// global değişken gibi davranabilir.
	// sınıfların static değişkenleri
	// static değişkenler program ilk çalıştırıldığında memory'de adreslenir.

	// Sınıfların static değişkenleri:
	public static final int DUNYANIN_YARICAPI = 6371; // km
	public static final double PI = 3.14;
	public static int aktifKullaniciSayisi = 0;

	public void staticOlmayanMetod() {
		System.out.println("static olmayan metodtan merhaba !");
	}

	public static void main(String[] args) {

		System.out.println("Aktif kullanıcı sayısı: " + StaticVariables.aktifKullaniciSayisi);
		StaticVariables.aktifKullaniciSayisi++;
		System.out.println("Aktif kullanıcı sayısı: " + StaticVariables.aktifKullaniciSayisi);

		StaticVeriablesTest.aktifKullaniciSayisiniArtir();
		System.out.println("Aktif kullanıcı sayısı: " + StaticVariables.aktifKullaniciSayisi);

		// Scope ile ilgili not:
		// Local değişkenler ancak tanımlandıktan sonra kullanılabilir.
		// final değişkenlerini main metodundan sonra da tanımlasam, mainde bu final
		// değişkenini kullanabiliyorum. main'e girmeden tüm static değişkenler
		// oluşturuluyor.

		int z = 9;
		System.out.println(z);

		System.out.println(PI);

		// KURAL
		// Static olmayan metodları, static metodlar içinden direkt çağıramazsınız !!
		// Static olmayan metodlar nesnelere aittir. Nesneler ile birlikte çağırılırlar.

		// staticOlmayanMetod(); --> hata verir. çünkü static olan main metod içinden
		// çağırıyorum.

		StaticVariables nesne = new StaticVariables();
		nesne.staticOlmayanMetod();

		Scanner scanner = new Scanner(System.in);
		int b = scanner.nextInt();
	}

}
