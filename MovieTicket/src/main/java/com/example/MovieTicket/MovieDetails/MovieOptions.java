package com.example.MovieTicket.MovieDetails;

import java.util.ArrayList;
import java.util.List;

public class MovieOptions {

	public MovieOptions() {
		// TODO Auto-generated constructor stub
		initialize();
	}
	
	public List<String> movieName = new ArrayList<String>();
	
	public void initialize() {
		movieName.add("Made");
		movieName.add("Marry");
		movieName.add("Hunger");
	}
	
	public List<String> getMovieArray(){
		return this.movieName;
	}
	

}
