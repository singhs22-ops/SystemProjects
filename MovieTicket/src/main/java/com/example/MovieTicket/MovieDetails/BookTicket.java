package com.example.MovieTicket.MovieDetails;

public class BookTicket {

	public BookTicket() {
		// TODO Auto-generated constructor stub
	}
	private String ticketselected;
	private int noSeats;
	public int getNoSeats() {
		return noSeats;
	}
	public void setNoSeats(int noSeats) {
		this.noSeats = noSeats;
	}
	public String getTicketselected() {
		return ticketselected;
	}
	public void setTicketselected(String ticketselected) {
		this.ticketselected = ticketselected;
		System.out.println(ticketselected);
	}

}
