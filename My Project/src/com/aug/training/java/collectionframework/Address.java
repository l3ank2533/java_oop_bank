package com.aug.training.java.collectionframework;


public class Address {
	protected String address;
	protected String street;
	protected String district;
	protected String province;
	protected String zipcode;

	public Address(String address,String street,String district,String province,String zipcode){
		this.address = address;
		this.street = street;
		this.district = district;
		this.province = province;
		this.zipcode = zipcode;
	
		
	}

	public String getAddress() {
		return address;
	}


	public void setAddress(String address) {
		this.address = address;
	}


	public String getStreet() {
		return street;
	}


	public void setStreet(String street) {
		this.street = street;
	}


	public String getDistrict() {
		return district;
	}


	public void setDistrict(String district) {
		this.district = district;
	}


	public String getProvince() {
		return province;
	}


	public void setProvince(String province) {
		this.province = province;
	}


	public String getZipcode() {
		return zipcode;
	}


	public void setZipcode(String zipcode) {
		this.zipcode = zipcode;
		
	}
}