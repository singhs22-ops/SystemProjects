package com.swiftGo.techCRUD.SwiftGoCRUD.Database;

public class Address {

	public Address() {
		// TODO Auto-generated constructor stub
	}

	public String street;
	public String suite;
	
	public String  city;
	public String  zipCode;

	public Geo latLong;

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getSuite() {
		return suite;
	}

	public void setSuite(String suite) {
		this.suite = suite;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getZipCode() {
		return zipCode;
	}

	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}

	public Geo getLatLong() {
		return latLong;
	}

	public void setLatLong(Geo latLong) {
		this.latLong = latLong;
	}
	
}
