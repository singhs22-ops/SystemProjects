import { h } from 'preact';
import {useEffect, useState} from "preact/hooks";
import style from './style.css';

// Note: `user` comes from the URL, courtesy of our router
const Profile = ({ user }) => {
	const [time, setTime] = useState(Date.now());
	const [count, setCount] = useState(10);

	useEffect(() => {
		let timer = setInterval(() => setTime(Date.now()), 1000);
		return () => clearInterval(timer);
	}, []);

	return (
		<div style={{
			margin: 'auto',
			marginLeft: '300px',
			}}>
			<pre>
				<h2>Validating Email in ReactJS</h2>
				<span>Enter Email: </span><input type="text" id="userEmail" 
				onChange={(e) => validateEmail(e)}></input> <br />
				<span style={{
				fontWeight: 'bold',
				color: 'red',
				}}>{emailError}</span>
			</pre>
			</div>
	);
}

export default Profile;
