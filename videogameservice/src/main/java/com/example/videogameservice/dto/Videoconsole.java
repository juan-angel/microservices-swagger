package com.example.videogameservice.dto;

public class Videoconsole {
	private int id;
	private String name;
	private String manufacturer;
	
	public Videoconsole() {
		// TODO Auto-generated constructor stub
	}
	
	public Videoconsole(int id, String name, String manufacturer) {
		super();
		this.id = id;
		this.name = name;
		this.manufacturer = manufacturer;
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getManufacturer() {
		return manufacturer;
	}
	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}
	
	
}
