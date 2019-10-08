package com.tts.Artist.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.tts.Artist.model.Artist;
import com.tts.Artist.service.ArtistServiceImpl;

@RestController
public class MainController {
	@Autowired
	ArtistServiceImpl artistServiceImpl;
	
	@GetMapping("/")
	public Artist getArtist(Long id) {
		return artistServiceImpl.getSingleArtistById(id);
	}
	
	@PostMapping("/")
	@ResponseBody
	public ArrayList<Artist> displayArtist(Artist artist) {
		artistServiceImpl.saveArtist(artist);
		return artistServiceImpl.saveAll(artist);
	}
	@DeleteMapping
	
	
	
	@PutMapping
}



