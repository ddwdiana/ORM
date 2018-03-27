package com.unitbv.dto;

import java.io.Serializable;

public class ClientB2BDTO implements Serializable{

	private static final long serialVersionUID = 1L;

	public boolean visibility;
	
	public String companyName;
	
	public String CUI;
	
	public boolean subscribed;
	
	public UserDetailsDTO userDetails;
	
	public ClientB2BDTO() {}
	
	public ClientB2BDTO(boolean visibility, String companyName, String CUI, boolean subscribed, UserDetailsDTO userDetails) {
		this.visibility = visibility;
		this.companyName = companyName;
		this.CUI = CUI;
		this.subscribed = subscribed;
		this.userDetails = userDetails;
	}
}
