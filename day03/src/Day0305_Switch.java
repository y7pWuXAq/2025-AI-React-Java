/**
 * Day0305_Switc 신규 자바 파일 생성
 * - 선택문(switch) 실습 
*/

public class Day0305_Switch {
    public static void main(String[] args) {
        System.out.println("<Day0305_Switch> Class : Switch 선택문");
        
        /**
         * 선택문(switch)
         *  - if문과 유사한 개념
         *  - 조건은 없으며, 값을 이용하여 선택하게됨
         *  - 작성 방법
         *    switch(값or변수) {
         *      case 비교값1 -> 처리로직(최종 결과값을 뽑아내는 로직처리)
         *      case 비교값2 -> 처리로직(최종 결과값을 뽑아내는 로직처리)
         *      default -> 기타로직(최종 결과값을 뽑아내는 로직처리)
         *    }
        */

        /* 임의의 변수에 임의 정수값 정의
         *  - 임의 변수값이 1이면 월요일
         *                  2이면 화요일
         *                  3이면 수요일
         *                  그 외 기타요일 출력
        */
        int i = 3;

        switch (i) {
            case 1 -> System.out.println("월요일");
            case 2 -> System.out.println("화요일");
            case 3 -> System.out.println("수요일");
            default -> System.out.println("기타요일");
        }

        System.out.println("\n ----------------------------------- \n");

        /* 임의 변수에 임의 값을 정의
         * 임의 변수값이 짝수이면 짝수입니다, 홀수이면 홀수입니다 출력하기
        */

        int j = 5;
        switch (j % 2) {
            case 0 -> System.out.println("짝수 입니다.");
            case 1 -> System.out.println("홀수 입니다.");
        }
    }
}
