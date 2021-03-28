import { Component, OnInit } from '@angular/core';
import { CallApiService } from 'src/app/Services/call-api.service';

@Component({
  selector: 'app-main-page',
  templateUrl: './main-page.component.html',
  styleUrls: ['./main-page.component.css']
})
export class MainPageComponent implements OnInit {

  constructor(private apihttp: CallApiService) { }
  MovieList: any;
  defaultactionType: String = "Made";
  movieSelected: String;
  SelectTimeandLocation: any;
  timelocationSelected: any;
  optionselecteddisplay: String = "No Option selected";
  confirm: boolean = false;
  classseleceted: String;
  ticketnumber: number;
  dataTobeSent: String;



  ngOnInit(): void {
  }

  getMovieOptions() {
    //window.alert("clicked");

    this.apihttp.getMovieOptions().subscribe(
      data => {
        console.log(data);
        this.MovieList = data;
        this.listofMoviesOpt1();
      },
      error => {
        console.log(error);
      }
    )
  }

  changeDefaultactionMovie(event) {
    this.movieSelected = event.target.value;
    console.log(this.movieSelected);

    if (this.movieSelected === "Made") {
      this.listofMoviesOpt1();
    }
    if (this.movieSelected === "Marry") {
      this.listofMoviesOpt2();
    }
    if (this.movieSelected === "Hunger") {
      this.listofMoviesOpt3();
    }
  }


  listofMoviesOpt1() {
    //window.alert("clicked");

    this.apihttp.listofMoviesOpt1().subscribe(
      data => {
        console.log(data);
        this.SelectTimeandLocation = data;
      },
      error => {
        console.log(error);
      }
    )
  }


  listofMoviesOpt2() {
    //window.alert("clicked");

    this.apihttp.listofMoviesOpt2().subscribe(
      data => {
        console.log(data);
        this.SelectTimeandLocation = data;
      },
      error => {
        console.log(error);
      }
    )
  }


  listofMoviesOpt3() {
    //window.alert("clicked");

    this.apihttp.listofMoviesOpt3().subscribe(
      data => {
        this.SelectTimeandLocation = data;
        console.log(data);
      },
      error => {
        console.log(error);
      }
    )
  }

  getTimeLocationData() {
    return this.SelectTimeandLocation;
  }

  changeselectedTimeLocation(event) {
    this.timelocationSelected = event.target.value;
    console.log(this.timelocationSelected);

    this.getoptionselecteddisplay;

  }

  changeTicketNumber(event) {
    this.ticketnumber = event.target.value;
    console.log(this.ticketnumber);
  }

  getoptionselecteddisplay() {
    this.optionselecteddisplay = this.movieSelected+"@" + this.timelocationSelected;
    console.log(this.optionselecteddisplay);
  }

  getConfirm() {
    this.confirm = true;
    this.dataTobeSent = this.optionselecteddisplay;
    this.PaymentProcessingMovie_name( this.optionselecteddisplay);

    console.log("AFTER CONFIRMATION"+ this.dataTobeSent);
    console.log(this.dataTobeSent);


  }

  changeMovieClass(event) {
    this.classseleceted = event.target.value;
    console.log(this.classseleceted);
  }


  PaymentProcessingMovie_name(optionselecteddisplay: String) {

    this.apihttp.PaymentProcessingMovie_name(optionselecteddisplay).subscribe(
      data => {
        console.log("DataReceived"+data);
      },
      error => {
        console.log(error);
      }
    )
  }

  changeDefaultactionMovieTimeandLocation(){

  }
}
