package com.dev.Product;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="Products")
@XmlAccessorType(XmlAccessType.FIELD)
public class Product {
	private int item;
	private String name;
	private String color;
	public Product(){
		
	}
	public Product(int item, String name, String color, String size, Address address) {
		super();
		this.item = item;
		this.name = name;
		this.color = color;
		this.size = size;
		this.address = address;
	}
	private String size;
	 private Address address;
	public int getItem() {
		return item;
	}
	public void setItem(int item) {
		this.item = item;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getSize() {
		return size;
	}
	public void setSize(String size) {
		this.size = size;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}

}
