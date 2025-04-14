/* React 라이브러리 import */
import React from "react";

/* 컴포넌트는 함수로 정의 후 return 해야함
   컴포넌트 함수는 파일명과 동일하게 해야함 */
function WelcomeMessage() {
    return(
        /* 응답할 결과 태그 정의 */
        <div>
            <p>
                여기는 하위 컴포넌트! : WelcomeMessage
            </p>
        </div>
    );
}

/* 다른 외부 파일에서 import 할 수 있도록 export 해야함 */
export default WelcomeMessage;