package com.muhammetkarakurt;

public class Singleton {
	
	private static AlanHesaplayici alanHesaplayici;
	private static CevreHesaplayici cevreHesaplayici;
	
	
	public static CevreHesaplayici getCevreHesaplayici() {
		if(cevreHesaplayici == null) {
			cevreHesaplayici = new CevreHesaplayici();
			
		}
		return cevreHesaplayici;
	}
	
	
	public static AlanHesaplayici getrAlanHesaplayici() {
		if(alanHesaplayici == null) {
			alanHesaplayici = new AlanHesaplayici();
		}
		return alanHesaplayici;
	}

}
