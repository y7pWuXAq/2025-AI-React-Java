/* React 라이브러리 import */
import React from "react";

/* 하위 컴포넌트(Card)에서는 props 라이브러리를 이용해서 추출해 사용 */
function Card(props) {
    return(
        <div style={{
            border: "1px solid gray",
            borderRadius : "8px",
            padding : "16px",
            marginBottom : "12px",
            backgroundColor : "darkgray",
            color : "floralwhite"
        }}>
            <h4>사용자 이름 : {props.name}</h4>
            <p>* 직업 : {props.job}</p>
        </div>
    );
}

export default Card;