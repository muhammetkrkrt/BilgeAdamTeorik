package com.muhammetkarakurt;

public class ThreadSafeMain {
     private int  count = 0 ;
     
     // synchronized metodlari ayni anda sadece 1 thread calistirabilir
     
     // oda-anahtar makanizmasi gibi dusunun anahtar kimdeyse o gir ve odayi kitler 
     // Bu sekilde yaptigimiz zaman uygulamamiz artik Thread-Safe olur.
     public synchronized  void threadlerBurayaSenktonOlarakGirer() {
    	 count++;
     }
	
	public void threadleriCalistir() {
		Thread thread1 = new Thread(new Runnable() {
			
			@Override
			public void run() {
				for(int i = 0 ; i < 5000 ; i++) {
					threadlerBurayaSenktonOlarakGirer();
				}
				System.out.println("Thread1 is over ");
			}
		});
		
		Thread thread2 = new Thread(new Runnable() {
			
		
			public void run() {
				
				for(int i = 0 ; i < 5000 ; i++) {
					threadlerBurayaSenktonOlarakGirer();
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
		ThreadSafeMain main = new ThreadSafeMain();
		

		main.threadleriCalistir();
	}

}
