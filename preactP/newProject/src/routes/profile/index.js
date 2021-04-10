import { Component, h, render } from 'preact';
import style from './style.css';

// Note: `user` comes from the URL, courtesy of our router
export class Profile extends Component{

	alink;
navigateLogout(){
	
	window.location.replace("localhost:8080");
}

render(){
	return (
		<div class={style.profile}>
			<h1>Profile:</h1>
			<p>This is the user profile for a user named </p>

			<nav class="Container-class"
				style={{
					display: "flex",
					justifyContent: "center",
					alignItems: "center"
				}}>
				<div class="col" >SwiftDash</div>
				<button class="col" onClick={this.navigateLogout}>Logout</button>
			</nav>
			<div class="Container-class"
				style={{
					display: "flex",
					justifyContent: "left",
					alignItems: "center"
				}}>
				<dt class="col">Name</dt>
				<dd>- email</dd><dd>- phone</dd>
				<br></br>
				<dt style={{
					fontStyle: "italic",
					backgroundColor: 'greenyellow'
				}}>COMPANY</dt>
				<dd>- company</dd><dd>- catchPhrase</dd>
			</div>

			<h3
			style={{
				display: "flex",
				justifyContent: "left",
				alignItems: "center",
				backgroundColor: 'lightsalmon',
				borderColor: "magenta",
				borderStyle: "solid"
			}}>Post Title
				<p>AAAAAAAAAAAAAAAAANNNNNNNN BBBBBB BBBBBBkJJJ</p>
			</h3>
			<h2 style={{
				display: "flex",
				justifyContent: "left",
				alignItems: "center",
				backgroundColor: 'lightcoral',
				borderColor: "magenta",
				borderStyle: "solid"
			}}>Longer Post Title
				<p>Our objective is to make TransparentBusiness synonymous with the categories of Business Transparency and Remote Workforce Management.</p>
			</h2>
			<h4 style={{
				display: "flex",
				justifyContent: "left",
				alignItems: "center",
				backgroundColor: 'lightblue',
				borderColor: "magenta",
				borderStyle: "solid"
			}}>Post Title
				<p>Note: In December 2018, WordPress 5.0 launched with a new editor. This article was written for the long-available 
					editing experience in prior WordPress versions, which can be used in WordPress 5.0 and
					 up via the Classic Editor Plugin. You may be interested in user documentation for the new block editor.</p>
			</h4>
			<h2 style={{
				display: "flex",
				justifyContent: "left",
				alignItems: "center",
				backgroundColor: "GrayText",
				borderColor: "magenta",
				borderStyle: "solid"
			}}>Post Title
				<p>Note: In December 2018, WordPress 5.0 launched with a new editor. This article was written for the long-available 
					editing experience in prior WordPress versions, which can be used in WordPress 5.0 and
					 up via the Classic Editor Plugin. You may be interested in user documentation for the new block editor.</p>
			</h2>
			<h1 style={{
				display: "flex",
				justifyContent: "left",
				alignItems: "center",
				backgroundColor: 'greenyellow',
				borderColor: "magenta",
				borderStyle: "solid"
			}}>Post Title
				<p>Note: In December 2018, WordPress 5.0 launched with a new editor. This article was written for the long-available 
					editing experience in prior WordPress versions, which can be used in WordPress 5.0 and
					 up via the Classic Editor Plugin. You may be interested in user documentation for the new block editor.</p>
			</h1>

		</div>
	);
}
}

export default Profile;
