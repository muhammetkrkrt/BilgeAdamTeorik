package com.muhammetkarakurt;

import java.util.Objects;

public class Kisi {

	private int id ;
	private String ad;
	
	public Kisi(int id, String ad) {
		super();
		this.id = id;
		this.ad = ad;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getAd() {
		return ad;
	}

	public void setAd(String ad) {
		this.ad = ad;
	}
	
	
	public int hashCode() {
		
		return Objects.hash(id ,ad);
	}
	
	
	
}
