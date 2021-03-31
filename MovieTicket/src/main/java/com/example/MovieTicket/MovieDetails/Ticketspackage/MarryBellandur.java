package com.example.MovieTicket.MovieDetails.Ticketspackage;

public class MarryBellandur {

	public MarryBellandur() {
		// TODO Auto-generated constructor stub
	}
	
	public int bellandurMarry[][] = new int[3][10];
	

		public int[][] getBellandurMarry() {
				return bellandurMarry;
		}

		public void setBellandurMarry(int[][] bellandurMarry) {
			this.bellandurMarry = bellandurMarry;
		}

public boolean getGoldBooking(int n) {
		
		System.out.println("Ticketselected-gold booking");
		for(int i=0;i<30;i++) {
			System.out.println(" tic"+this.bellandurMarry[2][i]);
			if(this.bellandurMarry[2][i]==0) {
				if(i+n<30) {
					for(int j=i;j<n+1;j++) {
						this.bellandurMarry[2][j]=1;
					}
					return true;
				}
			}
			
		}
		return false;
	}
	
	public boolean getPremiumBooking(int n) {
		
		
		System.out.println("Ticketselected-Premium booking");
		for(int i=0;i<2;i++) {
			int k=0;
			for(int j=0;j<30;j++) {
				//getpremiumBooking
				System.out.println(" tic"+this.bellandurMarry[i][j]);
				if(this.bellandurMarry[i][j]==0) {
					if((i==1)&&(j+n>30)) {
						return false;
					}
					else {
						while(k<n) {
							this.bellandurMarry[i][j]=1;
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
