package com.example.videoconsoleservice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.videoconsoleservice.dto.Videoconsole;

@RestController
@RequestMapping("/videoconsole")
public class VideoconsoleController {
	@Autowired
	private List<Videoconsole> list;
	
	@RequestMapping(path = "/findAll", produces = "application/json", method = RequestMethod.GET)
	public List<Videoconsole> findAll() {
		return this.list;
	}
	
	@RequestMapping(path = "{id}", produces = "application/json", method = RequestMethod.GET)
	public Videoconsole findById(@PathVariable("id") Integer id) {
		Videoconsole v = this.list.stream().filter(v1 -> v1.getId() == id).findFirst().orElse(null);
		
		return v;
	}
}
