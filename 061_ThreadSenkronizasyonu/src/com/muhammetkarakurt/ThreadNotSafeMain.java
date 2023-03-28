package com.muhammetkarakurt;

public class ThreadNotSafeMain {
	
	private int  count = 0 ;
	
	public void threadleriCalistir() {
		Thread thread1 = new Thread(new Runnable() {
			
			@Override
			public void run() {
				for(int i = 0 ; i < 5000 ; i++) {
					count++;
				}
				System.out.println("Thread1 is over ");
			}
		});
		
		Thread thread2 = new Thread(new Runnable() {
			
		
			public void run() {
				
				for(int i = 0 ; i < 5000 ; i++) {
					count++;
				}
				System.out.println("Thread2 is over");
			}
		});
		
		thread1.start();
		thread2.start();
		try {
			thread1.join();
			thread2.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("Count degiskeninin son degeri: " + count);
	}

	public static void main(String[] args) {
		ThreadNotSafeMain main = new ThreadNotSafeMain();
		

		main.threadleriCalistir();
	}

}
