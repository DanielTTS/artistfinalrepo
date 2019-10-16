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
	public ArrayList<Artist> getAll() {
		return artistRepository.findAll();
	}
	
	@Override
	public void saveArtist(Artist artist) {
		artistRepository.save(artist);
	}
	@Override
	public void deleteById(Long id) {
		artistRepository.deleteById(id);
		
	}
	@Override
	public void updateArtist(Long id, Artist artistChanges) {
		Artist currentArtist = artistRepository.findArtistById(id);
		String artistName = artistChanges.getArtistName();
		String albumName = artistChanges.getAlbumName();
		Integer albumYear = artistChanges.getAlbumYear();
		currentArtist.setArtistName(artistName);
		currentArtist.setAlbumName(albumName);
		currentArtist.setAlbumYear(albumYear);
		
		artistRepository.save(currentArtist);
	}
	

	
	
}
