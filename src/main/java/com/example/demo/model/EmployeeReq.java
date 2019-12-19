package com.example.demo.model;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;


public class EmployeeReq {

	private int emp_id;
	
	private String emp_name;
	
	private String tech;
	
	/**
	 * @return the emp_id
	 */
	public int getEmp_id() {
		return emp_id;
	}

	/**
	 * @param emp_id the emp_id to set
	 */
	public void setEmp_id(int emp_id) {
		this.emp_id = emp_id;
	}

	/**
	 * @return the emp_name
	 */
	public String getEmp_name() {
		return emp_name;
	}

	/**
	 * @param emp_name the emp_name to set
	 */
	public void setEmp_name(String emp_name) {
		this.emp_name = emp_name;
	}

	/**
	 * @return the tech
	 */
	public String getTech() {
		return tech;
	}

	/**
	 * @param tech the tech to set
	 */
	public void setTech(String tech) {
		this.tech = tech;
	}


}
