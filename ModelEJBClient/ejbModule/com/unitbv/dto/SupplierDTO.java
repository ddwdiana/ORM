package com.unitbv.dto;

import java.io.Serializable;

public class SupplierDTO implements Serializable{

	private static final long serialVersionUID = 1L;

	public String nameWineCellar;
	
	public boolean visibility;
	
	public int age;
	
	public UserDetailsDTO userDetails;
	
	public SupplierDTO(String nameWineCellar, boolean visibility, int age, UserDetailsDTO userDetails) {
		this.nameWineCellar = nameWineCellar;
		this.visibility = visibility;
		this.age = age;
		this.userDetails = userDetails;
	}
	
	public SupplierDTO () {}
}
