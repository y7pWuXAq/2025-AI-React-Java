/* React 라이브러리 import */
import React from "react";

/* 하위 컴포넌트 import 하기 : ProfileList.js */
import ProfileList from "./ProfileList"

function App() {
  return (
    <div>
      <h2>하위 컴포넌트 : ProfileList 포함시키기</h2>
      <ProfileList/>
    </div>
  );
}

export default App;