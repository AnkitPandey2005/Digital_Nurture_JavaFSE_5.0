import { useState } from "react";
import CurrencyConvertor from "./CurrencyConvertor";

function App() {

    const [count, setCount] = useState(0);

    const increment = () => {
        setCount(count + 1);
    };

    const decrement = () => {
        setCount(count - 1);
    };

    const sayHello = () => {
        alert("Hello! Hope you are having a great day.");
    };

    const increaseAndGreet = () => {
        increment();
        sayHello();
    };

    const sayWelcome = (message) => {
        alert(message);
    };

    const handleClick = () => {
        alert("I was clicked");
    };

    return (

        <div style={{ margin: "30px" }}>

            <h1>Counter : {count}</h1>

            <button onClick={increaseAndGreet}>
                Increment
            </button>

            <button
                onClick={decrement}
                style={{ marginLeft: "10px" }}
            >
                Decrement
            </button>

            <br /><br />

            <button
                onClick={() => sayWelcome("Welcome")}
            >
                Say Welcome
            </button>

            <br /><br />

            <button onClick={handleClick}>
                OnPress
            </button>

            <CurrencyConvertor />

        </div>

    );
}

export default App;