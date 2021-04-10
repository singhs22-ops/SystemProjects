
import style from './style.css';
import { Component, h,render } from 'preact';
import { Router } from 'preact-router';

const ROUTERS = [];

export class Home extends Component {



	re = new RegExp(/^(("[\w-\s]+")|([\w-]+(?:\.[\w-]+)*)|("[\w-\s]+")([\w-]+(?:\.[\w-]+)*))(@((?:[\w-]+\.)*\w[\w-]{0,66})\.([a-z]{2,6}(?:\.[a-z]{2})?)$)|(@\[?((25[0-5]\.|2[0-4][0-9]\.|1[0-9]{2}\.|[0-9]{1,2}\.))((25[0-5]|2[0-4][0-9]|1[0-9]{2}|[0-9]{1,2})\.){2}(25[0-5]|2[0-4][0-9]|1[0-9]{2}|[0-9]{1,2})\]?$)/i);
	
	parameter = true;
	alink;

	constructor(props) {
		super(props);
		this.handleSubmit = this.handleSubmit.bind(this);
	}

	state = { input: {}, text: '' };
	setText = e => {
		this.setState({ text: e.target.value })
	};

	
	handleSubmit(e) {
			
		e.preventDefault();
		this.renderError();
		this.setState({ error: true })

		if(this.parameter === true){
				console.log("Start routing")
				this.alink ="http://localhost:8080/profile";
				window.location.replace(this.alink);
		}
		
	}

	render() {
		return (
			<form onSubmit={this.addTodo} action="javascript:" id="form" action="#">
				
				<div class={style.home}>
					<h1>Home</h1>
					<p>This is the Email component.</p>
				</div>
				<br></br>
				<div class="form__input-field col">
					<label class="form__input-label" for="Email" >
						Enter EmailId
						<br></br>
					</label>
					<div class="bordered-class">

						<input
							class="form__email-input"
							type="text"
							id="email"
							name="email"
							placeholder="Enter Email Address in Valid format"
							onInput={this.setText}
							value={this.state.input.email}
							pattern="/^[a-zA-Z0-9.!#$%'*+/=?^_`{|}~-]+@[a-zA-Z0-9-]+(?:\.[a-zA-Z0-9-]+)*$/" required
						/>
					</div>
			
					<input
						class="form__submit-btn"
						type="submit"
						onClick={this.handleSubmit}
						value="Login" />

					<label>Link is activated<a href= {this.alink}/></label>
					
				</div>

			</form>


		);

	}

	renderError() {
		let Email = this.state.input.email;
		 
		// after submitted    
		if (this.state.error) {
			console.log("reached error state"+Email )
			this.parameter = false;
			//  if input is empty      
			if (Email === '' || Email === undefined) {
				console.log("reached error state1");
				return (
					<span class="form__error">
						Please type in E-mail Address
					</span>
				);
			}
			else if (!this.re.test(Email)) { // if this doesn't match email format
				console.log("reached error state22");
				this.parameter = false;
				return (
					<span class="form__error">Please type in valid email address.</span>
				);
			}


		}
	}

}

export default Home;

