package com.muhammetkarakurt;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main {

	
	
//	public static void nemGoster(Arzum arzum) {
//		
//		System.out.println(arzum.nemOlc());
//	}
//	
//	
//	public static void nemGoster(Sinbo sinbo) {
//		
//		System.out.println(sinbo.nemOlc());
//	}
	
	public static void nemGoster(INemOlcer nemOlcer) {
		System.out.println(nemOlcer.nemOlc());
	}
	
		
	public static void tarihSaatGoster(ITarihSaatGoster tarihSaatGosterenCihaz) {
		System.out.println(tarihSaatGosterenCihaz.tarihGoster() + "  " + tarihSaatGosterenCihaz.saatGoster());
	}
	
	
	// Interface'ler abstraction (soyutlama) sağlar
	public static ITermometre termometreOlustur() 
	{
		ITermometre termometre = new Sinbo();
		return termometre;
	}
	
	
	
	public static void main(String[] args) {
		
		Arzum arzum = new Arzum();
//		System.out.println(arzum.sicakligiOlc());
//		
//		ITermometre termometre = new Sinbo();
//		System.out.println(termometre.sicakligiOlc());
//		
		Sinbo sinboCihaz = new Sinbo();
//		sincoCihaz.sicakligiOlc();
//		sincoCihaz.nemOlc();
		// List<String> mylist = new LinkedList<String>();

//		Main.nemGoster(arzum);
//		Main.nemGoster(sinboCihaz);
		
		Main.nemGoster(sinboCihaz);
		Main.nemGoster(arzum);
		
		Casio casio = new Casio();
		// Main.nemGoster(casio); => Hata verir cunku casio sinifi INemOlcer interface'ini implement etmiyor ! 
		
		System.out.println("\n- - - - - - - -");
		Main.tarihSaatGoster(casio);
		// Main.tarihSaatGoster(sinboCihaz); => Kullanamayız çünkü sinboCihaz ITarihSaatGoster interface'ini implement etmiyor.
		Main.tarihSaatGoster(arzum);
		
		
		System.out.println("\n- - - - - - - -");
		ITermometre term = Main.termometreOlustur();
		System.out.println(term.sicakligiOlc());
	}

}
