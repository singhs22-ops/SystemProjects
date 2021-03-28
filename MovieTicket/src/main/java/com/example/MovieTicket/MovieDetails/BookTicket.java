package com.example.MovieTicket.MovieDetails;

public class BookTicket {

	public BookTicket() {
		// TODO Auto-generated constructor stub
	}
	
	Bookfinaltickets bft = new Bookfinaltickets();
	ticketstatus bookn= new ticketstatus();
	
	
	private String ticketselected;
	String MovieName;
	String[] MovieSep;
	String[] TimeLoc;
	String time;
	String Loc;
	
	
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
	
	public void ticSelected() {
	
	MovieSep = ticketselected.split("@", 2);
	MovieName= MovieSep[0];
	TimeLoc = MovieSep[1].split(",",2);
	time = TimeLoc[0];
	Loc = TimeLoc[1];
	
	}
	
	public boolean startBooking() {
		if((MovieName =="Hunger")) {
			if((time=="15-17PM")&&(Loc=="Sarjapur")) {
				if(bookn.getTicketclass()=="Gold") {
					return bft.getGoldBooking(getNoSeats(), bookn.sarjapurHunger);
				}
				else
					return bft.getPremiumBooking(getNoSeats(), bookn.sarjapurHunger);
			}
			if((time=="17-19PM")&&(Loc=="Bellandur")) {
				
				if(bookn.getTicketclass()=="Gold") {
					return bft.getGoldBooking(getNoSeats(), bookn.bellandurHunger);
				}
				else
					return bft.getPremiumBooking(getNoSeats(),bookn.bellandurHunger);
			}
			if((time=="13-15PM")&&(Loc=="Whitefeild")) {
				
				if(bookn.getTicketclass()=="Gold") {
					return bft.getGoldBooking(getNoSeats(), bookn.whitefeildHunger);
				}
				else
					return bft.getPremiumBooking(getNoSeats(), bookn.whitefeildHunger);
			}
		}
		
		  if((MovieName =="Made")) {
				if((time=="10-12AM")&&(Loc=="Sarjapur")) {
					
					if(bookn.getTicketclass()=="Gold") {
						return bft.getGoldBooking(getNoSeats(), bookn.sarjapurMade);
					}
					else
						return bft.getPremiumBooking(getNoSeats(), bookn.sarjapurMade);
				
				}
				if((time=="14-16PM")&&(Loc=="Bellandur")) {
					
					if(bookn.getTicketclass()=="Gold") {
						return bft.getGoldBooking(getNoSeats(),bookn.bellandurMade);
					}
					else
						return bft.getPremiumBooking(getNoSeats(), bookn.bellandurMade);
				}
				if((time=="19-21PM")&&(Loc=="Whitefeild")) {
					
					if(bookn.getTicketclass()=="Gold") {
						return bft.getGoldBooking(getNoSeats(), bookn.whitefeildMade);
					}
					else
						return bft.getPremiumBooking(getNoSeats(), bookn.whitefeildMade);
				}
			}
			
			if((MovieName =="Marry")) {
				if((time=="8-10AM")&&(Loc=="Sarjapur")) {
					
					if(bookn.getTicketclass()=="Gold") {
						return bft.getGoldBooking(getNoSeats(), bookn.sarjapurMarry);
					}
					else
						return bft.getPremiumBooking(getNoSeats(), bookn.sarjapurMarry);
				}
				if((time=="12-14PM")&&(Loc=="Bellandur")) {
					
					if(bookn.getTicketclass()=="Gold") {
						return bft.getGoldBooking(getNoSeats(), bookn.bellandurMarry);
					}
					else
						return bft.getPremiumBooking(getNoSeats(), bookn.bellandurMarry);
				}
				if((time=="18-20PM")&&(Loc=="Whitefeild")) {
					if(bookn.getTicketclass()=="Gold") {
						return bft.getGoldBooking(getNoSeats(), bookn.whitefeildMarry);
					}
					else
						return bft.getPremiumBooking(getNoSeats(), bookn.whitefeildMarry);
				}
			}
			return false;
	}

}
