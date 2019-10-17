package com.tts.Artist.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.tts.Artist.model.Artist;
import com.tts.Artist.service.ArtistServiceImpl;

@RestController
public class MainController {
	@Autowired
	ArtistServiceImpl artistServiceImpl;
	
	@CrossOrigin(origins = "http://localhost:3000") 
	@GetMapping("/artist/{id}")
	public Artist getArtist(@PathVariable Long id) {
		return artistServiceImpl.getSingleArtistById(id);
	}
	
	@CrossOrigin(origins = "http://localhost:3000")
	@GetMapping("/artists")
	public ArrayList<Artist> getAllArtists(){
		return artistServiceImpl.getAll();
	}
	
	@CrossOrigin(origins = "http://localhost:3000") 
	@PostMapping("/artist")
	public void displayArtist(@RequestBody Artist artist) {
		 artistServiceImpl.saveArtist(artist);
	}
	
	@CrossOrigin(origins = "http://localhost:3000") 
	@DeleteMapping("/artist/{id}")
	public void deleteArtistById(@PathVariable Long id) {
		artistServiceImpl.deleteById(id);
	}
	
	@CrossOrigin(origins = "http://localhost:3000") 
	@PutMapping("/artist/{id}")
	public void updateArtistById(@PathVariable Long id, @RequestBody Artist artist) {
		artistServiceImpl.updateArtist(id, artist);
	}
}



