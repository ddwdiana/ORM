package com.unitbv.dto;

import java.io.Serializable;

public class UserDetailsDTO implements Serializable{

	private static final long serialVersionUID = 1L;

	public int idUser;

	public String address;

	public String dType;

	public String email;

	public String password;

	public String username;
	
	public UserDetailsDTO(String address, String email, String password, String username) {
		this.address = address;
		this.email = email;
		this.password = password;
		this.username = username;
	}
	
	public UserDetailsDTO() {}
}
