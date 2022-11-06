import React from 'react';


function ErrorWorld(props) {
    return (
        <div className="container-fluid" style={styling.bg}>
            
            <h1 style={styling.heading}>
                hello welcome please go back!!
            </h1>
        </div>
    );
}

let styling = {
    bg : {
        background : "black",
        width : "100%",
        height : '100vh'
    },
    heading : {
        textAlign: "center",
        position: "relative",
        top: "15%",
        fontFamily: "fantasy",
        border: "2px #333333",
        color: "#333333"
    }
}

export default ErrorWorld;