package com.muhammetkarakurt;

public class Main {
	
	
	

	public static void main(String[] args) {
		
		Stock stock = new Stock();
		
		Thread producer = new Thread(new Runnable() {
			
			@Override
			public void run() {
				
				stock.produce();
			}
		});
		
            Thread consumer = new Thread(new Runnable() {
			
			@Override
			public void run() {
				
				stock.consumer();
			}
		});
            
            //producer thread mal uretmeye basladi
            producer.start();
            
            try {
				Thread.sleep(8000);// 8 sn uyutuyoruz
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
           
            consumer.start();
            
            
            try {
				producer.join();
				consumer.join();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
            

	}

}
