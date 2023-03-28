package com.muhammetkarakurt;

import java.util.Random;

public class ThreadSafe2 {
	
	
	private int count = 0 ;
	
	
	protected  synchronized  void uretimTuketim (int degisimSayisi) {
		count += degisimSayisi ;
		if(degisimSayisi < 0 ) {
			System.out.println("Stoktan mal cikisi");
		}else
		{
			System.out.println("Stoga mal girisi");
		}
		System.out.println("Stock durumu -> " + count);
	}
	
	private void threadleriCalistir() {
       Thread thread1 = new Thread(new Runnable() {
			
			@Override
			public void run() {
				System.out.println("Uretici thread calisti.");
				for(int i = 0 ; i < 100 ; i++) {
					Random r = new Random();
					int uretimSayisi = r.nextInt(1,10);
					uretimTuketim(uretimSayisi);
					try {
						Thread.sleep(2000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				System.out.println("Thread1 is over ");
			}
		});
       
       Thread thread2 = new Thread(new Runnable() {
			
			@Override
			public void run() {
				System.out.println("Tuketici thread calisti.");
				for(int i = 0 ; i < 100 ; i++) {
					Random r = new Random();
					int tuketimSayisi = r.nextInt(10) * -1 ;
					uretimTuketim( tuketimSayisi);
					try {
						Thread.sleep(4000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				System.out.println("Thread2 is over ");
			}
		});
		
		thread1.start();
		try {
			thread1.sleep(3500);
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		thread2.start();
		
		try {
			thread1.join();
			thread2.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	public static void main(String[] args) {
		ThreadSafe2 threadSafe2 = new ThreadSafe2();
		threadSafe2.threadleriCalistir();
		
	}

}
