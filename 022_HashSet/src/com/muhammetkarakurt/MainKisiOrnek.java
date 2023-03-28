package com.muhammetkarakurt;

import java.util.HashSet;

public class MainKisiOrnek {

	public static void main(String[] args) {
		
		Kisi kisi1 = new Kisi(1, "Ali");
		Kisi kisi2 = new Kisi(2, "Veli");
		Kisi kisi3 = new Kisi(3, "Cagri");
		
		
		HashSet<Kisi> hash = new HashSet<>();
		
		hash.add(kisi1);
		hash.add(kisi2);
		hash.add(kisi3);
		

	}

}
