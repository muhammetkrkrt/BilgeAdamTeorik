package com.muhammetkarakurt;

import java.util.Scanner;

public class Test {
	
	private Object lock = new Object();
	
	public void thread1Metod() {
		
		synchronized (lock) {
			System.out.println("Thread1 is running ..");
			System.out.println("Thread1 waits...");
			try {
				lock.wait();  // wait ile uyuyacagim lock i birakiyorum..
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("Thread1 is awake contionues ... ");
		}
	}
	
	
	public void thread2Metod() {
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		synchronized (lock) {
			Scanner sc = new Scanner(System.in);
			
			System.out.println("Thrad2 is runnig..");
			System.out.println("Lutfen bir sayi giriniz: ");
			sc.nextLine();
			lock.notify();
			System.out.println("Thread2 quits..");
		}
	}
	

}
