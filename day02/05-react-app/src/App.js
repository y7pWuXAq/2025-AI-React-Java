/* React 및 사용자 상태 저장관리(Hook 기능) 라이브러리 */
/* useState : 상태 데이터를 저장하기 위한 라이브러리 
             -> 외부 컴포넌트로 상태 데이터 공유 가능 */ 
import React, { useState } from "react";

// 로그인 상태를 담당하는 컴포넌트
import AuthContext from './AuthContext';

/* 로그인, 로그아웃 상태 처리를 위한 컴포넌트 */
import Header from "./Header";

/* 로그인 폼 페이지 */
import LoginForm from "./LoginForm";

/* 로그인 이후 보여질 페이지 */
import Dashboard from "./Dashboard";


function App() {
  /* 사용자 상태 정보 최초 데이터 설정 : useState 설정
    - 최초 사용자 상태는 없는(null) 상태
    - 사용 문법
      * 최초 정의 시 : [사용할 key, 값을 저장하기 위한 함수명(set으로 시작, 변수명 첫자 대문자)]
      * 데이터 저장 방법 : setUser({key : value}) or setUser(value) -> {user : value}
      * 데이터 추출 방법 : user.key               or user
  */
  const [user, setUser] = useState(null);

  return (
    // AuthContext.Provider : 다른 컴포넌트에 사용자 상태(user) 데이터와 설정(setUser) 함수를 공유
    // 다른 컴포넌트의 정의 : AuthContext.Provider 태그 내에서 사용되는 컴포넌트들을 의미함
    <AuthContext.Provider value={{ user, setUser }}>
      <div>
        {/* 로그인, 로그아웃 상태 처리를 위한 Header 컴포넌트 보여주기 */}
        <Header />

        {/* 사용자 상태 데이터에 따라 컴포넌트를 선별하여 보여주기 -> 3항 연산자 사용
            - 3항 연산자 : 파이썬에는 없음, 이외 프로그램 언어에는 있는 연산자
            - 3항 연산자 문법 : 조건 ? 참일 때 처리 값 : 거짓일 때 처리값
        */}
        
        { user ? <Dashboard /> : <LoginForm /> } {/* user의 값이 True면 Dashboard , False면 LoginForm */}
      </div>
    </AuthContext.Provider>
  );
}

export default App;
