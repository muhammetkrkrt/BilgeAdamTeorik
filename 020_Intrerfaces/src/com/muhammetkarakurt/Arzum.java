package com.muhammetkarakurt;

public class Arzum implements ITermometre, INemOlcer, ITarihSaatGoster {

	
	public String tarihGoster() {
		return "17 Kasım 2022";
	}

	
	public String saatGoster() {
		return "12:45";
	}

	
	public double nemOlc() {
		return 30.5;
	}

	
	public int sicakligiOlc() {
		return 22;
	}

}
