package com.tts.Artist.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Artist {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	
	private Long id;
	private String artistName;			
	private String albumName;
	private Integer albumYear;
	
	public Artist(String artistName, String albumName, Integer albumYear) {
		this.artistName = artistName;
		this.albumName = albumName;
		this.albumYear = albumYear;
	}
	
	public Artist() {}

	public String getArtistName() {
		return artistName;
	}

	public void setArtistName(String artistName) {
		this.artistName = artistName;
	}

	public String getAlbumName() {
		return albumName;
	}

	public void setAlbumName(String albumName) {
		this.albumName = albumName;
	}

	public Integer getAlbumYear() {
		return albumYear;
	}

	public void setAlbumYear(Integer albumYear) {
		this.albumYear = albumYear;
	}

	@Override
	public String toString() {
		return "Artist [artistName=" + artistName + ", albumName=" + albumName + ", albumYear=" + albumYear + "]";
	}
	
	
	
}	
