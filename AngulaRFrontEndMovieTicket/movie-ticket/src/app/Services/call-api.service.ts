import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import {API_URL} from './constantapp';

@Injectable({
  providedIn: 'root'
})
export class CallApiService {

  constructor(private http: HttpClient) { }

  getMovieOptions(){
    return this.http.post(`${API_URL}/ticketBooking/listofMovies`,{ responseType: 'text'});
  }

  listofMoviesOpt1(){
    return this.http.post(`${API_URL}/ticketBooking/listofMoviesOpt1`,null);
  }

  listofMoviesOpt2(){
    return this.http.post(`${API_URL}/ticketBooking/listofMoviesOpt2`,null);
  }

  listofMoviesOpt3(){
    return this.http.post(`${API_URL}/ticketBooking/listofMoviesOpt3`,null);
  }

  PaymentProcessingMovie_name(movieSelected:String){
    return this.http.post(`${API_URL}/ticketBooking/PaymentProcessingMovie_name/${movieSelected}`,null);
  }

  
  getTicketclass(classSelected:String){
    return this.http.post(`${API_URL}/ticketBooking/getTicketclass/${classSelected}`,null);
  }

  sendTicketNumber(ticketNum: number){
    return this.http.post(`${API_URL}/ticketBooking/ticketNum/${ticketNum}`,null);
  }

  startBooking(){
    return this.http.post(`${API_URL}/ticketBooking/startBooking`,null);
  }

}
