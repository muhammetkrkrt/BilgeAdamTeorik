package com.muhammetkarakurt;

public class Main {
	
	
	
	public static void main(String[] args) {
		
		System.out.println("Main thread calisiyor...");
		
		Thread  printer1 = new Thread(new Runnable() {
			
			@Override
			public void run() {
				
				System.out.println("Thread-1 calisiyor ...");
				for(int i = 1 ; i <= 5 ; i++) {
					System.out.println("Thread-1 yaziyor: " + i);
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						
						e.printStackTrace();
					}
					
				}System.out.println("Thread-1 cikiyor...");
				
			}
		});
		
           Thread  printer2 = new Thread(new Runnable() {
			
			@Override
			public void run() {
				
				System.out.println("Thread-2 calisiyor ...");
				for(int i = 1 ; i <= 2 ; i++) {
					System.out.println("Thread-2 yaziyor: " + i);
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						
						e.printStackTrace();
					}
					
				}System.out.println("Thread-2 cikiyor...");
				
			}
		});
           
           
           printer1.start();
           printer2.start();
           System.out.println("Main thread cikiyor... ");

	}
}
