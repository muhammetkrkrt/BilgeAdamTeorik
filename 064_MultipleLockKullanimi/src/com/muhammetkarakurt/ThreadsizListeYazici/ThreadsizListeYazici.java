package com.muhammetkarakurt.ThreadsizListeYazici;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Random;

public class ThreadsizListeYazici {

	ArrayList<Integer> list1 = new ArrayList<>();
	ArrayList<Integer> list2 = new ArrayList<>();
	
	Random rd = new Random();
	
	
	public void list1DegerEkle() {
		try {
			Thread.sleep(1);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		list1.add(rd.nextInt(0,100));
		
	}
	
	public void list2DegerEkle() {
		try {
			Thread.sleep(1);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		list2.add(rd.nextInt(0,100));
		
	}
	
	public void listtelereDegerEkle() {
		for(int i = 0 ; i <1001 ; i++) {
			list1DegerEkle();
			list2DegerEkle();
			}
		System.out.println("list1 size: " + list1.size()+ " list2 size: " + list2.size());
	}
}
	
