package com.netjstech.entities;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.Getter;
import lombok.Setter;



@Entity
@Getter
@Setter
@Table(name="movie")
public class Movie {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	
	@Column(name="movie_id")
	private int movieid;
	
	@Column(name="movie_name")
	private String moviename;
	
	
	@Column(name="movie_genre")
	private String moviegenre;
	
	@Column(name="movie_hours")
	private String movieHours;
	
	@Column(name="movie_language")
	private String movieLanguage;
	
	@Column(name="movie_description")
	private String movieDescription;
	
	
	@OneToOne(cascade=CascadeType.ALL,fetch=FetchType.LAZY)
	@JoinColumn(name="show_id")
	private Show show;
	
	@ManyToOne(cascade=CascadeType.ALL,fetch=FetchType.LAZY)
	private Theatre theatre;
	


	public int getMovieid() {
		return movieid;
	}


	public void setMovieid(int movieid) {
		this.movieid = movieid;
	}


	public String getMoviename() {
		return moviename;
	}


	public void setMoviename(String moviename) {
		this.moviename = moviename;
	}


	public String getMoviegenre() {
		return moviegenre;
	}


	public void setMoviegenre(String moviegenre) {
		this.moviegenre = moviegenre;
	}


	public String getMovieHours() {
		return movieHours;
	}


	public void setMovieHours(String movieHours) {
		this.movieHours = movieHours;
	}


	public String getMovieLanguage() {
		return movieLanguage;
	}


	public void setMovieLanguage(String movieLanguage) {
		this.movieLanguage = movieLanguage;
	}


	public String getMovieDescription() {
		return movieDescription;
	}


	public void setMovieDescription(String movieDescription) {
		this.movieDescription = movieDescription;
	}

	@JsonIgnore
	public Show getShow() {
		return show;
	}


	public void setShow(Show show) {
		this.show = show;
	}
	
	
	
	
}