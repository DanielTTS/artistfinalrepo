package com.tts.Artist.repository;

import java.util.ArrayList;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.tts.Artist.model.Artist;

@Repository
public interface ArtistRepository extends CrudRepository<Artist, Long>{
 
	public Artist findArtistById(Long id);
	public ArrayList<Artist> findAll();
	
}
