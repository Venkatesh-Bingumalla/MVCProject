package com.example.demo.model;

import java.math.BigInteger;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Program {
	
	@Id
	@Column
	BigInteger won;
	
	@Column
	String pname;

	public BigInteger getWon() {
		return won;
	}

	public void setWon(BigInteger won) {
		this.won = won;
	}

	public String getPname() {
		return pname;
	}

	public void setPname(String pname) {
		this.pname = pname;
	}
	
	
	
	

}
