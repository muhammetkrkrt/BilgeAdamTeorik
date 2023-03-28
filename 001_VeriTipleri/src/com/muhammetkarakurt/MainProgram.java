package com.muhammetkarakurt;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class MainProgram {

	public static void main(String[] args) {
      System.out.println("Hello Java 1");
	  System.out.println("Hello Java 2");
	  System.out.println("Hello Java 3");
	         byte byteValue = 2;
			 System.out.println(byteValue);
			 byteValue =1;
			 System.out.println(byteValue);

			 //1111111 0000000
			 //^sing bit
			 //en soldaki bit sign biti olarak görev yapar
			 //0 ise pozitif sayı. Örn:0000001:1 000000011:3
			 //01111111:127
			 //Byte'ın alabileceği değerlerin aralığı:-128 ile 127 arasında
			 byteValue=127;
			 //Short : 2 Byte
			 //-2^15 ile 2^15-1
			 //-32768 ile 32767 aralığında 
			 short shortValue=22;
			 short shorVal1=30 , shortVal2=244, shortVal3=3000 ;
			 shortValue=byteValue ;
			 System.out.println(shortValue);
			 //dolayısıyla byte'ın alabileceği max değerler dışında kullanamayız ..
			//int :4 Byte 
			 //-2^31 ile 2^31-1 arasında değer alır
			 System.out.println(Integer.MIN_VALUE);
			 System.out.println(Integer.MAX_VALUE);
			 int intValue=7;
			 int i1, i2, i3 ;
			
		     intValue = shortValue;
		     
		     
//		     //Byte Toplama
//		     byteValue=127
//		     byte b2 ;
		     short sh1 = 3 ;
		     short sh2 = 4 ;
		     short sh3 ;
		     sh3 = (short) (sh1 + sh2) ;
		     System.out.println("sh3: " + sh3);
		     
		     //Long :8 Byte
		     // -2^63 ile 2^63-1
		     long longValue = 7 ;
		     System.out.println(longValue);
		     int carpan=100000;
		     long carpim = carpim =1L *carpan * carpan ;
		     System.out.println("carpım:"+ carpim);
		     //long altçizgi kullanımı 
		     long x = 123_234_221L ;
		    	System.out.println("x:"+ x);
		     
		     
		     
		   
	}

}
