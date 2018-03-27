package com.unitbv.dto;

import java.io.Serializable;

public class WineDTO implements Serializable{
	
	private static final long serialVersionUID = 1L;

	public int id;

	public String description;

	public String name;

	public WineType type;

	public String variety;

	public int year;
	
	public WineDTO(String name, String description, WineType type, String variety, int year) {
		this.name = name;
		this.description = description;
		this.type = type;
		this.variety = variety;
		this.year= year;
	}
	
	public WineDTO()
{}
	}
