import { render, h } from "preact";
import { useState } from "preact/hooks";
import { useForm } from "./validation";

const EMAILS = ["johnsmith@outlook.com", "mary@gmail.com", "djacobs@move.org"];

function fetchUserName(name) {
  return new Promise(resolve => {
    setTimeout(() => resolve(EMAILS.indexOf(name) > -1), 200);
  });
}

const ErrorMessage = ({ error }) =>
  error && <span className="error-message">{error}</span>;

const App = () => {
  const { validate, handleSubmit, errors } = useForm({
      errorClass: "error-input"
    }),
    [password, setPassword] = useState(),
    fn = form => {
      // form.submit()
      console.log("Done");
    },
    userNameExists = async ({ value }) => {
      const exists = await fetchUserName(value);
      return exists && `${value} is already being used`;
    },
    matchesPassword = ({ value }) =>
      value === password ? false : "Passwords must Match";

  return (
    <form ref={handleSubmit(fn)}>
      <h1>Sign Up</h1>
      <div className="field-block">
        <input
          name="email"
          type="email"
          placeholder="Email"
          required
          ref={validate([userNameExists])}
        />
        <ErrorMessage error={errors.email} />
      </div>
      <div className="field-block">
        <input
          type="password"
          name="password"
          placeholder="Password"
          required
          minlength="8"
          onInput={e => setPassword(e.target.value)}
          ref={validate()}
        />
        <ErrorMessage error={errors.password} />
      </div>
      <div className="field-block">
        <input
          type="password"
          name="confirmpassword"
          placeholder="Confirm Password"
          required
          ref={validate([matchesPassword])}
        />
        <ErrorMessage error={errors.confirmpassword} />
      </div>

      <button type="submit">Submit</button>
    </form>
  );
};

render(<App />, document.getElementById("app"));
