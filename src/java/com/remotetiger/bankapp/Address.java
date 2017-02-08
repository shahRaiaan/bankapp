package com.remotetiger.bankapp;

 class Address {
	final int id;
	String streetname;
	int houseno;
	int zipcode;

	public Address(int id, String streetname, int houseno, int zipcode) {
		super();
		this.id = id;
		this.streetname = streetname;
		this.houseno = houseno;
		this.zipcode = zipcode;
	}

	public String getStreetname() {
		return streetname;
	}

	public void setStreetname(String streetname) {
		this.streetname = streetname;
	}

	public int getHouseno() {
		return houseno;
	}

	public void setHouseno(int houseno) {
		this.houseno = houseno;
	}

	public int getZipcode() {
		return zipcode;
	}

	public void setZipcode(int zipcode) {
		this.zipcode = zipcode;
	}

	public int getId() {
		return id;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder(super.toString());
		builder.append("Address [id=");
		builder.append(id);
		builder.append(", streetname=");
		builder.append(streetname);
		builder.append(", houseno=");
		builder.append(houseno);
		builder.append(", zipcode=");
		builder.append(zipcode);
		builder.append("]");
		return builder.toString();
	}
}
