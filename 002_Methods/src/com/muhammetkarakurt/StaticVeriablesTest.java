package com.muhammetkarakurt;

public class StaticVeriablesTest {

	public static void aktifKullaniciSayisiniArtir() {
		StaticVariables.aktifKullaniciSayisi++; // burda işlem yaptığım için return yok
	}

	public static int aktifKullaniciSayisiniGetir() {
		return StaticVariables.aktifKullaniciSayisi;
	}

	public static void main(String[] args) {

		StaticVariables.aktifKullaniciSayisi++;
		StaticVariables.aktifKullaniciSayisi++;
		System.out.println(StaticVariables.aktifKullaniciSayisi);
		int z = aktifKullaniciSayisiniGetir();
		System.out.println(z);

	}

}
