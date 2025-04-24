# 2025-AI-React-basic
2025년 빅데이터 기반 AI 개발 전문가 과정 React & Java 기본 학습 리포지토리


### DAY01

<Front-End Server 구축>
 1. node.js 설치
  - 자바스크립트(Javascript)로 네트워크 애플리케이션을 개발 할 수 있는 환경제공
  - 네트워크 : 클라이언트(Client)와 서버(Server) 통신이 가능한 환경을 의미
  - node.js를 설치하면 React와 같은 Front-End 개발 라이브러리를 설치할 수 있는
    --> 설치 패키지 관리자를 제공해줌(설치 패키지를 자동으로 설치해줌)
  - 설치 패키지 : npm 이라고 칭함
  - node.js를 아나콘다라고 생각하면 됨
    npm을 conda 또는 pip라고 생각하면 됨
  - node.js 설치 파일 다운로드 URL : https://nodejs.org/ko
    --> 디폴트로 설치 진행
  - node.js command prompt 창 열기
    --> 아래 명령어로 버전 확인(버전 확인 잘되면 설치 성공)
    --> node --version 
    --> npm --version

  - npm : node package manager (노드 패키지 관리자) 자동 설치됨
    --> React를 포함한 다양한 패키지 라이브러리를 설치/삭제 담당
    --> 버전들 간의 의존성 관리(파이썬의 아나콘다와 유사)

 2. VS-Code에 React관련 확장기능 설치
  - ES7 React/Redux/GraphQL/React-Native snippets 설치
    : React 빠른 코드 입력 도움줌
  - Reactjs code snipets 설치
    : React의 다양한 코드 구조에 대한, 빠른 코드 입력 도움줌
  - Prettier - Code Formatter 설치
    : 코드 스타일 자동 정리(들여쓰기, 줄바꿈 등을 자동 정리함)
  - ESLint 설치됨 
    : Javascript 코드의 스타일 검사, 일과넝 있게 작성할 수 있도록함

 3. React 프로젝트 생성
  - 프로젝트 생성은 npx 명령으로 수행
  - 명령을 수행하면, 프로젝트 폴더가 생성됨
  - 명령 수행전 체크 사항 : 프로젝트 폴더가 생성될 위치로 이동 후 진행
  - node command prompt 창 열기
  - 아래 명령 수행
   >npx create-react-app 생성할_프로젝트_폴더명
   >npx create-react-app 01-react-app
    ** 설치시 (y) 나오면 y 입력 후 엔터

4. React 실행 명령들
 - Front-End React Server 구동
   >npm start

 - 배포를 위해 사용
   >npm run build

 - 테스트를 위해 사용
   >npm test

 -> 우리가 사용할 명령
   ** react 프로젝트 폴더로 이동 후 아래 명령 수행
   >npm start

5. React Front-End Server 시작
   >cd 프로젝트폴더
   >npm start
     --> 실행하면 자동으로 브라우저 open됨
     --> 사용 URL : http://localhost:3000/
     --> 서버 종료 방법 : [Ctrl + c]

6. React에서 페이지간의 이동은 Router 라이브러리를 통해 이동됨
  - 사용자로부터 url 요청이 들어오면, 응답할 페이지 처리 기능을 찾음
  - 이를 'URL 매핑' 이라고 칭합니다.
  - Front-End 내에서의 페이지간 이동을 의미함
  - URL 매핑 처리를 하기위한 라이브러리 : Router
  - 설치가 필요함
   >npm install react-router-dom

7. React Front-End에서 Back-End Server의 API 호출을 위한 URL 관리자 필요함 
  - axios 라이브러를 통해 관리됨
  - 설치 필요
   >npm install axios

******* 위 1~7번까지는 React 프로젝트 생성시 항상 진행해야함 *******
 - 이후 페이지 개발을 진행함....
 - 1~2번이 되어 있는 경우 : 3~7번까지 수행...

<React 기본 사용 폴더 및 파일>
 - public/index.html 
   --> 수정이 필요한 경우
       : 공통 css를 적용하는 경우(src의 App.js에서도 가능)
       : 공통 로고 등을 적용하는 경우(src의 App.js에서도 가능)

 - src/App.js
       : 페이지 처리 결과를 가지고 있는 파일
       : 페이지 처리는 외부 처리 파일을 통해서도 가능
         (외부 처리 파일을 React에서는 컴포넌트라고 칭함)

 - src/index.js
       : index.html에 App.js의 데이터 결과를 렌더링(합치는 곳) 작업 수행
       : 기본적으로 수정이 필요한 경우는 -> App.js의 파일명이 수정된 경우
                                         -> index.html의 id 이름이 수정된 경우


