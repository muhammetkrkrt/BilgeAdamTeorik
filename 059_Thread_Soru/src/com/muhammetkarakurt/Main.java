package com.muhammetkarakurt;

public class Main {

	
	public static void main(String[] args) {
		
		System.out.println("Main thread çalışıyor...");

		Yazici1 yaziciThread1 = new Yazici1("Yazici Thread-1");
		Yazici2 yaziciThread2 = new Yazici2("Yazici Thread-2");
		Yazici3 yaziciThread3 = new Yazici3("Yazici Thread-3");

		yaziciThread1.start();
		yaziciThread2.start();
		yaziciThread3.start();

		try {
			yaziciThread1.join(); 
			yaziciThread2.join();
			yaziciThread3.join();
		} catch (InterruptedException e) {
		
			e.printStackTrace();
		}

		System.out.println("Main thread bitti, çıkıyor...");
	}
		

	}


