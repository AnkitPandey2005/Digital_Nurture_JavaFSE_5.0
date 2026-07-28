import { useState } from "react";

import Greeting from "./Greeting";
import LoginButton from "./LoginButton";
import LogoutButton from "./LogoutButton";

function App() {

    const [isLoggedIn, setIsLoggedIn] = useState(false);

    const login = () => {
        setIsLoggedIn(true);
    };

    const logout = () => {
        setIsLoggedIn(false);
    };

    return (

        <div style={{ margin: "40px" }}>

            <Greeting isLoggedIn={isLoggedIn} />

            <br />

            {

                isLoggedIn ?

                    <LogoutButton onClick={logout} />

                    :

                    <LoginButton onClick={login} />

            }

        </div>

    );
}

export default App;