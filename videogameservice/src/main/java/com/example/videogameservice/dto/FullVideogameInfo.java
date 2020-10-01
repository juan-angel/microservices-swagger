package com.example.videogameservice.dto;

public class FullVideogameInfo {
	private Videogame videogame;
	private Videoconsole videoconsole;
	
	public FullVideogameInfo() {
		// TODO Auto-generated constructor stub
	}
	
	public FullVideogameInfo(Videogame videogame, Videoconsole videoconsole) {
		super();
		this.videogame = videogame;
		this.videoconsole = videoconsole;
	}

	public Videogame getVideogame() {
		return videogame;
	}
	public void setVideogame(Videogame videogame) {
		this.videogame = videogame;
	}
	public Videoconsole getVideoconsole() {
		return videoconsole;
	}
	public void setVideoconsole(Videoconsole videoconsole) {
		this.videoconsole = videoconsole;
	}
	
	
}
