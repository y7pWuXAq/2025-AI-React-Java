/* React 라이브러리 import */
import React from "react";

function UserProfile(props) {
    return(
        <div>
            <h4>사용자 정보</h4>
            <p>* 이름 : {props.name}</p>
            <p>* 나이 : {props.age}</p>
        </div>
    );
}

export default UserProfile;