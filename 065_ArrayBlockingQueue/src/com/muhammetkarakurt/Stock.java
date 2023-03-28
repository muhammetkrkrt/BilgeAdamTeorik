package com.muhammetkarakurt;

import java.util.Random;
import java.util.concurrent.ArrayBlockingQueue;

public class Stock {
	
	
	Random rd = new Random();
	
	ArrayBlockingQueue<Integer > queue = new ArrayBlockingQueue<>(10);
	
	
	public void produce() {
		
		while (true) {
			
			Integer val = rd.nextInt(1000);
		try {
			queue.put(val);
			
			System.out.println("Producer stoga mal ekleniyor: " + val);
			System.out.println("Stogun guncel size: " + queue.size());
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	}
	public void consumer() {
		
		while (true) {
			try {
				Thread.sleep(3000);
				
				Integer val ;
				
				val = queue.take();
				System.out.println("---Consumer stoktan mal tuketiyor: " + val);
				System.out.println("Stogun guncel size: " + queue.size());
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
	}
	
	

}
