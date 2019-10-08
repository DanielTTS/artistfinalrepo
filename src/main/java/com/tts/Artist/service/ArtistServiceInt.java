package com.tts.Artist.service;

import java.util.ArrayList;

import com.tts.Artist.model.Artist;

public interface ArtistServiceInt {
	public Artist getSingleArtistById(Long id);
	public void saveArtist(Artist artist);
	public ArrayList<Artist> saveAll(Artist artist);

}
