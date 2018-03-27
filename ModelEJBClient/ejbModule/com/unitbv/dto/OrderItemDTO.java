package com.unitbv.dto;

import java.io.Serializable;

public class OrderItemDTO implements Serializable{

	private static final long serialVersionUID = 1L;

	public int id;

	public int amount;

	public int price;

	public int idOrder;
	
	public int idStockClientB2B;
	
	public OrderItemDTO() {}
	
	public OrderItemDTO(int amount, int price, int idOrder, int idStockClientB2B) {
		this.amount = amount;
		this.price = price;
		this.idOrder = idOrder;
		this.idStockClientB2B = idStockClientB2B;
	}
}
