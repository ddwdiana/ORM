package com.unitbv.dto;

import java.io.Serializable;

public class StockClientB2BDTO implements Serializable{

	private static final long serialVersionUID = 1L;

	public int id;
	
	public int price;
	
	public int quantity;

	public boolean active;
	
	public int limitQuanity;

	public int idClientB2B;
	
	public StockClientB2BDTO(int id, int price, int quantity, boolean active, int limitQuantity, int idClientB2B) {
		this.id = id;
		this.price = price;
		this.quantity = quantity;
		this.active = active;
		this.limitQuanity = limitQuantity;
		this.idClientB2B = idClientB2B;
	}
	
	public StockClientB2BDTO() {}
}
