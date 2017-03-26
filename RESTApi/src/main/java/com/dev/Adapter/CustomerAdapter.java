package com.dev.Adapter;

public class CustomerAdapter extends NewCustomer implements Customer {
	private OldCustomer oldCustomer;

	public CustomerAdapter(OldCustomer oldCustomer) {
		this.oldCustomer = oldCustomer;
		this.adapData();
	}

	private void adapData() {
		this.setName(oldCustomer.getName());
		this.setAge(Integer.valueOf(oldCustomer.getAge()));
		Address address = new Address();
		String[] oldAddress = oldCustomer.getAddress().split(",");
		
		address.setStreetName(oldAddress[0]);
		address.setHouseNumber(Integer.valueOf(oldAddress[1]));
		address.setPostalCode(Integer.valueOf(oldAddress[2]));
		address.setCity(oldAddress[2]);
		this.setAddress(address);
		
	}
		

}
