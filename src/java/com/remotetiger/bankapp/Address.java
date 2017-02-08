package com.remotetiger.bankapp;

public class Address {

	String streetName;
	int houseNo;
	int zipcode;

	public Address(String streetName, int houseNo, int zipcode) {
		super();
		this.streetName = streetName;
		this.houseNo = houseNo;
		this.zipcode = zipcode;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder(super.toString());
		builder.append("Address [streetName=");
		builder.append(streetName);
		builder.append(", houseNo=");
		builder.append(houseNo);
		builder.append(", zipcode=");
		builder.append(zipcode);
		builder.append("]");
		return builder.toString();
	}

}
