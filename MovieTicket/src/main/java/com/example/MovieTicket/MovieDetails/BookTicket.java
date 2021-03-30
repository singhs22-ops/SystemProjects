package com.example.MovieTicket.MovieDetails;

public class BookTicket {

	public BookTicket() {
		// TODO Auto-generated constructor stub
	}
	
	Bookfinaltickets bft = new Bookfinaltickets();
	ticketstatus bookn = new ticketstatus();
	
	
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
	public int sarjapurMade[][] = new int[3][10];
	public int sarjapurMarry[][] = new int[3][10];
	public int sarjapurHunger[][] = new int[3][10];
	
	public int bellandurMade[][] = new int[3][10];
	public int bellandurMarry[][] = new int[3][10];
	public int bellandurHunger[][] = new int[3][10];
	
	
	public int whitefeildMade[][] = new int[3][10];
	public int whitefeildMarry[][] = new int[3][10];
	public int whitefeildHunger[][] = new int[3][10];
	
	
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
					return getGoldBooking(getNoSeats(), getSarjapurHunger());
					
				}
				else
					System.out.println("Hunger+15-17+Sarjapur+Premium");
					return getPremiumBooking(getNoSeats(), getSarjapurHunger());
					
			}
			if((this.getTime().equals("17-19PM"))&&(this.getLoc().equals("Bellandur"))) {
				
				if(this.getVclass().equals("Gold")) {
					System.out.println("12");
					return getGoldBooking(getNoSeats(), getBellandurHunger());
					
				}
				else
					System.out.println("12P");
					return getPremiumBooking(getNoSeats(),getBellandurHunger());
					
			}
			if((this.getTime().equals("13-15PM"))&&(this.getLoc().equals("Whitefeild"))) {
				
				if(this.getVclass().equals("Gold")) {
					return getGoldBooking(getNoSeats(), getWhitefeildHunger());
				}
				else
					return getPremiumBooking(getNoSeats(), getWhitefeildHunger());
			}
		}
		
		
		
		
		if((this.getMovieName().equals("Made"))) {
			
		  if((this.getTime().equals("10-12AM"))&&(this.getLoc().equals("Sarjapur"))) {
					
					if(this.getVclass().equals("Gold")) {
						return getGoldBooking(getNoSeats(), getSarjapurMade());
					}
					else
						return getPremiumBooking(getNoSeats(), getSarjapurMade());
				
				}
				if((this.getTime().equals("14-16PM"))&&(this.getLoc().equals("Bellandur"))) {
					
					if(this.getVclass().equals("Gold")) {
						return getGoldBooking(getNoSeats(),getBellandurMade());
					}
					else
						return getPremiumBooking(getNoSeats(), getBellandurMade());
				}
				if((this.getTime().equals("19-21PM"))&&(this.getLoc().equals("Whitefeild"))) {
					
					if(this.getVclass().equals("Gold")) {
						return getGoldBooking(getNoSeats(), getWhitefeildMade());
					}
					else
						return getPremiumBooking(getNoSeats(), getWhitefeildMade());
				}
		}

			
			if((this.getMovieName().equals("Marry"))) {
				if((this.getTime().equals("8-10AM"))&&(this.getLoc().equals("Sarjapur"))) {
					
					if(this.getVclass().equals("Gold")) {
						return getGoldBooking(getNoSeats(), getSarjapurMarry());
					}
					else
						return getPremiumBooking(getNoSeats(), getSarjapurMarry());
				}
				if((this.getTime().equals("12-14PM"))&&(this.getLoc().equals("Bellandur"))) {
					
					if(this.getVclass().equals("Gold")) {
						return getGoldBooking(getNoSeats(), getBellandurMarry());
					}
					else
						return getPremiumBooking(getNoSeats(), getBellandurMarry());
				}
				if((this.getTime().equals("18-20PM"))&&(this.getLoc().equals("Whitefeild"))) {
					if(this.getVclass().equals("Gold")) {
						return getGoldBooking(getNoSeats(), getWhitefeildMarry());
					}
					else
						return getPremiumBooking(getNoSeats(), getWhitefeildMarry());
				}
			}
		}
		catch(Exception e) {
			
		}
			return false;
	}
	
	
	
	
public boolean getGoldBooking(int n, int a[][]) {
		
		System.out.println("Ticketselected-gold booking");
		for(int i=0;i<30;i++) {
			System.out.println(" tic"+a[2][i]);
			if(a[2][i]==0) {
				if(i+n<30) {
					for(int j=i;j<n+1;j++) {
						a[2][j]=1;
					}
					return true;
				}
			}
			
		}
		return false;
	}
	
	public boolean getPremiumBooking(int n, int a[][]) {
		
		
		System.out.println("Ticketselected-Premium booking");
		for(int i=0;i<2;i++) {
			int k=0;
			for(int j=0;j<30;j++) {
				//getpremiumBooking
				if(a[i][j]==0) {
					if((i==1)&&(j+n>30)) {
						return false;
					}
					else {
						while(k<n) {
						a[i][j]=1;
						k++;
						}
					}
						
				}
				return true;
			}
			
		}
		
		return false;
	}

}
