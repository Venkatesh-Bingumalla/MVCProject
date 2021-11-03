package com.example.demo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class RegisterModel {
	@Id
	@Column(name="uname")
	String uname;
	
	@Column
	String fname;
	
	@Column
	String lname;
	
	@Column
	String pass;
	
	@Column
	double num;
	
	public String getUname() {
		return uname;
	}

	public void setUname(String uname) {
		this.uname = uname;
	}

	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public String getLname() {
		return lname;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}

	public String getPass() {
		return pass;
	}

	public void setPass(String pass) {
		this.pass = pass;
	}

	public double getNum() {
		return num;
	}

	public void setNum(double num) {
		this.num = num;
	}

	

}
