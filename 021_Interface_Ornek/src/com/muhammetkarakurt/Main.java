package com.muhammetkarakurt;

public class Main {

	
	// Polymorphism over Interfaces
	public static void kisaSureliUc(IUcabilir kus) {
		System.out.println("\n- - - - -\n");
		kus.kanatCirp();
	}
	
	
	// Polymorphism over Inheritance
	public static void hayvan2kezSesCikarsin(Hayvan hayvan) {
		hayvan.sesCikar();
		hayvan.sesCikar();
	}
	
	
	public static void main(String[] args) {

		//IUcabilir beyazPacaliGuvercin = new Guvercin("Beyaz paçalı", 1, 12);
		Guvercin beyazPacaliGuvercin = new Guvercin("Beyaz paçalı", 1, 12);
		beyazPacaliGuvercin.gagala("yem");
		
		//IUcabilir serce = new Serce("Minik Serçe", 1, 8);
		Serce serce = new Serce("Minik Serçe", 1, 8);
		serce.gagala("yem");

		AnkaraKedisi kedi = new AnkaraKedisi("Tekir", 5, 40);
		Main.kisaSureliUc(beyazPacaliGuvercin);
		Main.kisaSureliUc(serce);
		// Main.kisaSureliUc(kedi);  => Cagiramazsiniz cunku AnkaraKedisi sınıfı IUcabilir interface'ini implement etmiyor !
		
		Main.hayvan2kezSesCikarsin(kedi);
		Main.hayvan2kezSesCikarsin(serce);
		Main.hayvan2kezSesCikarsin(beyazPacaliGuvercin);
	}

}
