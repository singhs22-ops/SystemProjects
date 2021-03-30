package com.example.MovieTicket.MovieDetails;

public class ticketstatus {

	public ticketstatus() {
		// TODO Auto-generated constructor stub
	}
	
	public String ticketclass="";

	//Let us assume there are 30 seats @each hall
	public int sarjapurMade[][] = new int[3][10];
	public int sarjapurMarry[][] = new int[3][10];
	public int sarjapurHunger[][] = new int[3][10];
	
	public int bellandurMade[][] = new int[3][10];
	public int bellandurMarry[][] = new int[3][10];
	public int bellandurHunger[][] = new int[3][10];
	
	
	public int whitefeildMade[][] = new int[3][10];
	public int whitefeildMarry[][] = new int[3][10];
	public int whitefeildHunger[][] = new int[3][10];
	

	public String getTicketclass() {
		return ticketclass;
	}
	public void setTicketclass(String ticketclass) {
		this.ticketclass = ticketclass;
		System.out.println("Ticket class+ "+this.ticketclass );
	}

	public int[][] getSarjapurMade() {
		return sarjapurMade;
	}
	public void setSarjapurMade(int[][] sarjapurMade) {
		this.sarjapurMade = sarjapurMade;
	}
	public int[][] getSarjapurMarry() {
		return sarjapurMarry;
	}
	public void setSarjapurMarry(int[][] sarjapurMarry) {
		this.sarjapurMarry = sarjapurMarry;
	}
	public int[][] getSarjapurHunger() {
		return sarjapurHunger;
	}
	public void setSarjapurHunger(int[][] sarjapurHunger) {
		this.sarjapurHunger = sarjapurHunger;
	}
	public int[][] getBellandurMade() {
		return bellandurMade;
	}
	public void setBellandurMade(int[][] bellandurMade) {
		this.bellandurMade = bellandurMade;
	}
	public int[][] getBellandurMarry() {
		return bellandurMarry;
	}
	public void setBellandurMarry(int[][] bellandurMarry) {
		this.bellandurMarry = bellandurMarry;
	}
	public int[][] getBellandurHunger() {
		return bellandurHunger;
	}
	public void setBellandurHunger(int[][] bellandurHunger) {
		this.bellandurHunger = bellandurHunger;
	}
	public int[][] getWhitefeildMade() {
		return whitefeildMade;
	}
	public void setWhitefeildMade(int[][] whitefeildMade) {
		this.whitefeildMade = whitefeildMade;
	}
	public int[][] getWhitefeildMarry() {
		return whitefeildMarry;
	}
	public void setWhitefeildMarry(int[][] whitefeildMarry) {
		this.whitefeildMarry = whitefeildMarry;
	}
	public int[][] getWhitefeildHunger() {
		return whitefeildHunger;
	}
	public void setWhitefeildHunger(int[][] whitefeildHunger) {
		this.whitefeildHunger = whitefeildHunger;
	}

	
	
}
