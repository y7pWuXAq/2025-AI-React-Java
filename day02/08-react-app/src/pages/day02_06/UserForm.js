/* React 라이브러리, useContext 사용자 정보를 담아놓는 공간 라이브러리 */
import React, { useState } from "react";

function UserForm() {
    const [user, setUser] = useState(null);
    const [name, setName] = useState("");
    const [email, setEmail] = useState("");

    const handleSubmit = (e) => {
        // 서식 검증하기 : input 태그의 type에 따라 서식이 적용되는 type인 경우 해당
        e.preventDefault();

        // 함수(자바스크립트 함수) 내에서 문자열 처리 : 탭 위에 싱글 따옴표
        alert(`이름 : ${name}, 이메일 : ${email}`);
    };

    return(
        <form onSubmit={handleSubmit}>
            {/* 이름 입력 */}
            <div>
                <label> * 이름 : </label>
                <input type="text" value={name}
                       placeholder="이름을 입력하세요"
                       required
                       onChange={(e) => setName(e.target.value)} />
            </div>

            {/* 이메일 입력 */}
            <div>
                <label> * 이메일 : </label>
                <input type="email" value={email}
                       placeholder="abc123@email.com"
                       required
                       onChange={(e) => setEmail(e.target.value)} />
            </div>

            {/* 입력값 저장 버튼 */}
            <button>저장</button>
        </form>
    );
}

export default UserForm;