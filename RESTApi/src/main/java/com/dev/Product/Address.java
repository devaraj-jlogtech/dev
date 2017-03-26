package com.dev.Product;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
@XmlRootElement(name="Products")
@XmlAccessorType(XmlAccessType.FIELD)
public class Address {
	private String city;
	public Address(){
		
	}
	public Address(String city, String state, String zip) {
		super();
		this.city = city;
		this.state = state;
		this.zip = zip;
	}
	
	private String state;
	private String zip;
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getZip() {
		return zip;
	}
	public void setZip(String zip) {
		this.zip = zip;
	}

}