<React 프로젝트 신규 생성 : 기본 사용법 실습>
 1. React 신규 프로젝트 생성
   - 프로젝트명 : 02-react-app
    >npx create-react-app 02-react-app

 2. 프로젝트 생성 후 서버 구동 테스트 하기
   - 생성된 프로젝트로 이동
    >cd 02-react-app

   - 서버 실행
    >npm start

 3. Front-End 프로그램
   - ./public/index.html : 수정 없음
   - ./src/index.js : 수정 없음

   - ./src/App.css : 전체 수정
   - ./src/App.js : 전체 수정



<React 프로젝트 신규 생성 : 기본 사용법 실습>
 1. React 신규 프로젝트 생성
   - 프로젝트명 : 03-react-app
    >npx create-react-app -react-app

 2. 프로젝트 생성 후 서버 구동 테스트 하기
  - 프로젝트 폴더로 이동
    >cd 03-react-app

  - 서버 실행
    >npm start

3. Front-End 프로그램 : React의 "prop" 개념 적용
   - ./public/index.html : 수정 없음
   - ./src/index.js : 수정 없음

   - ./src/App.js : 전체 수정
   - ./src/WelcomeMessage.js 컴포넌트 생성 (파일명은 대문자로 시작)
   - ./src/UserProfile.js 컴포넌트 생성 (파일명은 대문자로 시작)

<br><br>

<React 프로젝트 신규 생성 : 컴포넌트 재사용(반복 수행) 실습>
 1. React 신규 프로젝트 생성
   - 프로젝트명 : 04-react-app
    >npx create-react-app 04-react-app

 2. 프로젝트 생성 후 서버 구동 테스트 하기
  - 프로젝트 폴더로 이동
    >cd 04-react-app

  - 서버 실행
    >npm start

3. Front-End 프로그램 : 컴포넌트 재사용(반복 수행)
   - ./public/index.html : 수정 없음
   - ./src/index.js : 수정 없음

   - ./src/App.js : 전체 수정
   - ./src/Card.js : 신규 생성
   - ./src/ProfileList.js : 신규생성

<br><br><br>


### DAY02

<React 프로젝트 신규 생성 : 사용자 상태 정보 관리 Context 실습>
 1. React 신규 프로젝트 생성
   - 프로젝트명 : day51_05-react-app
    >npx create-react-app day51_05-react-app

 2. 프로젝트 생성 후 서버 구동 테스트 하기
   - 생성된 프로젝트로 이동
    >cd day51_05-react-app

   - 서버 실행
    >npm start

 3. Front-End 프로그램
   - ./public/index.html : 수정 없음
   - ./src/index.js : 수정 없음

   - ./src/App.js : 전체 수정

   ##### 사용자 상태 정보를 저장 후 다른 컴포넌트에서 사용할 수 있도록 공유
   - ./src/AuthContext.js 
  
   ##### 로그인/로그아웃 상태관리 페이지 : 기능 처리 컴포넌트
   - ./src/Header.js

   ##### 사용자 로그인 폼 : 보여지는 페이지
   - ./src/LoginForm.js

   ##### 로그인 후 보여질 화면 : 보여지는 페이지
   - ./src/Dashboard.js

<br><br>

<React 프로젝트 신규 생성 : 사용자 입력폼 실습>
 1. React 신규 프로젝트 생성
   - 프로젝트명 : day51_06-react-app
   - 서버 테스트

  2. Front-End 프로그램
   - ./public/index.html : 수정 없음
   - ./src/index.js : 수정 없음

   - ./src/App.js : 전체 수정
     - React와 UserForm.js 컴포넌트만 import 
     - return에 UserForm 컴포넌트만 포함만 하여, 
        브라우저에서 입력 폼 확인

   ##### 사용자 입력 폼 페이지 작성
   - ./src/UserForm.js
    * React와 useState만 import
     
    * 이름과 이메일을 입력하는 form 작성
     - 이름 : text type으로
     - 이메일 : email type으로
     - 이름 및 이메일 입력 시 onChange 이벤트 발생
        -> 이름과 이메일에 대한 useState을 생성하여
        -> onChage 시에 이름과 이메일 값 저장 시키기

