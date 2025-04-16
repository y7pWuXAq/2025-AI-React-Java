import React from "react";

/* URL 패턴 처리를 위한 Router 라이브러리 */
// - Routes : root(http://localhost:3000/) url 관리
//          : - root를 줄여서 슬래시(/)로 표현함
// - Route : root(http://localhost:3000/) 이하 url 관리
import {Routes, Route} from "react-router-dom";

/* 공통으로 사용하는 HTML 영역을 별도의 레이아웃으로 정의 */
import Layout from "./components/Layout";

/* 페이지 컴포넌트 */
import Home from "./pages/Home";
import App0205 from "./pages/day02_05/App0205";
import App0206 from "./pages/day02_06/App0206";
import App0207 from "./pages/day02_07/App0207";
import BootstrapExample from "./pages/day02_bootstrap/BootstrapExample";

/* BootStrap 적용 설치 필요 : npm install bootstrap */
import "bootstrap/dist/css/bootstrap.min.css";

function App() {
  return (
    <Routes>
      {/* 최초 서버 실행 시 보여지는 페이지 */}
      <Route path="/" element={<Layout />}>
        {/* index 페이지 설정
            - 최초 레이아웃에 보여질 페이지(index 페이지라고 칭함)
            - root 경로는 모두 index 경로를 의미하겠다는 표현 */}
        <Route index element={<Home />} />

        {/* /day02_05로 들어오는 URL은 App0205 컴포넌트 호출 */}
        <Route path="day02_05" element={<App0205 />} />

        {/* /day02_06로 들어오는 URL은 App0206 컴포넌트 호출 */}
        <Route path="day02_06" element={<App0206 />} />

        {/* /day02_07로 들어오는 URL은 App0206 컴포넌트 호출 */}
        <Route path="day02_07" element={<App0207 />} />

        {/* /day02_bootstrap로 들어오는 URL은 BootstrapExample 컴포넌트 호출 */}
        <Route path="day02_bootstrap" element={<BootstrapExample />} />
      </Route>
    </Routes>
  );
}

export default App;
