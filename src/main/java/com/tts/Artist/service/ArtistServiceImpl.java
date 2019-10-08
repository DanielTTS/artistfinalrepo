package com.tts.Artist.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tts.Artist.model.Artist;
import com.tts.Artist.repository.ArtistRepository;

@Service
public class ArtistServiceImpl implements ArtistServiceInt {
	@Autowired
	private ArtistRepository artistRepository;
	
	@Override
	public Artist getSingleArtistById(Long id) {
		return artistRepository.findArtistById(id);
	}
	
	@Override
	public void saveArtist(Artist artist) {
		artistRepository.save(artist);
	}
	
	@Override
	public ArrayList<Artist> saveAll(Artist artist) {
		return artistRepository.findAll();
	}
}
