package com.example.MovieTicket.MovieTicket.restApi;

import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.MovieTicket.MovieDetails.ticketstatus;
import com.example.MovieTicket.MovieDetails.BookTicket;
import com.example.MovieTicket.MovieDetails.MovieOptions;
import com.example.MovieTicket.MovieDetails.TimeandLocation;

@CrossOrigin(origins="http://localhost:4200")
@RestController
@RequestMapping("/ticketBooking")
public class ApiEndPoints {

	public ApiEndPoints() {
		// TODO Auto-generated constructor stub
	}
	MovieOptions movieList= new MovieOptions();
	TimeandLocation time= new TimeandLocation();
	ticketstatus ticketstatus = new ticketstatus();
	BookTicket bt = new BookTicket();


	@GetMapping("/home")
	public String home1() {
		return "HHHHH";
	}
	
	@PostMapping("/listofMovies")
	public List<String> listofMovies(){

		return movieList.getMovieArray();
		
	}
	
	@PostMapping("/listofMoviesOpt1")
	public List<List<String>> listofMoviesOpt1(){
		return time.getMade();
		
	}
	
	@PostMapping("/listofMoviesOpt2")
	public List<List<String>> listofMoviesOpt2(){
		return time.getMarry();
		
	}
	
	@PostMapping("/listofMoviesOpt3")
	public List<List<String>> listofMoviesOpt3(){
		return time.getHunger();
	}
	
	@PostMapping("/getTicketclass/classV")
	public String getTicketclass(@PathVariable String classV) {
		ticketstatus.setTicketclass(classV);
		return "Done";
	}
	
	//PaymentProcessingMovie_name
	@PostMapping("/PaymentProcessingMovie_name/{ticketOpt}")
	public String PaymentProcessingMovie_name(@PathVariable String ticketOpt){
		bt.setTicketselected(ticketOpt);
		return "Done::->+"+ticketOpt;
	}
	
	@PostMapping("/ticketNum/{num}")
	public String ticketNum(@PathVariable int num) {
		bt.setNoSeats(num);
		return "Noted"+num;
	}
	@PostMapping("/startBooking")
	public boolean startBooking() {
		bt.startBooking();
		return true;
	}
	
}
