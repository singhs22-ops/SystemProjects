import { Component, h,render } from 'preact';
import style from './style.css';

/** @jsx h */

export class Home extends Component {



	re = /^(([^<>()\[\]\\.,;:\s@"]+(\.[^<>()\[\]\\.,;:\s@"]+)*)|(".+"))@((\[[0-9]{1,3}\.[0-9]{1,3}\.[0-9]{1,3}\.[0-9]{1,3}])|(([a-zA-Z\-0-9]+\.)+[a-zA-Z]{2,}))$/;


	constructor(props) {
		super(props);
		this.handleSubmit = this.handleSubmit.bind(this);
	}

	state = { todos: [], text: '' };
	setText = e => {
		this.setState({ text: e.target.value })
	};

	handleSubmit(e) {
		//var form = document.getElementById("form");
		var Email = document.getElementById("Email").value;
		var text = document.getElementById("text");
		console.log("SSSSSSsss" + e.target.value);
		if (e.target.value) {
			console.log("SSSSSSsss" + e.value);
		}
		e.preventDefault();
		this.renderError();
		this.setState({ error: true })
	}

	addTodo = () => {
		let { todos, text } = this.state;
		todos = todos.concat({ text });
		this.setState({ todos, text: '' });
	};
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
							id="Email"
							name=""
							placeholder="Enter Email Address in Valid format"
							onInput={this.setText}
							value={this.state.email}
						/>
					</div>
					<p>Format</p>
					<p>{this.state.email}</p>

					<input
						class="form__submit-btn"
						type="submit"
						onClick={this.handleSubmit}
						value="Login" />
				</div>

			</form>


		);

	}

	renderError() {
		let Email = this.state.email;

		// after submitted    
		if (this.state.error) {
			console.log("reached error state")
			//  if input is empty      
			if (Email === '' || Email === undefined) {
				return (
					<span class="form__error">
						Please type in E-mail Address
					</span>
				);
			}
			if (!this.re.test(Email)) { // if this doesn't match email format
				return (
					<span class="form__error">Please type in valid email address.</span>
				);
			}

		}
		else
			console.log("No error")
	}

}
 

export default Home;
