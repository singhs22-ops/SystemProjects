package com.example.MovieTicket.MovieDetails;

public class ticketstatus {

	public ticketstatus() {
		// TODO Auto-generated constructor stub
	}
	
	private String ticketclass;
	public String getTicketclass() {
		return this.ticketclass;
	}
	public void setTicketclass(String ticketclass) {
		this.ticketclass = ticketclass;
	}

	//Let us assume there are 30 seats @each hall
	int sarjapurMade[][] = new int[3][10];
	int sarjapurMarry[][] = new int[3][10];
	int sarjapurHunger[][] = new int[3][10];
	
	int bellandurMade[][] = new int[3][10];
	int bellandurMarry[][] = new int[3][10];
	int bellandurHunger[][] = new int[3][10];
	
	
	int whitefeildMade[][] = new int[3][10];
	int whitefeildMarry[][] = new int[3][10];
	int whitefeildHunger[][] = new int[3][10];
	
	
}
