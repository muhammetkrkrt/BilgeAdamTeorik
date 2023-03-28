package com.muhammetkarakurt;

public class Main {

	public static void main(String[] args) {
		
		System.out.println("Main thread calisiyor...");
		
		Thread yazici1 = new Thread(new Yazici("Printer-1"));
		Thread yazici2 = new Thread(new Yazici("Printer-2"));
		
		yazici1.start();
		yazici2.start();
		
		try {
			yazici1.join();
		} catch (InterruptedException e) {
			System.out.println("Thread interrupt yedi.!!");
			e.printStackTrace();
		}
		

	}

}
