package com.muhammetkarakurt;

import java.util.Scanner;

public class KullanicidanVeriAlma {

	public static void main(String[] args) {
	Scanner input=new Scanner(System.in);
	System.out.println("Lütefen bir tamsayı giriniz:");
	
	int x = input.nextInt();
	
	if (x > 0) {
		System.out.println("Girilen sayı pozitiftir!");
	}
	else if (x < 0) {
		System.out.println("Girilen sayı negatiftir!");
	}
	else if (x==0) {
		System.out.println("Girilen sayı nötr dür !");
	}
	 System.out.println("Hoşçakalın!!");
	
	}
	

}
