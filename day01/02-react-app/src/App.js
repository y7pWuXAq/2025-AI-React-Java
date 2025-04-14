// React 라이브러리 불러들이기
import React from "react";

/* App.css 스타일 불러들이기
  - index.js에서 App.js를 불러들여서 + index.html과 합침
    -> App.js에서 불러들인 css 스타일도 index.html에 적용이 됨
    -> 즉, index.html 내에 태그, id, class 속성을 이용해서
           App.css 내에 스타일을 정의해도 index.html에서 적용됨
  - 전체 수정
*/
import './App.css';

/* Javascript에서 제공하는 날짜 클래스 사용
  - Date() : 날짜 클래스 생성해야함. 생성은 new 명령으로 수행
  - toLocaleDateString() : 현재 날짜(년월일)을 추출하는 함수
  - const(상수)로 currentDate 변수 정의
*/
const currentDate = new Date().toLocaleDateString()

/* 사용자 변수 추가 */
const userName = "곽해주"

function App() {
  return (
    // 사용자에게 응답(Response)할 신규 태그 작성
    // - 리턴을 위해서는 하나의 태그영역에 모든 정보를 담아야 함(React 필수사항)
    // - div 태그 영역에 모든 정보 담기 -> 스타일 적용을 위해 class 속성 사용하여 이름 정의
    //    -> JSX 문법에서는 className으로 사용
    <div className="container">
      {/* JSX 주석 : 중괄호 안에 Javascript 주석으로 처리 */}
      <h2>Hello, React!</h2>

      {/* 데이터 넣기 : JSX 표현식 사용
          - 중괄호 안에 변수 또는 프로그램으로 출력 처리 */}
      <p>사용자 이름 {userName}</p>
      <p>오늘의 날짜는? {currentDate}</p>

      {/* inline 스타일 적용 : 기존 방법과 동일
          다만 JSX 문법을 따라야 함 -> 중괄호 안에 json 방식으로 작성 
           - 텍스트 색상, 폰트 굵기 : bold */}
      <p style={{backgroundColor : "dimgray", color : "floralwhite", fontWeight : "bold"}}>
        인라인 스타일 적용 확인!
      </p>

      {/* 산술 연산도 가능 */}
      <p>1 + 2 = {1+2}</p>
      <p>1 + 2 * 2 = {1+2*2}</p>
    </div>
  );
}

// App 컴포넌트를 외부에서 사용할 수 있도록 export 시킴
export default App;