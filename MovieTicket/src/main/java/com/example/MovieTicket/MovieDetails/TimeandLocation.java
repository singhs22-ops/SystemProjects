package com.example.MovieTicket.MovieDetails;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class TimeandLocation {

	public TimeandLocation() {
		// TODO Auto-generated constructor stub
		initializeMade();
		initializeMarry();
		initializeHunger();
	}
	
	public List<List<String>> timeOptions1 = new ArrayList<List<String>>();
	public List<List<String>> timeOptions2 = new ArrayList<List<String>>();
	public List<List<String>> timeOptions3 = new ArrayList<List<String>>();
	
	List<String> obj;
	
	public void initializeMade() {
	
		
		timeOptions1.add(Arrays.asList("10-12AM","Sarjapur"));
		timeOptions1.add(Arrays.asList("14-16PM","Bellandur"));
		timeOptions1.add(Arrays.asList("19-21PM","Whitefeild"));
	}
	public void initializeMarry() {
		timeOptions2.add(Arrays.asList("8-10AM","Sarjapur"));
		timeOptions2.add(Arrays.asList("12-14PM","Bellandur"));
		timeOptions2.add(Arrays.asList("18-20PM","Whitefeild"));
	}
	public void initializeHunger() {
		timeOptions3.add(Arrays.asList("15-17PM","Sarjapur"));
		timeOptions3.add(Arrays.asList("17-19PM","Bellandur"));
		timeOptions3.add(Arrays.asList("13-15PM","Whitefeild"));
	}
	
	public List<List<String>> getMade(){
		return this.timeOptions1;
	}

	public List<List<String>> getMarry(){
		return this.timeOptions2;
	}
	
	public List<List<String>> getHunger(){
		return this.timeOptions3;
	}
}
