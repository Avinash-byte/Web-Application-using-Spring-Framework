package com.avinash.spring.springCore.innerbeans;

public class Address {
	private int hno;
	private String streetName;
	private String city;
	public int getHno() {
		return hno;
	}
	@Override
	public String toString() {
		return "Address [hno=" + hno + ", streetName=" + streetName + ", city=" + city + "]";
	}
	public void setHno(int hno) {
		this.hno = hno;
	}
	public String getStreetName() {
		return streetName;
	}
	public void setStreetName(String streetName) {
		this.streetName = streetName;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	

}
