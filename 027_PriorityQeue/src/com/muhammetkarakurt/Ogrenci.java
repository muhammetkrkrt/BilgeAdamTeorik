package com.muhammetkarakurt;

public class Ogrenci implements Comparable<Ogrenci> {

	private String ad;
	private int id;

	public Ogrenci(String ad, int id) {
		super();
		this.ad = ad;
		this.id = id;
	}

	public String getAd() {
		return ad;
	}

	public void setAd(String ad) {
		this.ad = ad;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "Ogrenci [ad=" + ad + ", id=" + id + "]";
	}
	// suan ki ogrencimizle parametre olarak glen ogrenci nesnesinin
	// karsilastirilmasi burada yapilir

	public int compareTo(Ogrenci o) {
		if (this.id < o.id)
			return -1;
		else if (this.id > o.id) {
			return 1;
		} else {
			return 0;
		}
	}
}
