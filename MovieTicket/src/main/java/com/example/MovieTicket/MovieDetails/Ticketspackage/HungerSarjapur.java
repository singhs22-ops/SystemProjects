package com.example.MovieTicket.MovieDetails.Ticketspackage;

public class HungerSarjapur {

	public HungerSarjapur() {
		// TODO Auto-generated constructor stub
	}
	public int sarjapurHunger[][] = new int[3][10];
	public int[][] getSarjapurHunger() {
		return sarjapurHunger;
	}
	public void setSarjapurHunger(int[][] sarjapurHunger) {
		this.sarjapurHunger = sarjapurHunger;
	}

	
	public boolean getGoldBooking(int n) {
		
		System.out.println("Ticketselected-gold booking");
		for(int i=0;i<30;i++) {
			System.out.println(" tic"+this.sarjapurHunger[2][i]);
			if(this.sarjapurHunger[2][i]==0) {
				if(i+n<30) {
					for(int j=i;j<n+1;j++) {
						this.sarjapurHunger[2][j]=1;
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
				System.out.println(" tic"+this.sarjapurHunger[i][j]);
				if(this.sarjapurHunger[i][j]==0) {
					if((i==1)&&(j+n>30)) {
						return false;
					}
					else {
						while(k<n) {
							this.sarjapurHunger[i][j]=1;
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
