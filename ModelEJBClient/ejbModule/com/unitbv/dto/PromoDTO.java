package com.unitbv.dto;

import java.io.Serializable;
import java.util.Date;

public class PromoDTO implements Serializable{

	private static final long serialVersionUID = 1L;

	public int id;
	
	public int discount;

	public Date endDate;

	public Date startDate;
	
	public PromoDTO(int id, int discount, Date startDate, Date endDate) {
		this.id = id;
		this.discount = discount;
		this.startDate = startDate;
		this.endDate = endDate;
	}
	
	public PromoDTO() {}
}
