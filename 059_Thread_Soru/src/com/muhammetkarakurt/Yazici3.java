package com.muhammetkarakurt;

public class Yazici3 extends Thread {

	private String isim;

	public Yazici3(String isim) {
		this.isim = isim;
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
		
		System.out.println(this.isim + " isimli thread çalışıyor...");
		
		for(int i = 0; i <= 50; i += 7) {
			System.out.println(this.isim + " yazıyor: " + i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
				
		System.out.println(this.isim + " isimli thread işini bitirdi..");
	}
	

}
