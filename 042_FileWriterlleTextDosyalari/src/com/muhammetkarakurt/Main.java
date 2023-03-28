package com.muhammetkarakurt;

import java.io.FileWriter;
import java.io.IOException;

public class Main {
	
	//FileWriter ile sadece text dosyalari yazilabilir
	//write() metodunun icine direk String verilebilir.
	

	public static void main(String[] args) {


		FileWriter fileWriter = null ;
		
		try {
			fileWriter = new FileWriter("dosya.txt",true);
			
			
			fileWriter.write("Muhammet");
			
		} catch (IOException e) {
			System.out.println("Dosya acilirken veya yazarken hata olustu");
			e.printStackTrace();
		}finally {
			if (fileWriter != null) {
				try {
					fileWriter.close();
				} catch (IOException e) {
					System.out.println("Dosya acilirken veya yazarken hata olustu");
					e.printStackTrace();
				}
			}
		}
		

	}

}
