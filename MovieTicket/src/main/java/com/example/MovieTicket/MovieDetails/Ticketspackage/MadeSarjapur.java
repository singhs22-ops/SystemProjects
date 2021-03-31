package com.example.MovieTicket.MovieDetails.Ticketspackage;

public class MadeSarjapur {

	public MadeSarjapur() {
		// TODO Auto-generated constructor stub
	}
	
	public int sarjapurMade[][] = new int[3][10];
	
	public int[][] getSarjapurMade() {
		return sarjapurMade;
	}

	public void setSarjapurMade(int[][] sarjapurMade) {
		this.sarjapurMade = sarjapurMade;
	}

	public boolean getGoldBooking(int n) {
		
		System.out.println("Ticketselected-gold booking");
		for(int i=0;i<30;i++) {
			System.out.println(" tic"+this.sarjapurMade[2][i]);
			if(this.sarjapurMade[2][i]==0) {
				if(i+n<30) {
					for(int j=i;j<n+1;j++) {
						this.sarjapurMade[2][j]=1;
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
				System.out.println(" tic"+this.sarjapurMade[i][j]);
				if(this.sarjapurMade[i][j]==0) {
					if((i==1)&&(j+n>30)) {
						return false;
					}
					else {
						while(k<n) {
							this.sarjapurMade[i][j]=1;
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