<br><br>

<React 프로젝트 신규 생성 : 댓글 형태 실습>
 1. React 신규 프로젝트 생성
   - 프로젝트명 : day51_07-react-app
   - 서버 테스트

  2. Front-End 프로그램
   - ./public/index.html : 수정 없음
   - ./src/index.js : 수정 없음

   - ./src/App.js : 전체 수정
     -> React와 CommentBoard 만 import
     -> return은 CommentBoard만

   - ./src/CommentBoard.js : 댓글 추가 폼 페이비
     -> React와 useState만 import
     -> 댓글 입력폼 작성
         --> text type으로 작성
         --> onChange 이벤트 발생 후 comment useState을 생성하여 저장하기
     -> [댓글 등록] 버튼 생성
         --> button 태그로 생성, type은 submit
         --> 클릭하면 onSubmit 이벤트 발생 후 handleSubmit 함수 호출
         --> handleSubmit 함수에서는 alert 창에 자유롭게 메시지만 띄우기

<br><br>

<React 프로젝트 신규 생성 : Router 이용 및 페이지 분리 실습>
 1. React 신규 프로젝트 생성
   - 프로젝트명 : day51_08-react-app
   - 서버 테스트

   - Router 기능 사용을 위해 라이브러리 설치하기
     >npm install react-router-dom

  2. Front-End 프로그램
   - ./public/index.html : BootStrap 설정
   - ./src/index.js : BrowserRouter 추가 설정
   - ./src/App.js : 전체 수정 -> Router 처리 작성(URL 패턴 처리)

   ** 폴더 구조로 관리
    - ./src/components/Header.js : 상단 공통 네비게이션 메뉴 페이지
    - ./src/components/Layout.js  : 전체 레이아웃 템플릿 페이지

    - ./src/pages/Home.js : 메인 소개 페이지
    - ./src/pages/day51_05/ : 폴더 까지만 만들기
    - ./src/pages/day51_06/ : 폴더 까지만 만들기
    - ./src/pages/day51_07/ : 폴더 까지만 만들기

    - ./src/css/ : 폴더 까지만 만들기

<br><br>


### DAY03

@ 실무에서 권장하는 JDK 버전
 * 기업 내부 시스템 개발 : Java JDK 17 LTS 권장
   - SpringBoot 자바 백엔트 개발 3.x 버전을 사용하기 위한 JDK 최소버전

 * 최신 기능 + 장기 서비스 : Java JDK 21 LTS 
   - 기업에서는 최신버전을 잘 사용하지 않음(안전성 문제가 있을 수 있기 때문에)

@ Java 개발 환경
 * JDK 설치 필요
   - 시스템 설정 필요 : 환경변수 등록을 의미함
   - 시스템 환경에 : JAVA_HOME 등록(jdk 폴더 위치), 
                        : path에 jdk의 bin 폴더 위치 정의
   - 환경 설정 후 확인 방법
     : command 창에서 java 및 javac 입력 후 엔터 (내용 주루룩...나오면 성공)
     : javac -> java 코드 컴파일러(해석기)
     : java -> java 코드 실행(결과물 출력)
     : Editor에서 기본적으로 -> javac(컴파일)는 자동으로 해줍니다.(저장 시점에)
                                     -> java 코드 저장 후 실행만하면 됨...

 * Editor 필요
   - VS-Code, 이클립스, 인텔리제이 등등...
   - 최근 VS-Code에서 개발하는 추세 (기존에는 이클립스 사용자 층이 많았음)

@ Java와 관련한 VS-Code Extension Pack
 * Java (필수)
 * Code Runner
 * Language Support for JAVA(TM) by Red Hat
 * Debugger for Java
 * Java Test Runner or Test Runner for Java
 * Maven for Java
 * Extension Pack for Java

<br><br>

### DAY04

@ Java 한글 깨짐 방지를 위한 인코딩 UTF-8 처리
 - Window 시작 > 국가 또는 지역 > 체크 : UTF-8 > 재시작
<br><br>

### DAY05 ~ DAY07
- Java 기본 학습
<br><br>

### DAY08
Java 실습
<도서 대출 관리 프로그램 개발>
 - 조별로 대출 관리를 위해 필요한 기능들 논의
  - 무한루프 사용
 - 조별로 개별 제출