package com.muhammetkarakurt;


        // Thread olusturmada  2. yontem : Runnable interface ini implement edin
public class Yazici implements Runnable {

	private String isim ;
	public Yazici(String isim) {
		
		this.isim = isim ;
	}
	public String getIsim() {
		return isim;
	}






	public void setIsim(String isim) {
		this.isim = isim;
	}






	@Override
	public String toString() {
		return "Yazici [isim=" + isim + "]";
	}






	public void run() {

     System.out.println(this.isim + " Isimli thread calisiyor.. ");
		for (int i =1 ; i <= 5 ; i++) {
			System.out.println(this.isim + " yaziyor: " + i );

		}
		System.out.println(this.isim + "isimli thread calisiyor..");
		
	}

}
