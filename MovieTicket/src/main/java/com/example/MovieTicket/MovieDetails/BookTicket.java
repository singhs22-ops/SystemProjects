package com.example.MovieTicket.MovieDetails;

import com.example.MovieTicket.MovieDetails.Ticketspackage.HungerBellandur;
import com.example.MovieTicket.MovieDetails.Ticketspackage.HungerSarjapur;
import com.example.MovieTicket.MovieDetails.Ticketspackage.HungerWhitefeild;
import com.example.MovieTicket.MovieDetails.Ticketspackage.MadeBellandur;
import com.example.MovieTicket.MovieDetails.Ticketspackage.MadeSarjapur;
import com.example.MovieTicket.MovieDetails.Ticketspackage.MadeWhitefeild;
import com.example.MovieTicket.MovieDetails.Ticketspackage.MarryBellandur;
import com.example.MovieTicket.MovieDetails.Ticketspackage.MarrySarjapur;
import com.example.MovieTicket.MovieDetails.Ticketspackage.MarryWhitefeild;

public class BookTicket {

	public BookTicket() {
		// TODO Auto-generated constructor stub
	}
	
	Bookfinaltickets bft = new Bookfinaltickets();
	ticketstatus bookn = new ticketstatus();
	HungerSarjapur hS = new HungerSarjapur();
	HungerBellandur hB = new HungerBellandur();
	HungerWhitefeild hW = new HungerWhitefeild();
	
	MadeSarjapur mS = new MadeSarjapur();
	MadeBellandur mB = new MadeBellandur();
	MadeWhitefeild mW =new MadeWhitefeild();
	
	MarrySarjapur m1S = new MarrySarjapur();
	MarryBellandur m1B = new MarryBellandur();
	MarryWhitefeild m1W = new MarryWhitefeild();
	
	
	public String ticketselected;
	public String vclass;
	public String getVclass() {
		return vclass;
	}
	public void setVclass(String vclass) {
		this.vclass = vclass;
	}

	public String MovieName;
	public String[] MovieSep;
	public String[] TimeLoc;
	public String time;
	public String Loc;
	
	//Let us assume there are 30 seats @each hall
	

	public String getMovieName() {
		return MovieName;
	}
	public void setMovieName(String movieName) {
		MovieName = movieName;
	}
	public String[] getMovieSep() {
		return MovieSep;
	}
	public void setMovieSep(String[] movieSep) {
		MovieSep = movieSep;
	}
	public String[] getTimeLoc() {
		return TimeLoc;
	}
	public void setTimeLoc(String[] timeLoc) {
		TimeLoc = timeLoc;
	}
	public String getTime() {
		return time;
	}
	public void setTime(String time) {
		this.time = time;
	}
	public String getLoc() {
		return Loc;
	}
	public void setLoc(String loc) {
		Loc = loc;
	}

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
		System.out.println("Ticketselected-BookTickets"+ticketselected);
	}
	
	public boolean ticSelected() {
		
		//String Tickseled =getTicketselected();
	if(this.ticketselected!=null) {
		try {
		MovieSep = this.ticketselected.split("@", 2);
		setMovieName(MovieSep[0]);
		TimeLoc = MovieSep[1].split(",",2);
		setTime(TimeLoc[0]);
		setLoc(TimeLoc[1]);
		System.out.println("Value of class"+this.vclass);
		return true;
		}
		catch(Exception e) {
			
			System.out.println(e.getMessage()+ "Line 155");
			
		}
	}
		
		return false;
	
	}
	
	public boolean startBooking() {
		if(ticSelected()==false) {
			return false;
		}
		
		try {
		if((this.getMovieName().equals("Hunger"))) {
			
			if( (this.getTime().equals("15-17PM")) && (this.getLoc().equals("Sarjapur")))
			{
				if(this.getVclass().equals("Gold")) {
					System.out.println("Hunger+15-17+Sarjapur");
					return hS.getGoldBooking(getNoSeats());
					
				}
				else
					System.out.println("Hunger+15-17+Sarjapur+Premium");
					return hS.getPremiumBooking(getNoSeats());
					
			}
			if((this.getTime().equals("17-19PM"))&&(this.getLoc().equals("Bellandur"))) {
				
				if(this.getVclass().equals("Gold")) {
					System.out.println("12");
					return hB.getGoldBooking(getNoSeats());
					
				}
				else
					System.out.println("12P");
					return hB.getPremiumBooking(getNoSeats());
					
			}
			if((this.getTime().equals("13-15PM"))&&(this.getLoc().equals("Whitefeild"))) {
				
				if(this.getVclass().equals("Gold")) {
					return hW.getGoldBooking(getNoSeats());
				}
				else
					return hW.getPremiumBooking(getNoSeats());
			}
		}
		
		
		
		
		if((this.getMovieName().equals("Made"))) {
			
		  if((this.getTime().equals("10-12AM"))&&(this.getLoc().equals("Sarjapur"))) {
					
					if(this.getVclass().equals("Gold")) {
						return mS.getGoldBooking(getNoSeats());
					}
					else
						return mS.getPremiumBooking(getNoSeats());
				
				}
				if((this.getTime().equals("14-16PM"))&&(this.getLoc().equals("Bellandur"))) {
					
					if(this.getVclass().equals("Gold")) {
						return mB.getGoldBooking(getNoSeats());
					}
					else
						return mB.getPremiumBooking(getNoSeats());
				}
				if((this.getTime().equals("19-21PM"))&&(this.getLoc().equals("Whitefeild"))) {
					
					if(this.getVclass().equals("Gold")) {
						return mW.getGoldBooking(getNoSeats());
					}
					else
						return mW.getPremiumBooking(getNoSeats());
				}
		}

			
			if((this.getMovieName().equals("Marry"))) {
				if((this.getTime().equals("8-10AM"))&&(this.getLoc().equals("Sarjapur"))) {
					
					if(this.getVclass().equals("Gold")) {
						return m1S.getGoldBooking(getNoSeats());
					}
					else
						return m1S.getPremiumBooking(getNoSeats());
				}
				if((this.getTime().equals("12-14PM"))&&(this.getLoc().equals("Bellandur"))) {
					
					if(this.getVclass().equals("Gold")) {
						return m1B.getGoldBooking(getNoSeats());
					}
					else
						return m1B.getPremiumBooking(getNoSeats());
				}
				if((this.getTime().equals("18-20PM"))&&(this.getLoc().equals("Whitefeild"))) {
					if(this.getVclass().equals("Gold")) {
						return m1W.getGoldBooking(getNoSeats());
					}
					else
						return m1W.getPremiumBooking(getNoSeats());
				}
			}
		}
		catch(Exception e) {
			System.out.println(e.getMessage()+ "Line 264 BT");
			
		}
			return false;
	}
	
	
}
