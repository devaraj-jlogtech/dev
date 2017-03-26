package com.dev;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Employe {
	@Id
	private int empId;
	private String empName;
	private String empExp;
	private String empSal;
	private String empRole;
	
	public Employe(){
		
	}
	/**
	 * @return the empId
	 */
	public int getEmpId() {
		return empId;
	}
	public Employe(int empId, String empName, String empExp, String empSal, String empRole) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.empExp = empExp;
		this.empSal = empSal;
		this.empRole = empRole;
	}
	/**
	 * @param empId the empId to set
	 */
	public void setEmpId(Integer empId) {
		this.empId = empId;
	}
	/**
	 * @return the empName
	 */
	public String getEmpName() {
		return empName;
	}
	/**
	 * @param empName the empName to set
	 */
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	/**
	 * @return the empExp
	 */
	public String getEmpExp() {
		return empExp;
	}
	/**
	 * @param empExp the empExp to set
	 */
	public void setEmpExp(String empExp) {
		this.empExp = empExp;
	}
	/**
	 * @return the empSal
	 */
	public String getEmpSal() {
		return empSal;
	}
	/**
	 * @param empSal the empSal to set
	 */
	public void setEmpSal(String empSal) {
		this.empSal = empSal;
	}
	/**
	 * @return the empRole
	 */
	public String getEmpRole() {
		return empRole;
	}
	/**
	 * @param empRole the empRole to set
	 */
	public void setEmpRole(String empRole) {
		this.empRole = empRole;
	}

}
