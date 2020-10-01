package com.example.videogameservice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.example.videogameservice.dto.FullVideogameInfo;
import com.example.videogameservice.dto.Videoconsole;
import com.example.videogameservice.dto.Videogame;

@RestController
@RequestMapping("/videogame")
public class VideogameController {
	@Autowired
	private List<Videogame> list;

	@Autowired
	private RestTemplate restTemplate;
	
	@RequestMapping(path = "/{id}", method = RequestMethod.GET, produces = "application/json")
	public FullVideogameInfo getInfo(@PathVariable("id") Integer id) {
		Videogame v = list.stream().filter(v1 -> v1.getId() == id).findFirst().orElse(null);
		FullVideogameInfo result = null;
		
		if (v != null) {
			Videoconsole c = restTemplate.getForObject("http://localhost:8080/videoconsole/" + v.getIdConsole(), Videoconsole.class);
			result = new FullVideogameInfo(v, c);
		}
		
		return result;
	}
}
