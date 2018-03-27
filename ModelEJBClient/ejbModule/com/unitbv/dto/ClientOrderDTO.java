package com.unitbv.dto;

import java.io.Serializable;
import java.util.Date;

public class ClientOrderDTO implements Serializable{

	private static final long serialVersionUID = 1L;

	public int id;
	
	public Date date;

	public String orderNo;

	public int idClientb2b;
	
	public ClientOrderDTO() {}
	
	public ClientOrderDTO(Date date, String orderNo, int idClientb2b) {
		this.date = date;
		this.orderNo = orderNo;
		this.idClientb2b = idClientb2b;
	}
}
