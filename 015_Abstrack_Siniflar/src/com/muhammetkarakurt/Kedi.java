package com.muhammetkarakurt;


	
	public class Kedi extends Hayvan {

		public void sesCikar() {
			System.out.println("Miyav Miyav");
		}

		public Kedi(String ad, int kilo, int uzunluk) {
			super(ad, kilo, uzunluk);
		}

		@Override
		public String toString() {
			return "Kedi [getAd()=" + getAd() + ", getKilo()=" + getKilo() + ", getUzunluk()=" + getUzunluk() + "]";
		}

		@Override
		public void yemekYe() {
			System.out.println("Kedi süt içiyor.");
			
		}
		public void sutIc() {
			System.out.println("Kedi süt içiyor.");
			
		}
	
	

}
