package com.example.MovieTicket.MovieDetails;

public class Bookfinaltickets {

	public Bookfinaltickets() {
		// TODO Auto-generated constructor stub
	}

	public boolean getGoldBooking(int n, int a[][]) {
		
		for(int i=0;i<30;i++) {
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
		
		for(int i=0;i<2;i++) {
			for(int j=0;j<30;j++) {
				//getpremiumBooking
				j++;
				return true;
			}
			
		}
		
		return false;
	}
}
