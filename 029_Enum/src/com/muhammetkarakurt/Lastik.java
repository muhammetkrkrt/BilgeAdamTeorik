package com.muhammetkarakurt;


import com.muhammetkarakurt.MainEnumOrnek.Mevsimler;

public class Lastik {
	
	public Mevsimler lastikMevsimi;

	public static void main(String[] args) {
		
		Lastik lastik = new Lastik();
		lastik.lastikMevsimi = Mevsimler.SONBAHAR;
		
		System.out.println(lastik.lastikMevsimi);

	}

}
