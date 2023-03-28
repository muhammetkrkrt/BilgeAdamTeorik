package com.muhammetkarakurt.ThreadliListeYazici;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Random;

public class ThreadliListeYazici {

	ArrayList<Integer> list1 = new ArrayList<>();
	ArrayList<Integer> list2 = new ArrayList<>();
	
	Random rd = new Random();
	
	
	public synchronized void list1DegerEkle() {
		try {
			Thread.sleep(1);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		list1.add(rd.nextInt(0,100));
		
	}
	
	public synchronized void list2DegerEkle() {
		try {
			Thread.sleep(1);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		list2.add(rd.nextInt(0,100));
		
	}
	
	public void listtelereDegerEkle() {
		for(int i = 0 ; i <500 ; i++) {
			list1DegerEkle();
			list2DegerEkle();
			}
		
	}
	
	
	public void threadlerOlustur() {
		Thread thread1 = new Thread(new Runnable() {
			
			@Override
			public void run() {
				listtelereDegerEkle();
				
			}
		});
		
		Thread thread2 = new Thread(new Runnable() {
			
			@Override
			public void run() {
				listtelereDegerEkle();
				
			}
		});
		long baslangic = System.currentTimeMillis();
		
		
		thread1.start();
		thread2.start();
		
		try {
			thread1.join();
			thread2.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		long bitis = System.currentTimeMillis();
		
		System.out.println("list1 size: " + list1.size()+ " list2 size: " + list2.size());
		System.out.println("Toplam sure : " + (bitis - baslangic));
	}
}
	
