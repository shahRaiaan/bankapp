package com.remotetiger.bankapp;

class Customer extends AbstractCustomer {

	Address address;
	Login login;

	public Customer(int id, String name, String dateofbirth, Address address, Login login) {
		super(id, name, dateofbirth);
		this.address = address;
		this.login = login;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public Login getLogin() {
		return login;
	}

	public void setLogin(Login login) {
		this.login = login;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Customer [address=");
		builder.append(address.toString());
		builder.append(", login=");
		builder.append(login.toString());
		builder.append("]");
		return builder.toString();
	}

}
