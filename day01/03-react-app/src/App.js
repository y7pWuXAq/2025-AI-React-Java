/* React 라이브러리 import */
import React from "react";

/* 하위 컴포넌트 불러오기 : WelcomeMessage.js */
import WelcomeMessage from "./WelcomeMessage";

/* 하위 컴포넌트 불러오기 : UserProfile.js */
import UserProfile from "./UserProfile";

function App() {
  return (
    /* 응답(Response) 할 결과 정의하기 */
    <div>
      <h2>JSX의 prop 개념 설명</h2>
      <hr/>

      <h3>하위 컴포넌트 : WelcomeMessage 포함 시키기(XML 태그 문법 사용)</h3>
      <WelcomeMessage/>
      <hr/>

      <h3>하위 컴포넌트 : UserProfile 포함 시키기(XML 태그 문법 사용)</h3>
      {/* XML 태그 내에 전달할 속성=값 형태로 하위 컴포넌트에 데이터 전달
        - 속성명은 사용할 key, 값의 경우 문자열은 그대로, 숫자열은 중괄호 사용
        - React의 props 기능 : 상위 컴포넌트에서 하위 컴포넌트로 데이터를 전달하는 방식
                            : 상위에서 key와 value가 정의되며
                            : 하위에서는 key를 이용해서 value값을 추출
                            : 하위에서는 추출만 가능, 값의 수정 불가(읽기 전용)
                            : 하위 컴포넌트의 함수는 매개변수로 "props"라는 변수를 정의해서 사용
                            : 사용 예시 (props.name, props.age 로 값을 추출, 중괄호를 사용해여 작성해야함)
      */}
      <UserProfile name="시내" age={27}/>
    </div>
  );
}

export default App;
