package com.unitbv.dto;

import java.io.Serializable;
import java.util.Date;


public class ClientB2CDTO implements Serializable{
	
	private static final long serialVersionUID = 1L;

	public String firstName;
	
	public String lastName;
	
	public Date dateRegister;

	public String CNP;
	
	public UserDetailsDTO userDetails;

	public ClientB2CDTO(String firstName, String lastName, Date dateRegister, String CNP, UserDetailsDTO userDetails) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.dateRegister = dateRegister;
		this.CNP = CNP;
		this.userDetails = userDetails;
	}
	
	public ClientB2CDTO() {}
}
