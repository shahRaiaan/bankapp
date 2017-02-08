package com.remotetiger.bankapp;

public class AbstractCustomer {

	int id;
	String name;
	String dateOfBirth;
	Address address;

	public int getId() {
		return id;
	}


	public String getName() {
		return name;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("AbstractCustomer [id=");
		builder.append(id);
		builder.append(", name=");
		builder.append(name);
		builder.append(", dateOfBirth=");
		builder.append(dateOfBirth);
		builder.append(", address=");
		builder.append(address.toString());
		builder.append("]");
		return builder.toString();
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

}
