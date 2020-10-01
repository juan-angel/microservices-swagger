package com.example.videogameservice.dto;

public class Videogame {
	private int id;
	private String name;
	private int idConsole;
	
	public Videogame() {
		// TODO Auto-generated constructor stub
	}
	
	
	
	public Videogame(int id, String name, int idConsole) {
		super();
		this.id = id;
		this.name = name;
		this.idConsole = idConsole;
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
	public int getIdConsole() {
		return idConsole;
	}
	public void setIdConsole(int idConsole) {
		this.idConsole = idConsole;
	}
	
	
}
