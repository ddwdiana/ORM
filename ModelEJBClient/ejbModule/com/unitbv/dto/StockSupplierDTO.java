package com.unitbv.dto;

import java.io.Serializable;

public class StockSupplierDTO implements Serializable{
	
	private static final long serialVersionUID = 1L;

	public int id;

	public int amount;

	public int price;

	public int idSupplier;

	public int idWine;

	public StockSupplierDTO(int id, int amount, int price, int idSupplier, int idWine) {
		this.id = id;
		this.amount = amount;
		this.price = price;
		this.idSupplier = idSupplier;
		this.idWine = idWine;
	}
	
	public StockSupplierDTO() {}
}
