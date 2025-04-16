/* React 및 사용자 상태 저장관리 라이브러리 */
import React from "react";

/* 댓글 입력 폼 페이지 컴포넌트 */
import CommentBoard from "./CommentBoard";


function App() {
  return (
    <div>
      <h2>댓글 입력창</h2>
      <CommentBoard />
    </div>
  );
}

export default App;
