package com.remotetiger.bankapp;

 class AbstractCustomer {
	final int id;
	String name;
	String dateofbirth;

	public AbstractCustomer(int id){
		this.id = id;
	}
	
	public AbstractCustomer(int id, String name, String dateofbirth) {
		super();
		this.id = id;
		this.name = name;
		this.dateofbirth = dateofbirth;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("AbstractCustomer [id=");
		builder.append(id);
		builder.append(", name=");
		builder.append(name);
		builder.append(", dateofbirth=");
		builder.append(dateofbirth);
		builder.append("]");
		return builder.toString();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDateofbirth() {
		return dateofbirth;
	}

	public void setDateofbirth(String dateofbirth) {
		this.dateofbirth = dateofbirth;
	}

	public int getId() {
		return id;
	}
}
