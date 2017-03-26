package com.dev.Adapter;

public class Exec {

	public static void main(String[] args) {
		OldCustomer oldCustomer = new OldCustomer();
		oldCustomer.setName("Dev");
		oldCustomer.setAge("27");
		oldCustomer.setAddress("NW Schendel Ave,16335,97006,Beaverton");
		
		Customer cust = new CustomerAdapter(oldCustomer);
		System.out.println(cust.getName());
		System.out.println(cust.getAge());
		System.out.println(cust.getAddress());

	}

}
