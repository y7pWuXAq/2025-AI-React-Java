/* React 라이브러리, useContext 사용자 정보를 담아놓는 공간 라이브러리 */
import React, { useState } from "react";

function CommentBoard() {
    /* 댓글 하나만 저장하는 상태값 */
    const [comment, setComment] = useState("");

    /* 댓글 여러개를 저장하는 상태값 : 배열 타입으로 정의 */
    const [comments, setComments] = useState([]);

    const handleSubmit = (e) => {
        // 서식 검증하기 : input 태그의 type에 따라 서식이 적용되는 type인 경우 해당
        e.preventDefault();

        /* 문자열이 입력되었는지와 타입이 같은지 확인
            - trim() : 제일 왼쪽과 오른쪽의 공백 제거
            - '===' : 값이 없거나 타입이 문자열이 아닌경우 return시킴
                    : 값 입력 여부와 동일 타입 여부를 판단하는 비교연산자
        */
        if(comment.trim() === "") return; // 중괄호 생략 가능(한줄이기 때문에)

        // 처리 확인
        // alert(`내용 : ${comment}`);

        /* 하나의 댓글을 여러개의 댓글을 관리하는 상태 변수에 담기
            '...' : comments 배열의 마지막에 comment의 값을 넣으라는 의미
                  : 파이썬에서 list에 값을 추가할 때 사용하는 append() 함수와 동일 */
        setComments([...comments, comment]);

        // 댓글 하나를 저장하는 상태 변수값은 다시 비우기(초기화)
        setComment("");
    }; 
    return(
        <div>
            {/* 댓글 입력 */}
            <form onSubmit={handleSubmit}>
                <label>댓글입력 : </label>
                <input type="text" value={comment}
                    placeholder="댓글 입력"
                    required
                    onChange={(e) => setComment(e.target.value)} />

                <button type="submit">등록</button>
            </form>

            {/* comments에 담겨있는 여러 댓글을 출력 : 배열에 담겨 있기에 반복을 통해 출력 */}
            <ul>
                {
                    // index : map이 반복하면서 발생하는 번호값(고유 식별자 값)
                    comments.map((item, index) => (
                        // map 내에 결과 출력
                        <li key={index}>{item}</li>
                    ))
                }
            </ul>
        </div>
    );
}

export default CommentBoard;