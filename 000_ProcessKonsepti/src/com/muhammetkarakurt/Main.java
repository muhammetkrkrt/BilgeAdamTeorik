package com.muhammetkarakurt;

public class Main {

	public static void main(String[] args) {
		
		int x = 10 ;
		for (int i = 0; i <= 10; i++) {
			
			try {
				Thread.sleep(100);
			} catch (Exception e) {
				// TODO: handle exception
			}
			System.out.println(x++);
		}
          
	}

}
