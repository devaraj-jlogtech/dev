/**
 * 
 */
package com.dev;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * @author Sri
 *
 */
@Entity
public class User {
	@Id
	private String id;
	private String uname;
	private String uage;
	private String utech;
	
	public User(String id, String uname, String uage, String utech) {
		super();
		this.id = id;
		this.uname = uname;
		this.uage = uage;
		this.utech = utech;
	}
	public User() {
		// TODO Auto-generated constructor stub
	}
	/**
	 * @return the id
	 */
	public String getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(String id) {
		this.id = id;
	}
	/**
	 * @return the uname
	 */
	public String getUname() {
		return uname;
	}
	/**
	 * @param uname the uname to set
	 */
	public void setUname(String uname) {
		this.uname = uname;
	}
	/**
	 * @return the uage
	 */
	public String getUage() {
		return uage;
	}
	/**
	 * @param uage the uage to set
	 */
	public void setUage(String uage) {
		this.uage = uage;
	}
	/**
	 * @return the utech
	 */
	public String getUtech() {
		return utech;
	}
	/**
	 * @param utech the utech to set
	 */
	public void setUtech(String utech) {
		this.utech = utech;
	}

}
